package com.example.composepractice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextInput()
        }
    }
}

@Composable
fun SayHello(x: String) {
    Text(
        text = "Hello $x",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Blue,
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    )
}


@Composable
private fun Previewfunction() {
    //Image
    //   Image(painter = painterResource(id = R.drawable.mydp) , contentDescription = "Dummy Image", contentScale = ContentScale.Fit)
    //Text
    //    SayHello(x = "Aman Srivastava")
    //Button
//    Button(onClick = { /*TODO*/ }) {
//        Text(text = "Hello")
//        Image(painter = painterResource(id = R.drawable.mydp), contentDescription = "Button Image")
//    }

//    TextField(value = "Hell My friend",
//        onValueChange = {
//
//        },
//        label = { Text("Enter Message") },
//        placeholder = {})
}

@Composable
fun TextInput() {
    val state = remember{ mutableStateOf("")}
    TextField(value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text("Enter Message") },
        placeholder = {})
}