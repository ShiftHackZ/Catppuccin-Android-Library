package com.shifthackz.catppuccin.compose

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import com.shifthackz.catppuccin.palette.CatppuccinPalette

/**
 * Returns a new instance of this [Color] that is inverted.
 *
 * @return inverted value of this [Color].
 *
 * @author ShiftHackZ
 * @since  0.0.1
 */
fun Color.inverse(): Color {
    return Color(
        red = 1f - red,
        green = 1f - green,
        blue = 1f - blue,
        alpha = alpha,
    )
}

fun CatppuccinMaterial.materialColorScheme(): ColorScheme {
    return this.colorScheme(
        primary = primaryColor,
        secondary = secondaryColor,
        tertiary = tertiaryColor,
        error = errorColor,
    )
}

/**
 * Returns new instance of [ColorScheme] according to this [CatppuccinPalette] that can be applied
 * to [MaterialTheme].
 *
 * This function contains default parameters from [CatppuccinPalette], but also provides you a way
 * to override them, so you have full control to customize your [ColorScheme].
 *
 * @param primary The primary color is the color displayed most frequently across your app’s
 * screens and components.
 * @param onPrimary Color used for text and icons displayed on top of the primary color.
 * @param primaryContainer The preferred tonal color of containers.
 * @param onPrimaryContainer The color (and state variants) that should be used for content on
 * top of [primaryContainer].
 * @param inversePrimary Color to be used as a "primary" color in places where the inverse color
 * scheme is needed, such as the button on a SnackBar.
 * @param secondary The secondary color provides more ways to accent and distinguish your
 * product. Secondary colors are best for:
 * - Floating action buttons
 * - Selection controls, like checkboxes and radio buttons
 * - Highlighting selected text
 * - Links and headlines
 * @param onSecondary Color used for text and icons displayed on top of the secondary color.
 * @param secondaryContainer A tonal color to be used in containers.
 * @param onSecondaryContainer The color (and state variants) that should be used for content on
 * top of [secondaryContainer].
 * @param tertiary The tertiary color that can be used to balance primary and secondary
 * colors, or bring heightened attention to an element such as an input field.
 * @param onTertiary Color used for text and icons displayed on top of the tertiary color.
 * @param tertiaryContainer A tonal color to be used in containers.
 * @param onTertiaryContainer The color (and state variants) that should be used for content on
 * top of [tertiaryContainer].
 * @param background The background color that appears behind scrollable content.
 * @param onBackground Color used for text and icons displayed on top of the background color.
 * @param surface The surface color that affect surfaces of components, such as cards, sheets,
 * and menus.
 * @param onSurface Color used for text and icons displayed on top of the surface color.
 * @param surfaceVariant Another option for a color with similar uses of [surface].
 * @param onSurfaceVariant The color (and state variants) that can be used for content on top of
 * [surface].
 * @param surfaceTint This color will be used by components that apply tonal elevation and is
 * applied on top of [surface]. The higher the elevation the more this color is used.
 * @param inverseSurface A color that contrasts sharply with [surface]. Useful for surfaces that
 * sit on top of other surfaces with [surface] color.
 * @param inverseOnSurface A color that contrasts well with [inverseSurface]. Useful for content
 * that sits on top of containers that are [inverseSurface].
 * @param error The error color is used to indicate errors in components, such as invalid text in
 * a text field.
 * @param onError Color used for text and icons displayed on top of the error color.
 * @param errorContainer The preferred tonal color of error containers.
 * @param onErrorContainer The color (and state variants) that should be used for content on
 * top of [errorContainer].
 * @param outline Subtle color used for boundaries. Outline color role adds contrast for
 * accessibility purposes.
 * @param outlineVariant Utility color used for boundaries for decorative elements when strong
 * contrast is not required.
 * @param scrim Color of a scrim that obscures content.
 *
 * @return new instance of [Typography].
 *
 * @author ShiftHackZ
 * @since  0.0.1
 */
fun CatppuccinPalette.colorScheme(
    primary: Color = Teal,
    onPrimary: Color = Base,
    primaryContainer: Color = Teal,
    onPrimaryContainer: Color = Base,
    inversePrimary: Color = primary.inverse(),
    secondary: Color = Sapphire,
    onSecondary: Color = Mantle,
    secondaryContainer: Color = secondary,
    onSecondaryContainer: Color = Mantle,
    tertiary: Color = Sky,
    onTertiary: Color = Base,
    tertiaryContainer: Color = Sky,
    onTertiaryContainer: Color = Base,
    background: Color = Base,
    onBackground: Color = Text,
    surface: Color = Mantle,
    onSurface: Color = surface.inverse(),
    surfaceVariant: Color = Mantle,
    onSurfaceVariant: Color = surfaceVariant.inverse(),
    surfaceTint: Color = Crust,
    inverseSurface: Color = surface.inverse(),
    inverseOnSurface: Color = onSurface.inverse(),
    error: Color = Red,
    onError: Color = Red.inverse(),
    errorContainer: Color = Rosewater,
    onErrorContainer: Color = Rosewater.inverse(),
    outline: Color = primary,
    outlineVariant: Color = secondary,
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

/**
 * Returns new instance of [Typography] according to this [CatppuccinPalette] that can be applied
 * to [MaterialTheme].
 *
 * @return new instance of [Typography].
 *
 * @author ShiftHackZ
 * @since  0.0.1
 */
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
            color = Subtext1,
        ),
        titleMedium = Typography().titleMedium.copy(
            color = Subtext1,
        ),
        titleSmall = Typography().titleSmall.copy(
            color = Subtext1,
        ),
        bodyLarge = Typography().bodyLarge.copy(
            color = Subtext0,
        ),
        bodyMedium = Typography().bodyMedium.copy(
            color = Subtext0,
        ),
        bodySmall = Typography().bodySmall.copy(
            color = Subtext0,
        ),
        labelLarge = Typography().labelLarge.copy(
            color = Overlay1,
        ),
        labelMedium = Typography().labelMedium.copy(
            color = Overlay1,
        ),
        labelSmall = Typography().labelSmall.copy(
            color = Overlay1,
        ),
    )
}
