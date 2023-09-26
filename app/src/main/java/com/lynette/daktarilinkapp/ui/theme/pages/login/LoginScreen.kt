@file:OptIn(ExperimentalMaterial3Api::class)

package com.lynette.daktarilinkapp.ui.theme.pages.login
import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lynette.daktarilinkapp.navigation.ROUTE_SIGNUP
import com.lynette.daktarilinkapp.navigation.ROUTE_USER_PROFILE
import com.lynette.daktarilinkapp.ui.theme.DaktariLinkAppTheme

@Composable
fun LoginScreen(navController: NavHostController) {
    Column {
        Text(
            text = "Login Here",
            modifier = androidx.compose.ui.Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
            textDecoration = TextDecoration.Underline
        )
        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
        Button(onClick = { navController.navigate(ROUTE_USER_PROFILE) }) {
            Text(text = "Login")
        }


        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

        Button(onClick = { navController.navigate(ROUTE_SIGNUP) }) {
            Text(text = "No Account? Sign Up")
        }

    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreview() {
    DaktariLinkAppTheme {
        LoginScreen(rememberNavController())
    }
}
