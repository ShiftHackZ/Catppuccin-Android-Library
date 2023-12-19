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

object CatppuccinTheme {

    @Composable
    fun DarkLightPalette(
        darkTheme: Boolean = isSystemInDarkTheme(),
        darkPalette: CatppuccinPalette = Catppuccin.Mocha,
        lightPalette: CatppuccinPalette = Catppuccin.Latte,
        content: @Composable () -> Unit,
    ) {
        return Palette(
            palette = if (darkTheme) darkPalette else lightPalette,
            content = content
        )
    }

    @Composable
    fun Palette(
        palette: CatppuccinPalette = Catppuccin.Latte,
        content: @Composable () -> Unit,
    ) {
        val colorScheme = palette.colorScheme()
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
                val statusBarColor = colorScheme.background.toArgb()
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
