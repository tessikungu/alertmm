package net.ezra.ui.notice

import net.ezra.R
import android.content.res.Configuration
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import coil.compose.AsyncImagePainter.State.Empty.painter


@Composable
fun NoticeScreen(navController: NavHostController) {
Box {
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
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Absolute.Center
) {

Column {

    Icon(
        imageVector = Icons.Default.Notifications,
        contentDescription = "",

        )

    Text(text = "Welcome to CNS", color = Color.White,fontWeight = FontWeight.Bold)

    Spacer(
        modifier = Modifier
            .height(20.dp)
    )


    Text(text = "Tap the icon below to get a notification",
        color = Color.White,

        )

    Image(
        painter = painterResource(id = R.drawable.img_4),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(150.dp)
    )


}
}

}

}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    NoticeScreen(rememberNavController())
}

