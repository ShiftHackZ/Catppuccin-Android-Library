<h3 align="center">
  <img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/logos/exports/1544x1544_circle.png" width="100" alt="Logo"/><br/>
  <img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/misc/transparent.png" height="30" width="0px"/>
  Catppuccin Android Library
  <img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/misc/transparent.png" height="30" width="0px"/>
</h3>

<p align="center">
  <img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/palette/macchiato.png" width="400" />
</p>


<p align="center">
  <a href="https://jitpack.io/#ShiftHackZ/Catppuccin-Android-Library">
    <img src="https://jitpack.io/v/ShiftHackZ/Catppuccin-Android-Library.svg" />
  </a>
</p>

<p align="center">
Catppuccin Android Library provides a fast and easy way for Android Developers to implement <a href="https://github.com/catppuccin/catppuccin">Catppuccin</a> pastel theme in Android Applications.
</p>

<p align="center">
  <img src="https://raw.githubusercontent.com/ShiftHackZ/Catppuccin-Android-Library/main/docs/assets/catppuccin1.png" width="220" />
  <img src="https://raw.githubusercontent.com/ShiftHackZ/Catppuccin-Android-Library/main/docs/assets/catppuccin2.png" width="220" />
  <img src="https://raw.githubusercontent.com/ShiftHackZ/Catppuccin-Android-Library/main/docs/assets/catppuccin3.png" width="220" />	
</p>

## 💭 Library structure

The library is divided into separate modules, so you can implement only those that you need in your app for certain feature implementation.

To implement this library, add jitpack.io repository in your project level build.gradle:

```
buildscript {
    repositories {
        maven { setUrl("https://jitpack.io") }
    }
}
```

Then add all or only needed library module dependencies to your module level build gradle:

```
dependencies {
    implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:palette:<VERSION>'
    implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:compose:<VERSION>'
    implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:splashscreen:<VERSION>'
}
```

### Palette

Implements Catppuccin color palette: Catppuccin.Latte, Catppuccin.Frappe, Catppuccin.Macchiato, Catppuccin.Mocha.

```
implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:palette:<VERSION>'
```

### Compose

Implements Android Jetpack Compose Catppuccin material themes.

```
implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:compose:<VERSION>'
```

### Splashscreen

Implements basic XML themes for `androidx.core.core-splashscreen` library: 
- Theme.Catppuccin.Latte.SplashScreen
- Theme.Catppuccin.Frappe.SplashScreen
- Theme.Catppuccin.Macchiato.SplashScreen
- Theme.Catppuccin.Mocha.SplashScreen

```
implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:splashscreen:<VERSION>'
```

## 👾 Examples

### Palette

To pick needed color from the Catppuccin Palette call `Catppuccin.<Flavor>.<Color>`, for example:

```kotlin
@Composable
fun RedText(text: String) {
    val color = Catppuccin.Frappe.Red
    Text(
        text = text,
        color = color,
    )
}
```

### Compose material themes

#### Themes overview

To pick needed theme form Catppuccin material themes call `CatppuccinTheme.<Theme>`, there are 3 available themes:
- `CatppuccinTheme.DarkLightPalette` - takes two Catppuccin Paletes for dark and light mode and handles theming.
- `CatppuccinTheme.Palette` - takes Catpuccin Palette and handles theming.
- `CatppuccinTheme.Custom` - allows to define theme with fully custom ColorScheme, Typography, Shapes.

To theme the whole application, you can follow this example code in your Activity:

```kotlin
class CatppuccinActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatppuccinTheme.Palette(
                palette = Catppuccin.Frappe,
            ) {
                 // Put your composable content here.
            }
        }
    }
}
```

#### Theme Palette customization

There is a quick way to customize theme palette with certain main material colors (primary, secondary, etc).

For this purpose construct your palette by call `CatppuccinMaterial.<Flavor>()`, for example:

```kotlin
class CatppuccinActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatppuccinTheme.Palette(
                palette = CatppuccinMaterial.Frappe(
                    primary = Catppuccin.Frappe.Blue,
                    secondary = Catppuccin.Frappe.Lavender,
                )
            ) {
                 // Put your composable content here.
            }
        }
    }
}
```

### Splashscreen

The splashscreen module implements basic Catppuccin styles to theme `androidx.core.core-splashscreen` library. 

Core splashscreen documentation can be found here: [https://developer.android.com/develop/ui/views/launch/splash-screen](https://developer.android.com/develop/ui/views/launch/splash-screen)

To define your custom your custom Splash theme, you can set as a parent `Theme.Catppuccin.<Flavor>.SplashScreen`, there are 4 themes available:
- Theme.Catppuccin.Latte.SplashScreen
- Theme.Catppuccin.Frappe.SplashScreen
- Theme.Catppuccin.Macchiato.SplashScreen
- Theme.Catppuccin.Mocha.SplashScreen

Example of SplashTheme:

```xml
<style name="Theme.App.Starting" parent="Theme.Catppuccin.Frappe.SplashScreen">
    <item name="windowSplashScreenAnimatedIcon">@drawable/catppuccin</item>
    <item name="windowSplashScreenAnimationDuration">500</item>
    <item name="postSplashScreenTheme">@style/Theme.Catppuccin</item>
</style>
```

Then define this theme in `android:theme` attribute in AndroidManifest.xml inside <application> or <activity> tag, for example:

```xml
...
<application
    ...
    android:theme="@style/Theme.Catppuccin.Splash">
    ...
</application>
...
```

### ❤️ Gratitude

Thanks to the [Catppuccin community](https://github.com/catppuccin/catppuccin) for this amazing soothing pastel theme which is the only theme that is pleasant to my eyes.


<br><br><br>

<p align="center"><img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/footers/gray0_ctp_on_line.svg?sanitize=true" /></p>
<p align="center">Copyright &copy; 2023-present <a href="https://moroz.cc" target="_blank">Dmitriy Moroz</a>, <a href="https://github.com/catppuccin" target="_blank">Catppuccin Org</a>
<p align="center"><a href="https://github.com/catppuccin/catppuccin/blob/main/LICENSE"><img src="https://img.shields.io/static/v1.svg?style=for-the-badge&label=License&message=MIT&logoColor=d9e0ee&colorA=302d41&colorB=b7bdf8"/></a></p>
