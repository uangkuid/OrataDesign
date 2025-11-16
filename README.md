# Orata Design System

A comprehensive Design System built with **Kotlin Multiplatform** and **Compose Multiplatform**, providing a consistent and beautiful UI experience across Android, iOS, Web, and Desktop platforms.

## 📱 Overview

Orata Design System is a modern, cross-platform design system that enables developers to build beautiful and consistent user interfaces across multiple platforms using a single codebase. Built on top of Compose Multiplatform, it provides a rich set of customizable components, typography styles, and color schemes that follow Material Design 3 principles.

## ✨ Features

- **🎨 Comprehensive Design Tokens**: Complete typography and color system with predefined tokens
- **🧩 Reusable Components**: Pre-built UI components like buttons, text fields, and more
- **🌈 Theming Support**: Light and dark theme support with dynamic color capabilities
- **📐 Typography System**: Rich typography scale with Display, Headline, Title, Label, and Body styles
- **🎯 Type-Safe APIs**: Fully type-safe Kotlin APIs for better developer experience
- **♿ Accessibility**: Built with accessibility in mind following platform best practices
- **🔄 Cross-Platform**: Single codebase for Android, iOS, Web, and Desktop

## 🚀 Supported Platforms

- **Android** (Min SDK 24+)
- **iOS** (iOS 14+)
- **Desktop** (JVM - Windows, macOS, Linux)
- **Web** (WebAssembly/Wasm)

## 🏗️ Project Structure

```
OrataDesign/
├── composeApp/                          # Main application module
│   └── src/
│       ├── commonMain/                  # Shared code for all platforms
│       │   └── kotlin/
│       │       └── com/oratakashi/design/
│       │           ├── foundation/      # Core design system elements
│       │           │   ├── color/       # Color tokens and schemes
│       │           │   └── typography/  # Typography system
│       │           ├── component/       # Reusable UI components
│       │           │   └── button/      # Button component variants
│       │           └── app/             # Demo application
│       ├── androidMain/                 # Android-specific code
│       ├── iosMain/                     # iOS-specific code
│       ├── jvmMain/                     # Desktop-specific code
│       └── wasmJsMain/                  # Web-specific code
└── iosApp/                              # iOS application entry point
```

## 🎨 Design System Components

### Foundation

#### Typography
The design system includes a comprehensive typography scale:
- **Display**: Large, Medium, Small (57sp - 36sp) - Using Montserrat font
- **Headline**: Large, Medium, Small (32sp - 24sp) - Using Poppins font
- **Title**: Large, Medium, Small (22sp - 14sp) - Using Poppins font
- **Label**: Large, Medium, Small - For UI labels
- **Body**: Large, Medium, Small - For body text

#### Colors
Complete color system supporting:
- Primary, Secondary, Tertiary color schemes
- Container colors and their variants
- Surface colors with different elevation levels
- Error states
- Outline variants
- Dynamic color support on supported platforms

### Components

#### Buttons
Multiple button variants available:
- **Solid Button**: Filled background with primary color
- **Tonal Button**: Tonal variant with container colors
- **Outline Button**: Outlined style with transparent background
- **Transparent Button**: Text-only button
- Customizable sizes, colors, and states (enabled, loading)
- Support for leading and trailing icons

## 📦 Getting Started

### Prerequisites

- JDK 11 or higher
- Android Studio (for Android development)
- Xcode (for iOS development)
- Gradle 8.0+

### Building the Project

1. **Clone the repository**
   ```bash
   git clone https://github.com/uangkuid/OrataDesign.git
   cd OrataDesign
   ```

2. **Build for Android**
   ```bash
   ./gradlew :composeApp:assembleDebug
   ```

3. **Build for Desktop**
   ```bash
   ./gradlew :composeApp:run
   ```

4. **Build for iOS**
   - Open `iosApp/iosApp.xcodeproj` in Xcode
   - Select your target device
   - Build and run

5. **Build for Web**
   ```bash
   ./gradlew :composeApp:wasmJsBrowserDevelopmentRun
   ```

## 💻 Usage Example

### Using the Theme

```kotlin
import com.oratakashi.design.foundation.OrataTheme

@Composable
fun MyApp() {
    OrataTheme(
        darkTheme = false,
        dynamicColor = true
    ) {
        // Your app content here
        MyScreen()
    }
}
```

### Using Typography

```kotlin
import com.oratakashi.design.foundation.OrataTheme

@Composable
fun MyScreen() {
    Column {
        Text(
            text = "Headline",
            style = OrataTheme.typography.headlineLarge()
        )
        Text(
            text = "Body text",
            style = OrataTheme.typography.bodyMedium()
        )
    }
}
```

### Using Components

```kotlin
import com.oratakashi.design.component.button.OraButton
import com.oratakashi.design.component.button.OraButtonDefaults

@Composable
fun MyButton() {
    OraButton(
        onClick = { /* Handle click */ },
        label = "Click Me",
        style = OraButtonDefaults.buttonSolidColors(),
        size = OraButtonDefaults.size,
        enabled = true
    )
}
```

### Using Colors

```kotlin
import com.oratakashi.design.foundation.OrataTheme

@Composable
fun ColoredBox() {
    Box(
        modifier = Modifier
            .background(OrataTheme.colors.primary)
            .padding(16.dp)
    ) {
        Text(
            text = "Colored Text",
            color = OrataTheme.colors.onPrimary
        )
    }
}
```

## 🛠️ Technology Stack

- **Kotlin** 2.2.20
- **Compose Multiplatform** 1.10.0-alpha01
- **Material 3** 1.10.0-alpha01
- **Kotlin Coroutines** 1.10.2
- **Navigation Compose** 2.9.0
- **Kotlinx Serialization** 1.9.0

## 📖 Documentation

The codebase includes comprehensive KDoc comments for all public APIs following a consistent format:

```kotlin
/**
 * [Function/Class description]
 * @author oratakashi
 * @since [Date]
 * @param [parameter] [parameter description] (if applicable)
 * @return [return description] (if applicable)
 */
```

Key documentation locations:

- **Typography System**: `composeApp/src/commonMain/kotlin/com/oratakashi/design/foundation/typography/`
  - Complete typography scale with Display, Headline, Title, Label, and Body styles
  - Font family configurations and text style providers
  
- **Color System**: `composeApp/src/commonMain/kotlin/com/oratakashi/design/foundation/color/`
  - Color schemes for light and dark themes
  - Palette tokens and color scheme key tokens
  - Dynamic color support for supported platforms
  
- **Components**: `composeApp/src/commonMain/kotlin/com/oratakashi/design/component/`
  - **Buttons** (`button/`): OraButton, OraTonalButton, OraOutlineButton, OraTransparentButton
  - **Alerts** (`alert/`): OraAlert, OraSuccessAlert, OraInfoAlert, OraWarningAlert, OraErrorAlert
  - **Text Fields** (`textfield/`): OraTextField with customizable states and sizes
  - **Anchor Text** (`anchortext/`): OraAnchorText for interactive text links
  - **Snackbar** (`snackbar/`): OraSnackbar for temporary notifications

All functions include detailed parameter descriptions and usage examples in the KDoc comments.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

### Development Guidelines

1. Follow the existing code style and conventions
2. Add KDoc comments for public APIs
3. Test your changes on all supported platforms when possible
4. Update documentation as needed

## 📄 License

This project is available for use and modification. Please check the repository for specific license information.

## 👨‍💻 Author

**oratakashi**

## 🔗 Resources

- [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)
- [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/)
- [Material Design 3](https://m3.material.io/)
- [Kotlin/Wasm](https://kotl.in/wasm/)

---

Made with ❤️ using Kotlin Multiplatform
