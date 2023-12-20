package com.shifthackz.catppuccin.app.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun RadioButtonWithText(
    modifier: Modifier = Modifier,
    selected: Boolean = true,
    text: String = "Radio Button",
    onClick: () -> Unit = {},
) {
    Row(
        modifier = modifier.clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Spacer(modifier = Modifier.width(4.dp))
        RadioButton(
            selected = selected,
            onClick = onClick,
        )
        Text(
            text = text,
            color = LocalContentColor.current,
        )
    }
}
