package com.mrh.primeroscomponentes

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mrh.primeroscomponentes.ui.theme.PrimerosComponentesTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimerosComponentesTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.secondary

                            )
                            ,title = {
                                Text("Primeros Componentes")
                            }
                        )
                    }
                ) { innerPadding ->
                    FirstViewComponent(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun FirstViewComponent(modifier: Modifier) {
    Column(modifier = modifier.fillMaxWidth()){
        Row(modifier= Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround){
            Text(text = "Hola 2ºDAM C", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
            Text(text = "Hola 2ºDAM C", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.secondary)
        }
        Box(contentAlignment = Alignment.Center) {
            Text(text = "Hola 2ºDAM C", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
            Text(text = "Hola 2ºDAM C", fontSize = 44.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.secondary)
        }
        Card(modifier = Modifier.width(200.dp)
                        .height(150.dp)
                        .clickable { Log.d("click","hola") },
            colors = CardDefaults.cardColors(contentColor = Color.White, containerColor = MaterialTheme.colorScheme.secondaryContainer)
        ){
            AsyncImage(
                modifier = Modifier.fillMaxWidth(),
                model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOhJLd5eesDYOhKxCI49IYuhabLfhANfpD9A&s",
                contentDescription = null,
                contentScale = ContentScale.Inside
            )
            Text(text = "Hola 2ºDAM C", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }
    }
}