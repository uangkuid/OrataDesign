package com.oratakashi.design.app.ui.colors

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.models.Constant
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

internal data class ColorData(
    val name: String,
    val code: String,
    val color: Color,
    val background: Color
)

@Preview(
    showBackground = true
)
@Composable
internal fun ColorsScreen(
    modifier: Modifier = Modifier
) {

    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(key = "color_schematic_title") {
            Text(
                text = "Color Schematic",
                style = OrataTheme.typography.titleMedium(),
                color = OrataTheme.colors.onSurface,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
        }
        item(key = "primary_colors") {
            ColorSchematic(
                colorData = Constant.primaryColors(),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        item(key = "secondary_colors") {
            ColorSchematic(
                colorData = Constant.secondaryColors(),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        item(key = "tertiary_colors") {
            ColorSchematic(
                colorData = Constant.tertiaryColors(),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        item(key = "error_colors") {
            ColorSchematic(colorData = Constant.errorColors(), modifier = Modifier.padding(horizontal = 16.dp))
        }
        item(key = "surface_colors") {
            ColorSchematic(
                colorData = Constant.surfaceColors(),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        item(key = "surface_container_colors") {
            ColorSchematic(
                colorData = Constant.surfaceContainerColors(),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        item(key = "outline_colors") {
            ColorSchematic(
                colorData = Constant.outlineColors(),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}

@Preview
@Composable
internal fun ColorSchematic(
    colorData: List<ColorData> = emptyList(),
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(
            items = colorData,
            key = { it.name }
        ) {
            ColorSchematicItem(colorData = it)
        }
    }
}

@Preview
@Composable
internal fun ColorSchematicItem(
    colorData: ColorData = ColorData(
        name = "Primary",
        code = "P-40",
        color = OrataTheme.colors.onPrimary,
        background = OrataTheme.colors.primary
    ),
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .defaultMinSize(minWidth = 123.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = colorData.background),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(top = 10.dp, start = 12.dp, end = 12.dp, bottom = 12.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = colorData.name, // e.g., "Primary"
                color = colorData.color,
                style = OrataTheme.typography.labelSmall(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = colorData.code, // e.g., "P-40"
                color = colorData.color,
                style = OrataTheme.typography.labelSmall(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}