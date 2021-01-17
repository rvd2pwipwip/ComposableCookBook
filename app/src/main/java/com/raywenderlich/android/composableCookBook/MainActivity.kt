package com.raywenderlich.android.composableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
    setContent {
      // 1
      Column(modifier = Modifier.fillMaxSize()) {
        // 2
        TopAppBar(title = {
          Text("ComposableCookBook")
        })
        // 3
        RecipeList(defaultRecipes)
      }

    }
  }
}

@Composable
@Preview
fun Greeting() {
  Column {
    Text("Hello, World!", style = TextStyle(color = Color.Red))
    Text("Hello, Second World!", style = TextStyle(color = Color.Red))
    Text("Hello, Third World!", style = TextStyle(color = Color.Red))
  }
}