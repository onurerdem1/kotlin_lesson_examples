package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

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
fun LoginForm(){
    var text by remember { mutableStateOf("Hello") }
    Column {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Ali")
        Row {
            Text(text = "username")
            TextField(value = "", onValueChange = {text=it})
        }
        Row {
            Text(text = "password")
            TextField(value = "", onValueChange = {text=it})
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    LoginForm()
}