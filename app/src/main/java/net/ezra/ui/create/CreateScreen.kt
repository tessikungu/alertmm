package net.ezra.ui.create


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
import net.ezra.navigation.ROUTE_CREATE
//import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_TAG


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreateScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_HOME) {
                            popUpTo(ROUTE_CREATE) { inclusive = true }}

                    }) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(Color.White),
//                backgroundColor = MaterialTheme.colors.primary,
//                contentColor = Color.White,
//                elevation = 10.dp
            )
        }, content = {
            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color(0xff8d6e63)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize(),
                        contentScale = ContentScale.FillHeight
                    )
                    Column {
                        Text(
                            text = "Your notice board",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 16.sp,
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.W800,
                                fontStyle = FontStyle.Italic,
                                letterSpacing = 0.5.em,
                            )
                        )

                        var text by remember { mutableStateOf(TextFieldValue("")) }
                        OutlinedTextField(
                            value = text,
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "emailIcon"
                                )
                            },
                            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                            onValueChange = {
                                text = it
                            },
                            colors = OutlinedTextFieldDefaults.colors(Color.White),
                            label = { Text(text = "Search notice", color = Color.White) },
                            placeholder = { Text(text = "Enter your e-mail") },
                        )

                        Row {
                            Card(
                                colors = CardDefaults.cardColors(Color.Transparent),
                                border = BorderStroke(1.dp, Color.White),
//                        elevation = CardDefaults.cardElevation(5.dp),
                                shape = ShapeDefaults.Large,
                                modifier = Modifier
                                    .size(80.dp)
                                    .fillMaxSize()
                                    .padding(top = 30.dp)

                            ) {
                                Image(painter = painterResource(id = R.drawable.image), contentDescription = "",
                                    modifier = Modifier
                                        .size(30.dp)
                                )
                                Text(text = "Admissions", color = Color.White)
                            }

                            Spacer(modifier = Modifier
                                .width(20.dp)
                            )

                            Card(
                                colors = CardDefaults.cardColors(Color.Transparent),
                                border = BorderStroke(1.dp, Color.White),
//                        elevation = CardDefaults.cardElevation(5.dp),
                                shape = ShapeDefaults.Large,
                                modifier = Modifier
                                    .size(80.dp)
                                    .fillMaxSize()
                                    .padding(top = 30.dp)

                            ) {
                                Image(painter = painterResource(id = R.drawable.image), contentDescription = "",
                                    modifier = Modifier
                                        .size(30.dp)
                                )
                                Text(text = "Courses",color = Color.White)
                            }




                        }

                        Row {
                            Card(
                                colors = CardDefaults.cardColors(Color.Transparent),
                                border = BorderStroke(1.dp, Color.White),
//                        elevation = CardDefaults.cardElevation(5.dp),
                                shape = ShapeDefaults.Large,
                                modifier = Modifier
                                    .size(80.dp)
                                    .fillMaxSize()
                                    .padding(top = 30.dp)

                            ) {
                                Image(painter = painterResource(id = R.drawable.image), contentDescription = "",
                                    modifier = Modifier
                                        .size(30.dp)
                                )
                                Text(text = "Societies",color = Color.White)
                            }

                            Spacer(modifier = Modifier
                                .width(20.dp)
                            )

                            Card(
                                colors = CardDefaults.cardColors(Color.Transparent),
                                border = BorderStroke(1.dp, Color.White),
//                        elevation = CardDefaults.cardElevation(5.dp),
                                shape = ShapeDefaults.Large,
                                modifier = Modifier
                                    .size(80.dp)
                                    .fillMaxSize()
                                    .padding(top = 30.dp)

                            ) {
                                Image(painter = painterResource(id = R.drawable.image), contentDescription = "",
                                    modifier = Modifier
                                        .size(30.dp)
                                )
                                Text(text = "Hostels",color = Color.White)
                            }




                        }

                        Row {
                            Card(
                                colors = CardDefaults.cardColors(Color.Transparent),
                                border = BorderStroke(1.dp, Color.White),
//                        elevation = CardDefaults.cardElevation(5.dp),
                                shape = ShapeDefaults.Large,
                                modifier = Modifier
                                    .size(80.dp)
                                    .fillMaxSize()
                                    .padding(top = 30.dp)

                            ) {

                                Image(painter = painterResource(id = R.drawable.image), contentDescription = "",
                                    modifier = Modifier
                                        .size(30.dp)
                                )
                                Text(text = "Exams",color = Color.White)
                            }

                            Spacer(modifier = Modifier
                                .width(20.dp)
                            )

                            Card(
                                colors = CardDefaults.cardColors(Color.Transparent),
                                border = BorderStroke(1.dp, Color.White),
//                        elevation = CardDefaults.cardElevation(5.dp),
                                shape = ShapeDefaults.Large,
                                modifier = Modifier
                                    .size(80.dp)
                                    .fillMaxSize()
                                    .padding(top = 30.dp)

                            ) {
                                Image(painter = painterResource(id = R.drawable.image), contentDescription = "",
                                    modifier = Modifier
                                        .size(30.dp)
                                )


                                Text(text = "Results",color = Color.White)
                            }




                        }


                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_TAG) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        },
                            shape = RoundedCornerShape(50) ,
                            border = BorderStroke(1.dp, Color.White),

//
                        ) {

                            Text(text = "Tags", color = Color.Cyan)

                        }
                    }

                }
            }

        })






   }




@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    CreateScreen(rememberNavController())
}

