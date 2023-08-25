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
import java.time.format.TextStyle

class Listeg : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    mylist()

                }
            }
        }



private val countrylist = mutableListOf("Kenya","Uganda","Burundi","Tz")
private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.Red)
    .padding(97.dp)


private val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 45.sp, color = Color.White)





@Preview(showBackground = true)
@Composable
fun mylist(){
    LazyColumn(modifier = listModifier){
        items(countrylist){
            country ->
            Text(text = country, style = textStyle)
        }
    }

}