package com.example.lab4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

class Eventos : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PageInfoEventos()
                }
            }
        }
    }
}

@Composable
fun PageInfoEventos() {
    val context = LocalContext.current

    BackHandler {
        context.findActivity()?.finish()
    }
    Surface {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                Titulo()
            }
            item {
                Text(
                    text = "Mis favoritos",
                    style = TextStyle(color = Color.Gray, fontSize = 24.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(20.dp)
                )
                Fav()
            }
            item {
                Text(
                    text = "Todos los conciertos /Individual",
                    style = TextStyle(color = Color.Gray, fontSize = 24.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(20.dp)
                )
                AllConcertsi()
            }
            item {
                Text(
                    text = "Todos los conciertos /Bandas",
                    style = TextStyle(color = Color.Gray, fontSize = 24.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(20.dp)
                )
                AllConcertsb()
            }
        }
    }
}

@Composable
fun Titulo() {
    val atras = painterResource(id = R.drawable.flecha_atras)
    val context = LocalContext.current

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = atras,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clickable { context.startActivity(Intent(context, MainActivity::class.java)) }
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = "Todos los eventos",
            style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold)
        )
    }
}

@Composable
fun Fav() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Boywithuke(modifier = Modifier.weight(1f))
        TOP(modifier = Modifier.weight(1f))
    }
}

@Composable
fun Boywithuke(modifier: Modifier = Modifier) {
    val boy = painterResource(id = R.drawable.boy)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = boy,
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )

        Box(
            modifier = Modifier
                .width(180.dp)
                .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
                .background(color = Color(2, 32, 231))
        ) {
            Text(
                text = "Boywithuke",
                style = TextStyle(color = Color.White, fontSize = 15.sp),
                modifier = Modifier.padding(15.dp)
            )
        }
    }
}

@Composable
fun TOP(modifier: Modifier = Modifier) {
    val top = painterResource(id = R.drawable.top)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = top,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(180.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
        )

        Box(
            modifier = Modifier
                .width(180.dp)
                .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
                .background(color = Color(229, 131, 2))
        ) {
            Text(
                text = "Twenty One Pilots",
                style = TextStyle(color = Color.White, fontSize = 15.sp),
                modifier = Modifier.padding(15.dp)
            )
        }
    }
}

@Composable
fun AllConcertsi() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Boywithuke(modifier = Modifier.weight(1f))
        Connor_Price(modifier = Modifier.weight(1f))
    }
}

@Composable
fun AllConcertsb() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TOP(modifier = Modifier.weight(1f))
        Arctic_Monkeys(modifier = Modifier.weight(1f))
    }
}

@Composable
fun Arctic_Monkeys(modifier: Modifier = Modifier) {
    val arctic = painterResource(R.drawable.arctic)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = arctic,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(180.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
        )

        Box(
            modifier = Modifier
                .width(180.dp)
                .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
                .background(color = Color(112, 82, 42))
                .padding(10.dp)
        ) {
            Text(
                text = "Arctic Monkeys",
                style = TextStyle(color = Color.White, fontSize = 15.sp)
            )
        }
    }
}

@Composable
fun Connor_Price(modifier: Modifier = Modifier) {
    val connor = painterResource(id = R.drawable.connor)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = connor,
            contentDescription = null,
            modifier = Modifier.height(100.dp)
        )

        Box(
            modifier = Modifier
                .width(180.dp)
                .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
                .background(color = Color(119, 211, 244))
                .padding(10.dp)
        ) {
            Text(
                text = "Connor Price",
                style = TextStyle(color = Color.White, fontSize = 15.sp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEventos() {
    Lab4Theme {
        PageInfoEventos()
    }
}