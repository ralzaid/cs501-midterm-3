package com.example.midterm3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.midterm3.ui.theme.Midterm3Theme

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class Midterm3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Midterm3Theme {
                StudentListScreen()
            }
        }
    }
}

@Composable
fun StudentListScreen() {
    val students = listOf(
        "Rafal (me!!!)","Alice", "Bob", "Charlie", "Dana", "Eric",
        "Fatima", "Grace", "Hiro", "Isabel", "Jack",
        "Karen", "Luis", "Maya", "Nate", "Olivia",
        "Priya", "Quinn", "Ravi", "Sara", "Tom"
    )

    val lightPink = Color(0xFFFFE4EC)
    val darkPink = Color(0xFFD81B60)
    val card = Color(0xFFFFFFFF)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(lightPink)
    ) {

        Text(
            text = "Roster",
            color = darkPink,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 50.dp, start = 16.dp, bottom = 30.dp)
        )

        LazyColumn(
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(students) { student ->
                Card(
                    colors = CardDefaults.cardColors(containerColor = card),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = student,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = darkPink,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StudentListScreenPreview() {
    Midterm3Theme {
        StudentListScreen()
    }
}