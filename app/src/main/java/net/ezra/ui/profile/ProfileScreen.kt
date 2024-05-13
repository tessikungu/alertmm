package net.ezra.ui.profile


import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import net.ezra.R
//import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP

//import net.ezra.navigation.ROUTE_SIGN

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavHostController) {
    Scaffold(
        content = {

            Box {
                Image(
                    painter = painterResource(id = R.drawable.img_6),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(10.dp)
                        .padding(top = 10.dp)

                ){
                    Card(
                        colors = CardDefaults.cardColors(Color.Transparent),
                        border = BorderStroke(1.dp, Color.Unspecified),
//                        elevation = CardDefaults.cardElevation(5.dp),
                        shape = ShapeDefaults.Large,
                        modifier = Modifier
                            .size(350.dp)
                            .fillMaxSize()
                            .padding(top = 30.dp)



                    ) {

                        Text(text = "Welcome to CNS",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.W800,
                                fontStyle = FontStyle.Normal,
                                letterSpacing = 0.2.em,
                            )

                        )
                        Spacer(modifier = Modifier
                            .height(20.dp))


                        Text(text = "Get notices from the comfort of your location" +
                                "without the hassle of miscommunication.",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 14.sp,
                                fontFamily = FontFamily.Cursive,
                                fontWeight = FontWeight.W800,
                                fontStyle = FontStyle.Normal,
                                letterSpacing = 0.2.em,

                                )

                        )

                        Spacer(modifier = Modifier
                            .height(20.dp))








                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_LOGIN) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        },
                            shape = RoundedCornerShape(50) ,
                            border = BorderStroke(1.dp, Color.White),

//
                        ) {

                            Text(text = "Log In", color = Color.Magenta)

                        }

                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_SIGNUP) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        },
                            shape = RoundedCornerShape(50) ,
                            border = BorderStroke(1.dp, Color.White),

//
                        ) {

                            Text(text = "Register", color = Color.Magenta)

                        }





                    }







//            ModalNavigationDrawer(
//                drawerContent = {
//                    ModalDrawerSheet {
//                        Text("Drawer title", modifier = Modifier.padding(16.dp))
//                        Divider()
//                        NavigationDrawerItem(
//                            label = { Text(text = "Drawer Item") },
//                            selected = false,
//                            onClick = { /*TODO*/ }
//                        )
//                        // ...other drawer items
//                    }
//                }
//            ) {
//                // Screen content
//            }








                }

            }

        },
        bottomBar = { BottomBar(navController) }



    )




}

@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"",
           modifier = Modifier

                .clickable {      navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }}
            )
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Notifications,"")
        },
            label = { Text(text = "Notice") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "",
            modifier = Modifier
                .clickable {      navController.navigate(ROUTE_HOME) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }}


            )
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProfileScreen(rememberNavController())
}

