package com.example.plaintext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plaintext.ui.theme.PlainTextTheme

class MainActivity : ComponentActivity() {
  
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlainTextTheme {
                // A surface container using the 'background' color from the theme
                PlainTextTheme {
                    Scaffold(
                        topBar = {
                            TopBarComponent()
                        }
                    ) { Content(Modifier.padding(it))}
                }
            }
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun TopBarComponent() {
    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = { Text("PlainText") },
        actions = {
            IconButton(onClick = { expanded = true }) {
                Icon(Icons.Default.MoreVert, contentDescription = "Menu")
            }

            //menu dropdown
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text("Configurações") },
                    onClick = { },
                    modifier = Modifier.padding(8.dp)
                )
                DropdownMenuItem(
                    text = { Text("Sobre") },
                    onClick = { },
                    modifier = Modifier.padding(8.dp)
                )
            }

        }
    )
}

@Composable
fun Content(modifier: Modifier = Modifier) {

    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var salvarInfo by remember { mutableStateOf(false) }

    Row ( modifier = modifier.fillMaxWidth()
        .background(Color.Green),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
        )
    {
        Image (
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Logo"
        )

        Text(
            text = "The most secure\n password manager\n Bob and Alice",
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
        )
    }


    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {



        Column(
            modifier = Modifier
                .fillMaxSize().padding(20.dp),
                verticalArrangement = Arrangement.Center
            ) {

            Text(
                text = "Digite suas credenciais para continuar",
                fontSize = 16.sp,
                color = Color.Black,
            )

            Row (verticalAlignment = Alignment.CenterVertically){
                Text(text = "Login: ")

                OutlinedTextField(
                    value = login,
                    onValueChange = { login = it },
                    label = { Text("alex.monteiro") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Row ( verticalAlignment = Alignment.CenterVertically){
                Text(text = "Senha: ")

                OutlinedTextField(
                    value = senha,
                    onValueChange = { senha = it },
                    label = { Text("senha") },
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = salvarInfo,
                    onCheckedChange = { salvarInfo = it }
                )
                Text("Salvar as informações de login")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                // ação de envio
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text("Enviar")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlainTextTheme {
        Scaffold(
            topBar = {
                TopBarComponent()
            }
        ) { Content(Modifier.padding(it))}
    }
}