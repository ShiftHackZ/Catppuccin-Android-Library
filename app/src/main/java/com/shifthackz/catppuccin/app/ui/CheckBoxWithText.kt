package com.shifthackz.catppuccin.app.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun CheckBoxWithText(
    modifier: Modifier = Modifier,
    text: String = "Check Box",
    checked: Boolean = false,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit = {},
) {
    Row(
        modifier = modifier.clickable { if (enabled) onCheckedChange(!checked) },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Spacer(modifier = Modifier.width(4.dp))
        Checkbox(checked = checked, onCheckedChange = onCheckedChange, enabled = enabled)
        Text(
            text = text,
            color = LocalContentColor.current.copy(alpha = if (enabled) 1f else 0.5f),
        )
    }
}
