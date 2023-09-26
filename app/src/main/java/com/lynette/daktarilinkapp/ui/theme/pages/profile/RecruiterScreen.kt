package com.lynette.daktarilinkapp.ui.theme.pages.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lynette.daktarilinkapp.ui.theme.DaktariLinkAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecruiterScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Company Profile",
            style = MaterialTheme.typography.headlineLarge,
        )
        var company_name by rememberSaveable { mutableStateOf("default company name") }
        var company_about by rememberSaveable { mutableStateOf("default company about") }
        var company_description by rememberSaveable { mutableStateOf("default company description") }

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(8.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = " Company Name", modifier = Modifier.width(100.dp))

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp),
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = "About Company", modifier = Modifier
                        .width(100.dp)
                        .padding(8.dp)
                )
                TextField(
                    value = company_about,
                    onValueChange = { company_about = it },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.Black
                    ),
                    singleLine = false,
                    modifier = Modifier.height(150.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = "Company Decription", modifier = Modifier
                        .width(100.dp)
                        .padding(top = 8.dp)
                )
                TextField(
                    value = company_description,
                    onValueChange = { company_description = it },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.Black
                    ),
                    singleLine = false,
                    modifier = Modifier.height(150.dp)
                )
            }
        }

    }
    @Preview
    @Composable
    fun RecruiterScreenPreview() {
        DaktariLinkAppTheme {
            RecruiterScreen(rememberNavController())
        }

    }
}
