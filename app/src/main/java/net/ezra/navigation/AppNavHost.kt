package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.RegisterScreen
import net.ezra.ui.email.EmailScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.tag.TagScreen
import net.ezra.ui.password.PasswordScreen
import net.ezra.ui.reset.ResetScreen
import net.ezra.ui.create.CreateScreen
import net.ezra.ui.notice.NoticeScreen
import net.ezra.ui.profile.ProfileScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            RegisterScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }




        composable(ROUTE_CREATE) {
            CreateScreen(navController)
        }

        composable(ROUTE_TAG) {
            TagScreen(navController)
        }

        composable(ROUTE_EMAIL) {
            EmailScreen(navController)
        }

        composable(ROUTE_NOTICE) {
           NoticeScreen(navController)
        }

        composable(ROUTE_PASSWORD) {
            PasswordScreen(navController)
        }

        composable(ROUTE_RESET) {
          ResetScreen(navController)
        }





        composable(ROUTE_PROFILE) {
            ProfileScreen(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

































    }
}

@Composable
fun SigninScreen(navController: NavHostController) {

}
