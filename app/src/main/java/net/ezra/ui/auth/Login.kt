package net.ezra.ui.auth

//import net.ezra.navigation.ROUTE_DASHBOARD
import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.android.material.resources.TextAppearance
import com.google.firebase.auth.FirebaseAuth
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_PROFILE
import net.ezra.navigation.ROUTE_SIGNUP
import java.time.format.TextStyle
import androidx.compose.material.TextFieldColors as TextFieldColors1

//import net.ezra.navigation.ROUTE_REGISTER

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_HOME) {
                            popUpTo(ROUTE_LOGIN) { inclusive = true }}

                    }) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
                backgroundColor = Color(0xff089fae),
                contentColor = Color.White,
                elevation = 10.dp
            )
        }, content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xff010c17)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box {
                    var email by remember { mutableStateOf("") }
                    var password by remember { mutableStateOf("") }
                    var error by remember { mutableStateOf<String?>(null) }
                    var isLoading by remember { mutableStateOf(false) }

                    BackHandler {
                        navController.popBackStack()

                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                            .background(Color(0xff010c17)),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        AuthHeader()
                        Text("Login", style = MaterialTheme.typography.h4,color = Color.White)
                        Spacer(modifier = Modifier.height(16.dp))

                        OutlinedTextField(
                            value = email,
                            onValueChange = { email = it },
                            label = { Text("Email",color = Color.White) },
                            modifier = Modifier.fillMaxWidth() .background(Color.Gray)
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        OutlinedTextField(
                            value = password,
                            onValueChange = { password = it },
                            label = { Text("Password",color = Color.White) },

                            visualTransformation = PasswordVisualTransformation(),
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Gray)
                        )
                        Spacer(modifier = Modifier.height(16.dp))

                        if (isLoading) {
                            CircularProgressIndicator(modifier = Modifier.size(48.dp))
                        } else {



                            Button(
                                colors = ButtonDefaults.buttonColors(Color(0xff20d2e3)),
                                onClick = {
                                    if (email.isBlank() || password.isBlank()) {
                                        error = "Please fill in all fields"
                                    } else {
                                        isLoading = true
                                        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                                            .addOnCompleteListener { task ->
                                                isLoading = false
                                                if (task.isSuccessful) {
                                                    navController.navigate(ROUTE_PROFILE)
                                                } else {
                                                    error = task.exception?.message ?: "Login failed"
                                                }
                                            }
                                    }
                                },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text("Login",color = Color.White)
                            }

                            androidx.compose.material3.Text(
                                modifier = Modifier

                                    .clickable {
                                        navController.navigate(ROUTE_SIGNUP) {
                                            popUpTo(ROUTE_LOGIN) { inclusive = true }
                                        }
                                    },
                                text = "Go to register",
                                textAlign = TextAlign.Center,
                                color = Color.White
//                color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
                            )



                        }

                        error?.let {
                            Text(
                                text = it,
                                color = MaterialTheme.colors.error,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }

            }

        })



}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreviewLight() {
    LoginScreen(rememberNavController())

}


