package com.shifthackz.catppuccin.compose

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import com.shifthackz.catppuccin.palette.CatppuccinPalette

internal fun Color.inverse(): Color {
    return Color(
        red = 1f - red,
        green = 1f - green,
        blue = 1f - blue,
        alpha = alpha,
    )
}

fun CatppuccinPalette.colorScheme(
    primary: Color = Teal,
    onPrimary: Color = Base,
    primaryContainer: Color = Teal,
    onPrimaryContainer: Color = Base,
    inversePrimary: Color = primary.inverse(),
    secondary: Color = Sky,
    onSecondary: Color = Mantle,
    secondaryContainer: Color = Sky,
    onSecondaryContainer: Color = Mantle,
    tertiary: Color = Sapphire,
    onTertiary: Color = Base,
    tertiaryContainer: Color = Sapphire,
    onTertiaryContainer: Color = Base,
    background: Color = Base,
    onBackground: Color = Text,
    surface: Color = Surface0,
    onSurface: Color = surface.inverse(),
    surfaceVariant: Color = Surface1,
    onSurfaceVariant: Color = Surface1.inverse(),
    surfaceTint: Color = Surface2,
    inverseSurface: Color = surface.inverse(),
    inverseOnSurface: Color = onSurface.inverse(),
    error: Color = Red,
    onError: Color = Red.inverse(),
    errorContainer: Color = Rosewater,
    onErrorContainer: Color = Rosewater.inverse(),
    outline: Color = Overlay0,
    outlineVariant: Color = Overlay1,
    scrim: Color = Crust,
): ColorScheme {
    return ColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        inversePrimary = inversePrimary,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
        inverseSurface = inverseSurface,
        inverseOnSurface = inverseOnSurface,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim,
    )
}

fun CatppuccinPalette.typography(): Typography {
    return Typography(
        displayLarge = Typography().displayLarge.copy(
            color = Text,
        ),
        displayMedium = Typography().displayMedium.copy(
            color = Text,
        ),
        displaySmall = Typography().displaySmall.copy(
            color = Text,
        ),
        headlineLarge = Typography().headlineLarge.copy(
            color = Text,
        ),
        headlineMedium = Typography().headlineMedium.copy(
            color = Text,
        ),
        headlineSmall  = Typography().headlineSmall.copy(
            color = Text,
        ),
        titleLarge = Typography().titleLarge.copy(
            color = Text,
        ),
        titleMedium = Typography().titleMedium.copy(
            color = Text,
        ),
        titleSmall = Typography().titleSmall.copy(
            color = Text,
        ),
        bodyLarge = Typography().bodyLarge.copy(
            color = Subtext1,
        ),
        bodyMedium = Typography().bodyMedium.copy(
            color = Subtext1,
        ),
        bodySmall = Typography().bodySmall.copy(
            color = Subtext1,
        ),
        labelLarge = Typography().labelLarge.copy(
            color = Subtext0,
        ),
        labelMedium = Typography().labelMedium.copy(
            color = Subtext0,
        ),
        labelSmall = Typography().labelSmall.copy(
            color = Subtext0,
        ),
    )
}
