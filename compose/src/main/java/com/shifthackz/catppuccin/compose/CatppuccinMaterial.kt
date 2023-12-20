@file:Suppress("unused")

package com.shifthackz.catppuccin.compose

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.shifthackz.catppuccin.palette.Catppuccin
import com.shifthackz.catppuccin.palette.CatppuccinPalette

/**
 * Extends the functionality of [CatppuccinPalette] to provide a simple way to customize main
 * colors of [MaterialTheme].
 *
 * @see CatppuccinPalette
 *
 * @author ShiftHackZ
 * @since  0.0.1
 */
sealed class CatppuccinMaterial private constructor(
    val primaryColor: Color,
    val secondaryColor: Color,
    val tertiaryColor: Color,
    val errorColor: Color,
    palette: CatppuccinPalette
): CatppuccinPalette {

    /**
     * Represents [Catppuccin.Latte] flavor as [CatppuccinPalette] which maim colors can be
     * customized by changing color properties.
     *
     * @property primary The primary color is the color displayed most frequently across your app’s
     * screens and components.
     * @property secondary The secondary color provides more ways to accent and distinguish
     * your product.
     * @property tertiary The tertiary color that can be used to balance primary and secondary
     * colors, or bring heightened attention to an element such as an input field.
     * @property errorColor The error color is used to indicate errors in components, such as invalid text in
     * a text field.
     *
     * @return New instance of [CatppuccinPalette].
     *
     * @see Catppuccin.Latte
     *
     * @author ShiftHackZ
     * @since  0.0.1
     */
    data class Latte(
        val primary: Color = Catppuccin.Latte.Blue,
        val secondary: Color = Catppuccin.Latte.Sky,
        val tertiary: Color = Catppuccin.Latte.Sapphire,
        val error: Color = Catppuccin.Latte.Red,
    ): CatppuccinMaterial(
        primary,
        secondary,
        tertiary,
        error,
        Catppuccin.Latte,
    )

    /**
     * Represents [Catppuccin.Frappe] flavor as [CatppuccinPalette] which maim colors can be
     * customized by changing color properties.
     *
     * @property primary The primary color is the color displayed most frequently across your app’s
     * screens and components.
     * @property secondary The secondary color provides more ways to accent and distinguish
     * your product.
     * @property tertiary The tertiary color that can be used to balance primary and secondary
     * colors, or bring heightened attention to an element such as an input field.
     * @property errorColor The error color is used to indicate errors in components, such as invalid text in
     * a text field.
     *
     * @return New instance of [CatppuccinPalette].
     *
     * @see Catppuccin.Frappe
     *
     * @author ShiftHackZ
     * @since  0.0.1
     */
    data class Frappe(
        val primary: Color = Catppuccin.Frappe.Blue,
        val secondary: Color = Catppuccin.Frappe.Sky,
        val tertiary: Color = Catppuccin.Frappe.Sapphire,
        val error: Color = Catppuccin.Frappe.Red,
    ): CatppuccinMaterial(
        primary,
        secondary,
        tertiary,
        error,
        Catppuccin.Frappe,
    )


    /**
     * Represents [Catppuccin.Macchiato] flavor as [CatppuccinPalette] which maim colors can be
     * customized by changing color properties.
     *
     * @property primary The primary color is the color displayed most frequently across your app’s
     * screens and components.
     * @property secondary The secondary color provides more ways to accent and distinguish
     * your product.
     * @property tertiary The tertiary color that can be used to balance primary and secondary
     * colors, or bring heightened attention to an element such as an input field.
     * @property errorColor The error color is used to indicate errors in components, such as invalid text in
     * a text field.
     *
     * @return New instance of [CatppuccinPalette].
     *
     * @see Catppuccin.Macchiato
     *
     * @author ShiftHackZ
     * @since  0.0.1
     */
    data class Macchiato(
        val primary: Color = Catppuccin.Macchiato.Blue,
        val secondary: Color = Catppuccin.Macchiato.Sky,
        val tertiary: Color = Catppuccin.Macchiato.Sapphire,
        val error: Color = Catppuccin.Macchiato.Red,
    ): CatppuccinMaterial(
        primary,
        secondary,
        tertiary,
        error,
        Catppuccin.Macchiato,
    )

    /**
     * Represents [Catppuccin.Mocha] flavor as [CatppuccinPalette] which maim colors can be
     * customized by changing color properties.
     *
     * @property primary The primary color is the color displayed most frequently across your app’s
     * screens and components.
     * @property secondary The secondary color provides more ways to accent and distinguish
     * your product.
     * @property tertiary The tertiary color that can be used to balance primary and secondary
     * colors, or bring heightened attention to an element such as an input field.
     * @property errorColor The error color is used to indicate errors in components, such as invalid text in
     * a text field.
     *
     * @return New instance of [CatppuccinPalette].
     *
     * @see Catppuccin.Mocha
     *
     * @author ShiftHackZ
     * @since  0.0.1
     */
    data class Mocha(
        val primary: Color = Catppuccin.Mocha.Blue,
        val secondary: Color = Catppuccin.Mocha.Sky,
        val tertiary: Color = Catppuccin.Mocha.Sapphire,
        val error: Color = Catppuccin.Mocha.Red,
    ): CatppuccinMaterial(
        primary,
        secondary,
        tertiary,
        error,
        Catppuccin.Mocha,
    )

    override val Rosewater: Color = palette.Rosewater
    override val Flamingo: Color = palette.Flamingo
    override val Pink: Color = palette.Pink
    override val Mauve: Color = palette.Mauve
    override val Red: Color = palette.Red
    override val Maroon: Color = palette.Maroon
    override val Peach: Color = palette.Peach
    override val Yellow: Color = palette.Yellow
    override val Green: Color = palette.Green
    override val Teal: Color = palette.Teal
    override val Sky: Color = palette.Sky
    override val Sapphire: Color = palette.Sapphire
    override val Blue: Color = palette.Blue
    override val Lavender: Color = palette.Lavender
    override val Text: Color = palette.Text
    override val Subtext1: Color = palette.Subtext1
    override val Subtext0: Color = palette.Subtext0
    override val Overlay2: Color = palette.Overlay2
    override val Overlay1: Color = palette.Overlay1
    override val Overlay0: Color = palette.Overlay0
    override val Surface2: Color = palette.Surface2
    override val Surface1: Color = palette.Surface1
    override val Surface0: Color = palette.Surface0
    override val Base: Color = palette.Base
    override val Mantle: Color = palette.Mantle
    override val Crust: Color = palette.Crust
}
