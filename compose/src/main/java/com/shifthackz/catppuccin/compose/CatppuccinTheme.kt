package com.shifthackz.catppuccin.compose

import android.app.Activity
import android.os.Build
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.graphics.luminance
import androidx.core.view.WindowCompat
import com.shifthackz.catppuccin.palette.Catppuccin
import com.shifthackz.catppuccin.palette.CatppuccinPalette

@Composable
fun CatppuccinTheme(
    palette: CatppuccinPalette = Catppuccin.Latte,
    content: @Composable () -> Unit,
) {
    val colorScheme = palette.colorScheme()
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            val statusBarColor = colorScheme.background.toArgb()

            val isAppearanceLightStatusBars = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                statusBarColor.luminance > 0.5f
            } else {
                palette == Catppuccin.Latte
            }

            window.statusBarColor = statusBarColor
            WindowCompat
                .getInsetsController(window, view)
                .isAppearanceLightStatusBars = isAppearanceLightStatusBars
        }
    }
    return MaterialTheme(
        colorScheme = colorScheme,
        typography = palette.typography(),
        content = content,
    )
}
