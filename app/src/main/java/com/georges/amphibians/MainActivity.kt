package com.georges.amphibians

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.georges.amphibians.ui.theme.AmphibiansTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmphibiansTheme {
                AnimalApp()
            }
        }
    }
}


@Composable
fun AnimalApp(){
    Column {
        Text(
            text = stringResource(R.string.app_name),
            fontSize = 20.sp,
            modifier = Modifier.padding(10.dp)
        )

        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            CardTitle()

            CardImage()

            CardDescription()
        }
    }
}



@Composable
fun CardTitle(){
    Text(
        text = "App title",
        fontFamily = FontFamily.Default,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
    )
}

@Composable
fun  CardImage(){
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun CardDescription(){
    Text(
        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of set sheets" +
                " containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.",
        fontFamily = FontFamily.Default,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
    )
}
