package net.ezra.ui.password

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
//import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R


@Composable
fun PasswordScreen(navController: NavHostController) {



    Box{
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillHeight
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Absolute.Left

        ) {


                Card(
                    colors = CardDefaults.cardColors(Color.Transparent),
                    border = BorderStroke(1.dp, Color.Transparent),
                    elevation = CardDefaults.cardElevation(5.dp),
                    shape = ShapeDefaults.Large,
                    modifier = Modifier
                        .size(150.dp)
                        .fillMaxSize()
                        .padding(top = 30.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img5),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape) // clip to the circle shape
                    )



//

                }

            }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Absolute.Right

        ) {

            Card(
                colors = CardDefaults.cardColors(Color.Transparent),
                border = BorderStroke(1.dp, Color.Transparent),
                elevation = CardDefaults.cardElevation(5.dp),
                shape = ShapeDefaults.Large,
                modifier = Modifier
                    .size(250.dp)
                    .fillMaxSize()
                    .padding(top = 30.dp)
            ) {
                Text(text = "Forgot your password?",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.W800,
                        fontStyle = FontStyle.Italic,
                        letterSpacing = 0.3.em,
                    )
                )

                Text(text = "Please enter your registered email-address." +
                        "We will send instructions to help reset your password.",color = Color.White)

                Spacer(modifier = Modifier
                    .height(10.dp))


                var text by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = text,
                    leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon",) },
                    //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                    onValueChange = {
                        text = it
                    },
                    label = { Text(text = "Email address", color = Color.White) },
                    placeholder = { Text(text = "Enter your e-mail") },


                )
                Button(
                    onClick = {
                        //your onclick code
                    },
                    border = BorderStroke(1.dp, Color.White),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
                ) {
                    Text(text = "Send reset instructions", color = Color.Cyan)
                }
            }


        }


        }

    }




@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    PasswordScreen(rememberNavController())
}

