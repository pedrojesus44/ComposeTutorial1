package com.example.composetutorial
//imports
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Exibindo conteúdo no set content
            MessageCard("Android")
        }
    }
}

@Composable
fun MessageCard(name: String) {
    //Definindo texto para variável name
    Text(text = "Hello $name!")
}

@Preview //Método que permitirá a visualização das alterações feitas
@Composable
fun PreviewMessageCard() {
    MessageCard("Android") // declarando nome ao message card
}