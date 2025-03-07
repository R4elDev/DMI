package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(color = 0xFFEF9106),
                        Color(color = 0xFFB6170C)
                    )
                )
            ),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column {
            Row(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Text(
                    text = stringResource(R.string.hi),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(730.dp),
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp
                ),
            ) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row(
                        modifier = Modifier

                    ) {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp),
                            shape = CircleShape,
                            border = BorderStroke(width = 2.dp, Color(color = 0xFFEF9106))
                        ) {  }
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp),
                            shape = CircleShape,
                            border = BorderStroke(width = 2.dp, Color(color = 0xFFEF9106))
                        ) {  }
                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    UserDataScreen()
}