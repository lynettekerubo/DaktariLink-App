package com.lynette.daktarilinkapp.ui.theme.pages.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lynette.daktarilinkapp.navigation.ROUTE_POST_NEW_JOB
import com.lynette.daktarilinkapp.navigation.ROUTE_VIEW_JOBS
import com.lynette.daktarilinkapp.ui.theme.DaktariLinkAppTheme
import org.w3c.dom.Text
import java.security.AccessController


@Composable
fun HomeScreen(navController: NavHostController) {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Welcome to DaktariLink",
            style = MaterialTheme.typography.headlineLarge,
        )



        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
        navController.navigate(ROUTE_POST_NEW_JOB)}) {
            Text(text = "Post New Jobs")

        }
        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick = { navController.navigate(ROUTE_VIEW_JOBS)}) {
        Text(text = "View Jobs")
        }


        }

    }
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreview(){
    DaktariLinkAppTheme {
        HomeScreen(rememberNavController())

    }
}
