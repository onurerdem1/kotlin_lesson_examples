package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginForm()
            }
        }
    }
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginForm() {
    Column{
        Box(modifier = Modifier
            .height(50.dp)
            .width(200.dp)
            .border(0.1.dp,Color.Black)
            .background(color = Color.Gray)){
            Text(text = "0",Modifier
                .align(Alignment.CenterEnd))
        }
        Row {
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "C",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "+/-",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "%",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color(0xFFFFA500))){
                Text(text = "÷",Modifier
                    .align(Alignment.Center))

            }
        }
        Row {
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "7",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "8",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "9",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color(0xFFFFA500))){
                Text(text = "x",Modifier
                    .align(Alignment.Center))

            }
        }
        Row {
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "4",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "5",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "6",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color(0xFFFFA500))){
                Text(text = "-",Modifier
                    .align(Alignment.Center))

            }
        }
        Row {
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "1",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "2",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "3",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color(0xFFFFA500))){
                Text(text = "+",Modifier
                    .align(Alignment.Center))

            }
        }
        Row {
            Box(modifier = Modifier
                .height(30.dp)
                .width(100.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = "0",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color.White)){
                Text(text = ".",Modifier
                    .align(Alignment.Center))
            }
            Box(modifier = Modifier
                .height(30.dp)
                .width(50.dp)
                .border(0.1.dp,Color.Gray)
                .background(color = Color(0xFFFFA500))){
                Text(text = "=",Modifier
                    .align(Alignment.Center))

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    LoginForm()
}