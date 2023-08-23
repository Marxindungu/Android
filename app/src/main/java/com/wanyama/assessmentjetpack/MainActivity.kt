package com.wanyama.assessmentjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.wanyama.assessmentjetpack.ui.theme.AssessmentjetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mediascreen()

        }
    }
}



@Preview(showBackground = true)
@Composable
fun Mediascreen (){

    Column (

        horizontalAlignment = Alignment.End
        ,
        verticalArrangement = Arrangement.SpaceEvenly


            ,
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize()
    ){
        Text(text = "WELCOME WELCOME  ", color = Color.Red, fontSize = 40.sp)
        Text(text = "The pyramids by travis scott ", color = Color.Black, fontSize = 33.sp)

    }
}


