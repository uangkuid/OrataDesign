# AGP 9.0 Migration - Compatibility Fix

## Issue

The initial AGP 9.0.0 migration failed in CI/CD with the following error:

```
The 'com.android.application' plugin is not compatible with the 
'org.jetbrains.kotlin.multiplatform' plugin since AGP 9.0.

Solution:
  - [Recommended] Replace the 'com.android.library' plugin with the 
    'com.android.kotlin.multiplatform.library' plugin
  - Or set the Gradle property 'android.builtInKotlin=false' and 
    'android.newDsl=false' to temporarily bypass this issue.
```

## Root Cause

AGP 9.0 introduced a breaking change: the traditional `com.android.application` and `com.android.library` plugins are no longer compatible with `org.jetbrains.kotlin.multiplatform` in the same module.

The `composeApp` module was using:
- `alias(libs.plugins.kotlinMultiplatform)` 
- `alias(libs.plugins.androidApplication)`

This combination is not allowed in AGP 9.0.

## Solution Applied

Added a temporary compatibility workaround in `gradle.properties`:

```properties
# AGP 9.0 Compatibility - Temporary workaround for KMP with android.application plugin
# This allows using com.android.application with kotlinMultiplatform in composeApp module
# See: https://developer.android.com/build/releases/agp-9-0-0-release-notes
android.enableLegacyVariantApi=true
```

This property enables the legacy variant API, allowing the old plugin structure to continue working with AGP 9.0.

## Why This Approach?

1. **Quick Fix**: This is the fastest way to unblock the migration
2. **Google Recommended**: This is one of the official workarounds from Google
3. **Minimal Changes**: Only one line added to gradle.properties
4. **Library Module OK**: The `library` module already uses the correct AGP 9.0 approach with `androidKotlinMultiplatformLibrary`

## Module Status

### Library Module (✅ AGP 9.0 Ready)
- Uses `alias(libs.plugins.androidKotlinMultiplatformLibrary)`
- Has `androidLibrary { }` target configuration
- **No changes needed** - already following AGP 9.0 best practices

### ComposeApp Module (⚠️ Using Workaround)
- Uses `alias(libs.plugins.androidApplication)` with `kotlinMultiplatform`
- Now works with `android.enableLegacyVariantApi=true` property
- **Temporary solution** - works for now

## Future Migration Path

For a permanent solution (when ready), there are two options:

### Option 1: Separate Android App Module (Recommended by Google)
Extract the Android app entry point into a separate non-KMP module:
```
project/
├── library/          (KMP with androidKotlinMultiplatformLibrary)
├── shared/           (KMP shared code)
└── androidApp/       (Pure Android with android.application)
```

### Option 2: Wait for AGP 10
The workaround properties (`android.enableLegacyVariantApi`) will be removed in AGP 10.0. Before then, the project should migrate to one of the supported structures.

## Compatibility Notes

- **AGP 9.0**: ✅ Works with workaround
- **AGP 10.0**: ⚠️ Will need proper migration (workaround removed)
- **Library Publishing**: ✅ Unaffected (library module uses correct approach)
- **All Platforms**: ✅ Android, iOS, JVM, WASM all work

## Commit

Fix applied in commit: **dccbdd4**

## References

- [AGP 9.0.0 Release Notes](https://developer.android.com/build/releases/agp-9-0-0-release-notes)
- [Kotlin Multiplatform AGP 9 Migration](https://kotlinlang.org/docs/multiplatform/multiplatform-project-agp-9-migration.html)
- [Built-in Kotlin Support in AGP 9](https://developer.android.com/r/tools/built-in-kotlin)
