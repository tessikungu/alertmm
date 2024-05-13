package net.ezra.ui.tag

import android.content.res.Configuration
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_CREATE
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_TAG
import java.lang.reflect.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TagScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "")
                }, navigationIcon = {
                    IconButton(onClick = { navController.navigate(ROUTE_CREATE) {
                        popUpTo(ROUTE_TAG) { inclusive = true }
                    }}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
               colors = TopAppBarDefaults.topAppBarColors(Color.Cyan),


//                backgroundColor = androidx.compose.material.MaterialTheme.colors.background.blue,
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
                Text(
                    text = "",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }


            Box {
                Image(
                    painter = painterResource(id = R.drawable.img_1),
                    contentDescription = "",
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.FillHeight
                )
                Column(
                    modifier = androidx.compose.ui.Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Spacer(modifier = androidx.compose.ui.Modifier
                        .height(70.dp))


                    Text(text = "Select tags",color = Color.White,fontWeight = FontWeight.Bold)

                    Text(text = "B.Tech",color = Color.White)

                    Spacer(modifier = androidx.compose.ui.Modifier
                        .height(10.dp))

                    Text(text = "M.B.A",color = Color.White)
                    Spacer(modifier = androidx.compose.ui.Modifier
                        .height(10.dp))

                    Text(text = "M.Tech",color = Color.White)

                    Spacer(modifier = androidx.compose.ui.Modifier
                        .height(10.dp))

                    Text(text = "P.h.d",color = Color.White)

                    Spacer(modifier = androidx.compose.ui.Modifier
                        .height(10.dp))

                    Text(text = "Exams",color = Color.White)

                    Spacer(modifier = androidx.compose.ui.Modifier
                        .height(10.dp))

                    Text(text = "Results",color = Color.White)

                    Spacer(modifier = androidx.compose.ui.Modifier
                        .height(10.dp))

                    Text(text = "Hostels",color = Color.White)

                    Spacer(modifier = androidx.compose.ui.Modifier
                        .height(10.dp))

                    Text(text = "Societies",color = Color.White)

                    Button(onClick = {
                        navController.navigate(ROUTE_CREATE) {
                            popUpTo(ROUTE_TAG) { inclusive = true }}
                    },
                        shape = RoundedCornerShape(10),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Cyan)
                    ) {
                        Text(text = "Done")
                    }

                }




            }
        }

    )


    }










@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    TagScreen(rememberNavController())
}

