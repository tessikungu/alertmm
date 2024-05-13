package net.ezra.ui.email


import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R


@Composable
fun EmailScreen(navController: NavHostController) {
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
Text(text = "E-mail instructions sent",fontWeight = FontWeight.Bold, color = Color.White)
Text(text = "Please follow the instructions we sent to your e-mail", color = Color.White)
        }
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    EmailScreen(rememberNavController())
}

