package net.ezra.ui.reset

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R

@Composable
fun ResetScreen(navController: NavHostController) {

    Box {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillHeight
        )
        Card(
            colors = CardDefaults.cardColors(Color.Transparent),
            border = BorderStroke(1.dp, Color.Black),
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_2),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(128.dp)
                    .clip(CircleShape) // clip to the circle shape
            )
            Text(text = "Reset password",fontWeight = FontWeight.Bold, color = Color.White)


            var text by remember { mutableStateOf(TextFieldValue("")) }
            TextField(
                value = text,
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "lockIcon") },
                label = { Text(text = "Password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onValueChange = { it ->
                    text = it
                }
            )

            Spacer(modifier = Modifier
                .height(10.dp))


            var tex by remember { mutableStateOf(TextFieldValue("")) }
            TextField(
                value = text,
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "lockIcon") },
                label = { Text(text = "Confirm Password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onValueChange = { it ->
                    text = it
                }
            )








            Text(text = "Please follow the instructions we sent to your e-mail", color = Color.White)

            Button(onClick = {  }) {
                Text(text = "Reset password")
            }

        }



    }





}



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ResetScreen(rememberNavController())
}

