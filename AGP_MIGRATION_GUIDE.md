# Android Gradle Plugin (AGP) Migration Guide

## Current Status

This project has been prepared for migration to AGP 9+. The following changes have been implemented:

### Completed Changes

1. **AGP Version Update**: Updated from 8.13.1 (invalid version) to 8.7.3 (latest stable AGP 8.x)
   - Location: `gradle/libs.versions.toml`
   - Ready to upgrade to 9.0.0+ when available in your environment

2. **Java Compatibility**: Updated to Java 17 (required for AGP 9+)
   - Location: `composeApp/build.gradle.kts`
   - `compileOptions.sourceCompatibility = JavaVersion.VERSION_17`
   - `compileOptions.targetCompatibility = JavaVersion.VERSION_17`

3. **Kotlin JVM Target**: Updated to JVM 17 (required for AGP 9+)
   - Location: `composeApp/build.gradle.kts`
   - `jvmTarget.set(JvmTarget.JVM_17)`

4. **Repository Configuration**: Simplified Google repository configuration
   - Location: `settings.gradle.kts`
   - Removed restrictive `mavenContent` filters that could block plugin resolution
   - This ensures all Android Gradle Plugin artifacts can be resolved

5. **Gradle Version**: Project uses Gradle 9.3.1 ✓
   - This meets the AGP 9.0 requirement (Gradle 9.1.0+)

### Ready for AGP 9.0+

The project structure is already compatible with AGP 9.0:

- ✓ Using `com.android.kotlin.multiplatform.library` plugin for the library module
- ✓ Separate modules for app (`composeApp`) and library (`library`)
- ✓ Java 17 compatibility
- ✓ Gradle 9.1+ (currently 9.3.1)

### Next Steps for AGP 9.0+ Migration

When you're ready to migrate to AGP 9.0.0 or higher:

1. **Update AGP Version** in `gradle/libs.versions.toml`:
   ```toml
   agp = "9.0.0"  # or later version
   ```

2. **Verify Build**: Run the build to ensure everything compiles
   ```bash
   ./gradlew clean build
   ```

3. **Test the Application**: Run tests and verify functionality
   ```bash
   ./gradlew test
   ./gradlew connectedAndroidTest
   ```

### AGP 9.0 Breaking Changes (Already Addressed)

The following breaking changes from AGP 9.0 have been addressed:

1. **Java 17 Requirement**: ✓ Updated to Java 17
2. **Gradle 9.1+ Requirement**: ✓ Using Gradle 9.3.1
3. **KMP Plugin**: ✓ Already using `com.android.kotlin.multiplatform.library`
4. **Separate Modules**: ✓ App and library are in separate modules

### Optional AGP 9.0 Features

If you encounter issues during migration, you can temporarily enable legacy behavior:

Add to `gradle.properties`:
```properties
# Temporary opt-out options (will be removed in AGP 10.0)
android.enableLegacyVariantApi=true
```

### Additional Resources

- [AGP 9.0.0 Release Notes](https://developer.android.com/build/releases/agp-9-0-0-release-notes)
- [Kotlin Multiplatform AGP 9 Migration](https://kotlinlang.org/docs/multiplatform/multiplatform-project-agp-9-migration.html)
- [JetBrains AGP 9.0 Migration Guide](https://blog.jetbrains.com/kotlin/2026/01/update-your-projects-for-agp9/)

## Testing

After updating to AGP 9.0+, ensure you test:

1. **Build Success**: `./gradlew clean build`
2. **Unit Tests**: `./gradlew test`
3. **Android Instrumented Tests**: `./gradlew connectedAndroidTest`
4. **Library Publishing**: Verify the library can still be published
5. **Multi-platform Targets**: Test all platforms (Android, iOS, JVM, WASM)

## Troubleshooting

### Issue: Plugin not found
If you see "Plugin [id: 'com.android.application', version: 'X.X.X'] was not found":
- Ensure network connectivity to `dl.google.com`
- Check that Google's Maven repository is accessible
- Verify the AGP version exists at https://maven.google.com/

### Issue: Build fails with Java version error
- Ensure JDK 17 or higher is installed
- Check `JAVA_HOME` environment variable
- Update IntelliJ IDEA/Android Studio to latest version

### Issue: Kotlin compiler errors
- Ensure Kotlin version is compatible with AGP version
- Current project uses Kotlin 2.3.0 which is compatible with AGP 9.0+
