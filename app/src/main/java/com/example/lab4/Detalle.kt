package com.example.lab4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme
import com.example.lab7.R

class Detalle : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PageInfo()
                }
            }
        }
    }
}

@Composable
fun PageInfo() {
    val context = LocalContext.current

    BackHandler {
        context.findActivity()?.finish()
    }
    Surface {
        Column {
            Header()
            Info()
        }
    }
}

@Composable
fun Header(){
    val boy = painterResource(id = R.drawable.boy)
    val atras = painterResource(id = R.drawable.flecha_atras)
    val context = LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row ()
        {
            Image(
                painter = atras,
                contentDescription = null,
                modifier = Modifier
                    .absoluteOffset(0.dp, 16.dp)
                    .size(40.dp)
                    .clickable { context.startActivity(Intent(context, MainActivity::class.java)) }
            )

            Text(text = "Detalles",
                style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(20.dp))


        }
        Image(painter = boy,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth())
    }
}
@Composable
fun Info(){
    Text(text = "Boywithuke",
        style = TextStyle(color = Color.Gray, fontSize = 24.sp, fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(15.dp))

    Text(
        text = "About",
        style = TextStyle(color = Color.Black, fontSize = 20.sp),
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .padding(top = 10.dp)
    )

    Text(
        text = "Charley Yang, known professionally as BoyWithUke, is a Korean-American singer, musician and internet personality.",
        style = TextStyle(color = Color.Black, fontSize = 15.sp),
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .padding(top = 20.dp))
}

@Preview(showBackground = true)
@Composable
fun PreviewDetalles() {
    Lab4Theme {
        PageInfo()
    }
}