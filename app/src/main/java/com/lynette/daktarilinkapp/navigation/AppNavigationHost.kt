package com.lynette.daktarilinkapp.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lynette.daktarilinkapp.ui.theme.pages.home.HomeScreen
import com.lynette.daktarilinkapp.ui.theme.pages.jobs.PostNewJobsScreen
import com.lynette.daktarilinkapp.ui.theme.pages.jobs.UpdateNewJobsScreen
import com.lynette.daktarilinkapp.ui.theme.pages.login.LoginScreen
import com.lynette.daktarilinkapp.ui.theme.pages.profile.UserProfileScreen
import com.lynette.daktarilinkapp.ui.theme.pages.signup.SignUpScreen

@Composable
fun AppNavigationHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String = ROUTE_LOGIN){

    NavHost(
        modifier = Modifier,
        navController = navController,
        startDestination = startDestination){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP){
            SignUpScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_POST_NEW_JOB){
            PostNewJobsScreen(navController)
        }
        composable(ROUTE_UPDATE_JOBS){
            UpdateNewJobsScreen(navController)
        }
       composable(ROUTE_USER_PROFILE){
           UserProfileScreen(navController)
       }

    }


}