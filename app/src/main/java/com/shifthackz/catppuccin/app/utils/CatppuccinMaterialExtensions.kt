package com.shifthackz.catppuccin.app.utils

import androidx.compose.ui.graphics.Color
import com.shifthackz.catppuccin.compose.CatppuccinMaterial

fun CatppuccinMaterial.copy(
    primary: Color = this.primaryColor,
    secondary: Color = this.secondaryColor,
): CatppuccinMaterial {
    return when (this) {
        is CatppuccinMaterial.Frappe -> CatppuccinMaterial.Frappe(
            primary = primary,
            secondary = secondary,
            tertiary = tertiary,
            error = error,
        )

        is CatppuccinMaterial.Latte -> CatppuccinMaterial.Latte(
            primary = primary,
            secondary = secondary,
            tertiary = tertiary,
            error = error,
        )

        is CatppuccinMaterial.Macchiato -> CatppuccinMaterial.Macchiato(
            primary = primary,
            secondary = secondary,
            tertiary = tertiary,
            error = error,
        )

        is CatppuccinMaterial.Mocha -> CatppuccinMaterial.Mocha(
            primary = primary,
            secondary = secondary,
            tertiary = tertiary,
            error = error,
        )
    }
}
