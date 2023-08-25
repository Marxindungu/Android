package com.wanyama.assessmentjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wanyama.assessmentjetpack.ui.theme.AssessmentjetpackTheme

class Mpesalist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mpesalist()
        }

    }
}


private val toolist = mutableListOf("Send money","Withdraw cash","Buy Airtime","Lipa na mpesa","My Account")
private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.White)
    .padding(17.dp)


private val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 33.sp, color = Color.DarkGray)




@Preview(showBackground = true)
@Composable
fun mpesalist (){
    LazyColumn(modifier = listModifier){
        items(toolist){
            list ->
            Text(text = list, style = textStyle)
        }
    }

}
