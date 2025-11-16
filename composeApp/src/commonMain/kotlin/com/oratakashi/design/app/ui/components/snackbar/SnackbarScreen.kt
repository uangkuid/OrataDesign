package com.oratakashi.design.app.ui.components.snackbar

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.unit.dp

@Composable
fun CustomSnackbarHost(
    hostState: SnackbarHostState,
    modifier: Modifier = Modifier
) {
    val currentSnackbarData = hostState.currentSnackbarData

    // Auto dismiss dengan duration dari SnackbarVisuals
    LaunchedEffect(currentSnackbarData) {
        if (currentSnackbarData != null) {
            val durationMillis = when (currentSnackbarData.visuals.duration) {
                SnackbarDuration.Short -> 4000L
                SnackbarDuration.Long -> 10000L
                SnackbarDuration.Indefinite -> return@LaunchedEffect
            }
            kotlinx.coroutines.delay(durationMillis)
            currentSnackbarData.dismiss()
        }
    }

    AnimatedVisibility(
        visible = currentSnackbarData != null,
        enter = slideInVertically(
            initialOffsetY = { it },
            animationSpec = tween(durationMillis = 300)
        ),
        exit = slideOutVertically(
            targetOffsetY = { it },
            animationSpec = tween(durationMillis = 300)
        ),
        modifier = modifier
    ) {
        if (currentSnackbarData != null) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Snackbar(
                    modifier = Modifier.fillMaxWidth(),
                    action = {
                        TextButton(
                            onClick = { currentSnackbarData.dismiss() }
                        ) {
                            Text("Dismiss")
                        }
                    }
                ) {
                    Text(currentSnackbarData.visuals.message)
                }
            }
        }
    }
}

@Suppress("DEPRECATION")
@Preview
@Composable
fun SnackbarScreen(
    modifier: Modifier = Modifier
) {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    Scaffold(
        snackbarHost = {
            _root_ide_package_.com.oratakashi.design.app.ui.components.snackbar.CustomSnackbarHost(
                hostState = snackbarHostState
            )
        },
        modifier = modifier
    ) { innerPadding ->
        Button(
            onClick = {
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "Hello from Snackbar!",
                        duration = SnackbarDuration.Short
                    )
                }
            },
            modifier = Modifier.padding(innerPadding)
        ) {
            Text("Show Snackbar")
        }
    }
}
