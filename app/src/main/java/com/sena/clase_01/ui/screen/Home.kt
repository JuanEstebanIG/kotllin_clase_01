package com.sena.clase_01.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sena.clase_01.ui.section.Body
import com.sena.clase_01.ui.section.Footer
import com.sena.clase_01.ui.section.Header

@Composable
fun Home(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.Black
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Header(
                title = "Primera aplicacion en Android"
            )

            Body(
                modifier = Modifier.weight(1f)
            )

            Footer(
                leftText = "Texto Footer1",
                rightText = "Texto Footer2"
            )
        }
    }
}