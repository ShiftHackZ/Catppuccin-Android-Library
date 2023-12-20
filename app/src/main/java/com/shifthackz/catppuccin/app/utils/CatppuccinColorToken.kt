package com.shifthackz.catppuccin.app.utils

import androidx.compose.ui.graphics.Color
import com.shifthackz.catppuccin.palette.CatppuccinPalette

enum class CatppuccinColorToken {
    ROSEWATER,
    FLAMINGO,
    PINK,
    MAUVE,
    RED,
    MAROON,
    PEACH,
    YELLOW,
    GREEN,
    TEAL,
    SKY,
    SAPPHIRE,
    BLUE,
    LAVENDER;

    fun color(palette: CatppuccinPalette): Color {
        return when (this) {
            ROSEWATER -> palette.Rosewater
            FLAMINGO -> palette.Flamingo
            PINK -> palette.Pink
            MAUVE -> palette.Mauve
            RED -> palette.Red
            MAROON -> palette.Maroon
            PEACH -> palette.Peach
            YELLOW -> palette.Yellow
            GREEN -> palette.Green
            TEAL -> palette.Teal
            SKY -> palette.Sky
            SAPPHIRE -> palette.Sapphire
            BLUE -> palette.Blue
            LAVENDER -> palette.Lavender
        }
    }
}
