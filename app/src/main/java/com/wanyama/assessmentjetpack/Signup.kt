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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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

class Signup : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Signuppage()


        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Signuppage(){

    var firstname by remember {
        mutableStateOf("")
    }

    var lastname by remember {
        mutableStateOf("")
    }

    var phone by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally



    ) {
        Text(text = "Enter your first name", color = Color.Black, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(1.dp))

        TextField(
            value = firstname,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="firstnameicon" ) },
            onValueChange = { firstname },
            label = { Text(text = "Firstname") },
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = "Enter your last name", color = Color.Black, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(1.dp))

        TextField(
            value = lastname,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="lastnameicon" )},
            onValueChange = { lastname },
            label = { Text(text = "Lastname") },
            modifier = Modifier.fillMaxWidth()
        )


        Text(text = "Enter email", color = Color.Black, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(1.dp))

        TextField(
            value = email,
            leadingIcon = { Icon(Icons.Default.Email, contentDescription ="emailicon" )},
            onValueChange = { email },
            label = { Text(text = "Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = "Enter phone", color = Color.Black, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(1.dp))

        TextField(
            value = phone,
            leadingIcon = { Icon(Icons.Default.Phone, contentDescription ="phoneicon" )},
            onValueChange = { phone },
            label = { Text(text = "Phone") },
            modifier = Modifier.fillMaxWidth()
        )



        Text(text = "Enter preferred password", color = Color.Black, fontSize = 30.sp)
        TextField(
            value = password,
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="passwordicon" )},
            onValueChange ={password},
            label = { Text(text = "Password")},
            modifier = Modifier.fillMaxWidth()


        )

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Sign up", color = Color.White)

        }


    }


}



