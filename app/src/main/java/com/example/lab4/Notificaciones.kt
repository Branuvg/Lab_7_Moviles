package com.example.lab4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme
import com.example.lab7.R

class Notificaciones: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NotificacionesPage()
                }
            }
        }
    }
}


@Composable
fun NotificacionesPage(){
    val context = LocalContext.current

    BackHandler {
        context.findActivity()?.finish()
    }
    Surface {
        val atras = painterResource(id = R.drawable.flecha_atras)
        val mail = painterResource(id = R.drawable.email)
        val noti = painterResource(id = R.drawable.notificaciones)
        val imp = painterResource(id = R.drawable.info)

        Column(horizontalAlignment = Alignment.CenterHorizontally,
               modifier = Modifier.fillMaxWidth())
        {
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth())
            {
                Image(
                    painter = atras,
                    contentDescription = null,
                    modifier = Modifier
                        .absoluteOffset(0.dp, 16.dp)
                        .size(40.dp)
                        .clickable {
                            context.startActivity(
                                Intent(
                                    context,
                                    MainActivity::class.java
                                )
                            )
                        }
                )

                Text(
                    text = "Notificaciones",
                    style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(20.dp)
                )

                Text(text = "       ")
            }

            Column(horizontalAlignment = Alignment.Start)
            {
                HorizontalDivider(thickness = 1.dp, color = Color.Gray)

                Row {
                    Image(
                        painter = mail,
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                            .absoluteOffset(0.dp, 15.dp)
                    )

                    Column {
                        Text(
                            text = "TOP",
                            style = TextStyle(color = Color.Black, fontSize = 20.sp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(top = 10.dp)
                        )

                        Text(
                            text = "Llega al concierto de TOP",
                            style = TextStyle(color = Color.Black, fontSize = 15.sp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(bottom = 10.dp)
                        )
                    }
                }

                HorizontalDivider(thickness = 1.dp, color = Color.Gray)

                Row {
                    Image(
                        painter = noti,
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                            .absoluteOffset(0.dp, 15.dp)
                    )

                    Column {
                        Text(
                            text = "Nueva canción",
                            style = TextStyle(color = Color.Black, fontSize = 20.sp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(top = 10.dp)
                        )

                        Text(
                            text = "Mira la nueva canción de Boywithuke",
                            style = TextStyle(color = Color.Black, fontSize = 15.sp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(bottom = 10.dp)
                        )
                    }
                }

                HorizontalDivider(thickness = 1.dp, color = Color.Gray)

                Row {
                    Image(
                        painter = noti,
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                            .absoluteOffset(0.dp, 15.dp)
                    )

                    Column {
                        Text(
                            text = "Nueva canción",
                            style = TextStyle(color = Color.Black, fontSize = 20.sp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(top = 10.dp)
                        )

                        Text(
                            text = "Mira la nueva canción de Arctic Monkeys",
                            style = TextStyle(color = Color.Black, fontSize = 15.sp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(bottom = 10.dp)
                        )
                    }
                }

                HorizontalDivider(thickness = 1.dp, color = Color.Gray)

                Row {
                    Image(
                        painter = imp,
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                            .absoluteOffset(0.dp, 15.dp)
                    )

                    Column {
                        Text(
                            text = "Le damos la bienvenida",
                            style = TextStyle(color = Color.Black, fontSize = 20.sp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(top = 10.dp)
                        )

                        Text(
                            text = "Bienvenido a su nueva cuenta",
                            style = TextStyle(color = Color.Black, fontSize = 15.sp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(bottom = 10.dp)
                        )
                    }
                }

                HorizontalDivider(thickness = 1.dp, color = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNotificaciones() {
    Lab4Theme {
        NotificacionesPage()
    }
}