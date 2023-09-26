package com.lynette.daktarilinkapp.ui.theme.pages.jobs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lynette.daktarilinkapp.ui.theme.DaktariLinkAppTheme
import org.w3c.dom.Text
import androidx.compose.material3.OutlinedTextField as OutlinedTextField
import androidx.compose.material3.Text as Text


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostNewJobsScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Post Job",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        var jobTitle by remember { mutableStateOf(TextFieldValue("")) }
        var jobDescription by remember { mutableStateOf(TextFieldValue("")) }
        var jobQualification by remember { mutableStateOf(TextFieldValue("")) }
        var jobLocation by remember { mutableStateOf(TextFieldValue("")) }



        OutlinedTextField(
            value = jobTitle,
            onValueChange = { jobTitle = it },
            label = { Text(text = "job title*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = jobDescription,
            onValueChange = { jobDescription = it },
            label = { Text(text = "job description*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = jobQualification,
            onValueChange = { jobQualification = it },
            label = { Text(text = "job qualification*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = jobLocation,
            onValueChange = { jobLocation = it },
            label = { Text(text = "job location*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(20.dp))
        
        Button(onClick = { /*TODO*/ })
        {
            
        }


    }
    @Preview
    @Composable
    fun PostNewJobsScreenPreview() {
        DaktariLinkAppTheme {
            PostNewJobsScreen(rememberNavController())
        }

    }
}