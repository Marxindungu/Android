package com.wanyama.assessmentjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wanyama.assessmentjetpack.ui.theme.AssessmentjetpackTheme

class Loginactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginInterface()

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LoginInterface(){
    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxSize(),
         verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally



    ) {
        Text(text = "Please login", color = Color.Gray, fontSize = 37.sp)


        Spacer(modifier = Modifier.height(45.dp))


        TextField(value = username,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="usernameicon" )},
            onValueChange = { username },

            label = { Text(text = "Username")},

            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(15.dp))




        TextField(value = password,
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="passwordicon" )},
            onValueChange = { password },
            label = { Text(text = "Password")},
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(19.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "LOGIN")

        }
        
    }
        
    


}


