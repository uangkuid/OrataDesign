package com.oratakashi.design.app.ui.typography

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.models.Constant
import com.oratakashi.design.foundation.OrataTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
fun TypographyScreen(
    modifier: Modifier = Modifier
) {
    val displayItems = Constant.displayItems()
    val headlineItems = Constant.headlineItems()
    val titleItems = Constant.titleItems()
    val labelItems = Constant.labelItems()
    val bodyItems = Constant.bodyItems()

    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(bottom = 100.dp, start = 16.dp, end = 16.dp)
    ) {
        item {
            Text(
                text = "Display",
                style = OrataTheme.typography.titleLarge(),
            )
        }
        items(displayItems.size) { index -> TypographyItem(data = displayItems[index]) }
        item {
            Text(
                text = "Headline",
                style = OrataTheme.typography.titleLarge(),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        items(headlineItems.size) { index -> TypographyItem(data = headlineItems[index]) }
        item {
            Text(
                text = "Title",
                style = OrataTheme.typography.titleLarge(),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        items(titleItems.size) { index -> TypographyItem(data = titleItems[index]) }
        item {
            Text(
                text = "Label",
                style = OrataTheme.typography.titleLarge(),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        items(labelItems.size) { index -> TypographyItem(data = labelItems[index]) }
        item {
            Text(
                text = "Body",
                style = OrataTheme.typography.titleLarge(),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        items(bodyItems.size) { index -> TypographyItem(data = bodyItems[index]) }
    }
}

@Preview(showBackground = true)
@Composable
internal fun TypographyItem(
    data: TypographyData = TypographyData(
        title = "Display Large",
        style = OrataTheme.typography.displayLarge(),
        name = "Display",
        size = "Large",
        font = "Montserrat",
        lineHeight = "57",
        letterSpacing = "64"
    )
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(7.dp)
    ) {
        Text(
            text = data.title,
            style = data.style,
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        ) {
            Text(
                text = data.name,
                style = OrataTheme.typography.bodyMedium()
            )
            Text(text = "/", style = OrataTheme.typography.bodyMedium())
            Text(text = data.size, style = OrataTheme.typography.bodyMedium())
            Text(text = "•", style = OrataTheme.typography.bodyMedium())
            Text(text = data.font, style = OrataTheme.typography.bodyMedium())
            Text(text = "•", style = OrataTheme.typography.bodyMedium())
            Text(text = "${data.lineHeight}/${data.letterSpacing}", style = OrataTheme.typography.bodyMedium())
        }
    }
}

internal data class TypographyData(
    val title: String,
    val style: TextStyle,
    val name: String,
    val size: String,
    val font: String,
    val lineHeight: String,
    val letterSpacing: String,
)
