package com.shifthackz.catppuccin.app.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.shifthackz.catppuccin.palette.CatppuccinPalette

fun Modifier.withBackgroundPalette(palette: CatppuccinPalette): Modifier = this
    .padding(horizontal = 16.dp, vertical = 8.dp)
    .background(
        color = palette.Surface0.copy(alpha = 0.4f),
        shape = RoundedCornerShape(16.dp),
    )
    .clip(RoundedCornerShape(16.dp))
