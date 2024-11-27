package com.example.todolist

import android.app.LauncherActivity.ListItem
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.ui.theme.TODOLISTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val people = listOf("ras","jack","matty","simon","mike","ras","jack","matty","ras","mike","ras","jack","matty","simon","mike")
        setContent {

                    LazyColumn {
                        items(people){
                            ListItem(it)

                        }
                    }


        }
    }
}


@Composable
fun ListItem(name: String ){
    Card(

        modifier = Modifier.fillMaxSize() //max size
            .padding(12.dp)
    ) {
        Row {
        Image(
            painter = painterResource(id = R.drawable.baseline_person_24),
            contentDescription = "photo of person",
            modifier = Modifier.width(100.dp).height(100.dp)



        )
        Text(
            text = name,
            modifier = Modifier.padding(24.dp)
        )
        }

    }


}