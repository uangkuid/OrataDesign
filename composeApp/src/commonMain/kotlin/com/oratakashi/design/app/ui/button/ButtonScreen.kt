package com.oratakashi.design.app.ui.button

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
fun ButtonScreen(
    modifier: Modifier = Modifier
) {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("Basic", "State", "Size")

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(23.dp)
    ) {
        // Tabs Section
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            TabRow(
                selectedTabIndex = selectedTabIndex,
                containerColor = Color(0xFFF7F9FF),
                contentColor = Color(0xFF276389),
                indicator = { tabPositions ->
                    if (selectedTabIndex < tabPositions.size) {
                        TabRowDefaults.SecondaryIndicator(
                            modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                            color = Color(0xFF276389)
                        )
                    }
                },
                divider = {
                    HorizontalDivider(color = Color(0xFFC1C7CE))
                }
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = {
                            Text(
                                text = title,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = if (selectedTabIndex == index)
                                    Color(0xFF276389)
                                else
                                    Color(0xFF41474D)
                            )
                        }
                    )
                }
            }
        }

        // Button Sections
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(23.dp)
        ) {
            // Primary Button Section
            ButtonSection(
                title = "Primary Button",
                buttonType = ButtonType.Primary
            )

            // Tonal Button Section
            ButtonSection(
                title = "Tonal Button",
                buttonType = ButtonType.Tonal
            )

            // Outline Button Section
            ButtonSection(
                title = "Outline Button",
                buttonType = ButtonType.Outline
            )

            // Text Button Section
            ButtonSection(
                title = "Text Button",
                buttonType = ButtonType.Text
            )
        }
    }
}

@Composable
private fun ButtonSection(
    title: String,
    buttonType: ButtonType
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.spacedBy(13.dp)
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth()
        )

        when (buttonType) {
            ButtonType.Primary -> {
                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF276389),
                        contentColor = Color.White
                    ),
                    shape = MaterialTheme.shapes.extraLarge
                ) {
                    Text(
                        text = "Label",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            ButtonType.Tonal -> {
                FilledTonalButton(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = Color(0xFFD3E5F5),
                        contentColor = Color(0xFF384956)
                    ),
                    shape = MaterialTheme.shapes.extraLarge
                ) {
                    Text(
                        text = "Label",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            ButtonType.Outline -> {
                OutlinedButton(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color(0xFF41474D)
                    ),
                    border = ButtonDefaults.outlinedButtonBorder.copy(
                        brush = androidx.compose.ui.graphics.SolidColor(Color(0xFFC1C7CE))
                    ),
                    shape = MaterialTheme.shapes.extraLarge
                ) {
                    Text(
                        text = "Label",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            ButtonType.Text -> {
                TextButton(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = Color(0xFF276389)
                    ),
                    shape = MaterialTheme.shapes.extraLarge
                ) {
                    Text(
                        text = "Label",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
    }
}

private enum class ButtonType {
    Primary,
    Tonal,
    Outline,
    Text
}
