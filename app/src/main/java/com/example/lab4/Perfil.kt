package com.example.lab4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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

class Perfil: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PerfilPage()
                }
            }
        }
    }
}

@Composable
fun PerfilPage(){
    val context = LocalContext.current

    BackHandler {
        context.findActivity()?.finish()
    }
    Surface {
        Column (modifier = Modifier.verticalScroll(rememberScrollState()))
        {
            ProfileDes()
            Menu()
        }
    }
}

@Composable
fun ProfileDes(){
    val avatar = painterResource(id = R.drawable.perfil_pic)
    val fondo = painterResource(id = R.drawable.fondo_perfil)
    val circle = painterResource(id = R.drawable.circle)
    val context = LocalContext.current
    val atras = painterResource(id = R.drawable.flecha_atras)

    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
             modifier = Modifier.fillMaxWidth()
        )
        {
            Text(text = "   ")

            Image(
                painter = atras,
                contentDescription = null,
                modifier = Modifier
                    .absoluteOffset(0.dp, 16.dp)
                    .size(40.dp)
                    .clickable { context.startActivity(Intent(context, MainActivity::class.java)) }
            )

            Text(
                text = "Mi Perfil",
                 style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
                 modifier = Modifier.padding(20.dp)
            )
        }

        Box (
            Modifier
            .fillMaxWidth()
            .height(200.dp)
        )
        {
            Image(
                painter = fondo,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .alpha(0.6f)
            )

            Image(
                painter = circle,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
                    .absoluteOffset(0.dp, 40.dp)
            )

            Image(painter = avatar,
                  contentDescription = null,
                  modifier = Modifier
                      .size(150.dp)
                      .align(Alignment.Center)
                      .absoluteOffset(0.dp, 40.dp))
        }

        Text(text = "Gabriel Bran",
            style = TextStyle(
                color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(20.dp)
        )
    }
}

@Composable
fun Menu(){
    val fav = painterResource(id = R.drawable.grupos)
    val emer = painterResource(id = R.drawable.emergencia)
    val yo = painterResource(id = R.drawable.perfil)
    val settings = painterResource(id = R.drawable.ajustes)


    Column (Modifier.fillMaxWidth())
    {
        HorizontalDivider(thickness = 1.dp, color = Color.Gray)

        Row {
            Image(
                painter = yo,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Editar Perfil",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }

        HorizontalDivider(thickness = 1.dp, color = Color.Gray)

        Row {
            Image(
                painter = emer,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Reset Password",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }

        HorizontalDivider(thickness = 1.dp, color = Color.Gray)

        Row {
            Image(
                painter = settings,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Ajustes",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }

        HorizontalDivider(thickness = 1.dp, color = Color.Gray)

        Row {
            Image(
                painter = fav,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Mis Favoritos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }

        HorizontalDivider(thickness = 1.dp, color = Color.Gray)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPerfil() {
    Lab4Theme {
        PerfilPage()
    }
}

