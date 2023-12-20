@file:Suppress("unused")

package com.shifthackz.catppuccin.compose

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.graphics.luminance
import androidx.core.view.WindowCompat
import com.shifthackz.catppuccin.palette.Catppuccin
import com.shifthackz.catppuccin.palette.CatppuccinPalette

/**
 * Provides different Catppuccin compose material theme builders.
 *
 * @author ShiftHackZ
 * @since  0.0.1
 */
object CatppuccinTheme {

    /**
     * Catppuccin dark/light theme.
     *
     * @param darkTheme Sets if [darkPalette] should be used, by default inherits the context
     * value from [isSystemInDarkTheme].
     * @param darkPalette [CatppuccinPalette] that will be used if [darkTheme] is true.
     * @param lightPalette [CatppuccinPalette] that will be used if [darkTheme] is false.
     * @param content Child composable UI to theme.
     *
     * @author ShiftHackZ
     * @since  0.0.1
     */
    @Composable
    fun DarkLightPalette(
        darkTheme: Boolean = isSystemInDarkTheme(),
        darkPalette: CatppuccinPalette = Catppuccin.Mocha,
        lightPalette: CatppuccinPalette = Catppuccin.Latte,
        content: @Composable () -> Unit,
    ) {
        return Palette(
            palette = if (darkTheme) darkPalette else lightPalette,
            content = content,
        )
    }

    /**
     * Catppuccin theme with flavor [palette].
     *
     * @param palette Instance of [CatppuccinPalette] or [CatppuccinMaterial] that defines the
     * color scheme.
     * @param content Child composable UI to theme.
     *
     * @author ShiftHackZ
     * @since  0.0.1
     */
    @Composable
    fun Palette(
        palette: CatppuccinPalette = Catppuccin.Latte,
        content: @Composable () -> Unit,
    ) {
        val colorScheme = if (palette is CatppuccinMaterial) {
            palette.materialColorScheme()
        } else {
            palette.colorScheme()
        }
        val isAppearanceLightStatusBars = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            colorScheme.background.toArgb().luminance > 0.5f
        } else {
            palette == Catppuccin.Latte
        }
        return Custom(
            colorScheme = colorScheme,
            typography = palette.typography(),
            isAppearanceLightStatusBars = isAppearanceLightStatusBars,
            content = content,
        )
    }

    /**
     * Catppuccin theme with custom material [colorScheme], [typography] and [shapes].
     *
     * @param colorScheme A complete definition of the Material Color theme for this hierarchy.
     * @param typography A set of text styles to be used as this hierarchy's typography system.
     * @param shapes A set of corner shapes to be used as this hierarchy's shape system.
     * @param isAppearanceLightStatusBars If true, changes the foreground color of the status bars
     * to light so that the items on the bar can be read clearly.
     * @param content Child composable UI to theme.
     *
     * @author ShiftHackZ
     * @since  0.0.1
     */
    @Composable
    fun Custom(
        colorScheme: ColorScheme = Catppuccin.Latte.colorScheme(),
        typography: Typography = Catppuccin.Latte.typography(),
        shapes: Shapes = MaterialTheme.shapes,
        isAppearanceLightStatusBars: Boolean,
        content: @Composable () -> Unit,
    ) {
        val view = LocalView.current
        if (!view.isInEditMode) {
            SideEffect {
                val window = (view.context as Activity).window
                val statusBarColor = colorScheme.surface.toArgb()
                window.statusBarColor = statusBarColor
                WindowCompat
                    .getInsetsController(window, view)
                    .isAppearanceLightStatusBars = isAppearanceLightStatusBars
            }
        }
        return MaterialTheme(
            colorScheme = colorScheme,
            typography = typography,
            shapes = shapes,
            content = content,
        )
    }
}
