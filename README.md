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

## Library structure

The library is divided into separate modules, so you can implement only those that you need in your app for certain feature implementation.

### Palette

Implements Catppuccin color palette: Catppuccin.Latte, Catppuccin.Frappe, Catppuccin.Macchiato, Catppuccin.Mocha.

```
dependencies {
    implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:palette:<VERSION>'
}
```

### Compose

Implements Android Jetpack Compose Catppuccin material themes.

```
dependencies {
    implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:compose:<VERSION>'
}
```

### Splashscreen

Implements basic XML themes for `androidx.core.core-splashscreen` library: 
- Theme.Catppuccin.Latte.SplashScreen
- Theme.Catppuccin.Frappe.SplashScreen
- Theme.Catppuccin.Macchiato.SplashScreen
- Theme.Catppuccin.Mocha.SplashScreen

```
dependencies {
    implementation 'com.github.ShiftHackZ.Catppuccin-Android-Library:splashscreen:<VERSION>'
}
```

## Examples

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

To pick needed theme form Catppuccin material themes call `CatppuccinTheme.<Theme>`, there are 3 available themes:
- CatppuccinTheme.DarkLightPalette
- CatppuccinTheme.
- CatppuccinTheme.

<p align="center"><img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/footers/gray0_ctp_on_line.svg?sanitize=true" /></p>
<p align="center">Copyright &copy; 2023-present <a href="https://moroz.cc" target="_blank">Dmitriy Moroz</a>, <a href="https://github.com/catppuccin" target="_blank">Catppuccin Org</a>
<p align="center"><a href="https://github.com/catppuccin/catppuccin/blob/main/LICENSE"><img src="https://img.shields.io/static/v1.svg?style=for-the-badge&label=License&message=MIT&logoColor=d9e0ee&colorA=302d41&colorB=b7bdf8"/></a></p>
