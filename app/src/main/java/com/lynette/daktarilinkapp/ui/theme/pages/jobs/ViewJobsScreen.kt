package com.lynette.daktarilinkapp.ui.theme.pages.jobs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ViewJobsScreen(navController: NavHostController) {
    Column {
        Text(text = "All Jobs",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = androidx.compose.ui.graphics.Color.Black)
        Spacer(modifier = Modifier.height(20.dp))

    }
   
 }

@Composable
fun JobItem(title:String,description:String,qualification:String,
            location:String, navController: NavHostController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = title)
        Text(text = description)
        Text(text = qualification)
        Text(text = location)
    }
}
    






