# Orata Design System

A comprehensive Kotlin Multiplatform design system built with Compose Multiplatform, targeting Android, iOS, Web, and Desktop platforms.

## Features

- 🎨 **Comprehensive Design System**: Typography, colors, and component tokens
- 🌐 **Multiplatform Support**: Android, iOS, JVM (Desktop), and WASM-JS (Web)
- 🎯 **Compose Multiplatform**: Built with the latest Compose Multiplatform
- 📦 **Maven Central**: Published and ready to use in your projects

## Installation

Add the dependency to your `build.gradle.kts` file:

```kotlin
dependencies {
    implementation("com.oratakashi:orata-design:1.0.0-alpha01")
}
```

## Usage

### Basic Theme Setup

```kotlin
import com.oratakashi.design.foundation.OrataTheme

@Composable
fun App() {
    OrataTheme {
        // Your app content
        Text("Hello Orata Design!")
    }
}
```

### Using Design Tokens

```kotlin
import com.oratakashi.design.foundation.OrataTheme

@Composable
fun MyComponent() {
    Text(
        text = "Styled with Orata",
        style = OrataTheme.typography.headlineLarge(),
        color = OrataTheme.colors.primary
    )
}
```

## Development

This project contains:

* [/design-system](./design-system/src) - The published design system library
* [/composeApp](./composeApp/src) - Demo application showcasing the design system
  - [commonMain](./composeApp/src/commonMain/kotlin) - Common code for all targets
  - Platform-specific folders for platform-specific implementations

### Building the Library

```bash
./gradlew :design-system:build
```

### Publishing Locally

```bash
./gradlew :design-system:publishToMavenLocal
```

### Running the Demo App

```bash
# Desktop
./gradlew :composeApp:run

# Web
./gradlew :composeApp:wasmJsBrowserDevelopmentRun
```

## Publishing to Maven Central

The library is automatically published to Maven Central via GitHub Actions when:

1. **Manual Release**: Use the "Publish to Maven Central" workflow in GitHub Actions
2. **Tagged Release**: Push a tag with format `v*` (e.g., `v1.0.0`)

### Required Secrets

Set up the following secrets in your GitHub repository:

- `OSSRH_USERNAME`: Your Sonatype OSSRH username
- `OSSRH_PASSWORD`: Your Sonatype OSSRH password  
- `GPG_PRIVATE_KEY`: Your GPG private key for signing
- `GPG_PASSPHRASE`: Your GPG key passphrase
- `SIGNING_KEY_ID`: Your GPG key ID
- `SIGNING_PASSWORD`: Your GPG signing password

### Local Publishing Setup

Add these properties to your local `gradle.properties`:

```properties
ossrhUsername=your-sonatype-username
ossrhPassword=your-sonatype-password
signing.keyId=your-gpg-key-id
signing.password=your-gpg-key-password
signing.secretKeyRingFile=/path/to/your/secring.gpg
```

## Architecture

The design system follows Material Design 3 principles and includes:

- **Typography System**: Comprehensive typography scale with Poppins font family
- **Color System**: Dynamic and semantic color tokens
- **Component Tokens**: Reusable design tokens for consistent styling

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Platform Support

| Platform | Status | Notes |
|----------|--------|-------|
| JVM (Desktop) | ✅ Supported | Full support with Compose Desktop |
| WASM-JS (Web) | ✅ Supported | Modern web browsers |
| Android | 🚀 Coming Soon | Will be added in future releases |
| iOS | 🚀 Coming Soon | Will be added in future releases |

## Learn More

- [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)
- [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform)
- [Material Design 3](https://m3.material.io/)

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.
