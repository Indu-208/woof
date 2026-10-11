package aitam.csm.indhu.woof

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WoofApp()
        }
    }
}
data class Dog(
    val name: String,
    val age: Int,
    val image: Int
)
@Composable
fun WoofApp() {
    val dogs = listOf(
        Dog("sana", 2, R.drawable.pic1),
        Dog("rosii", 1, R.drawable.pic2),
        Dog("shihtzu", 3, R.drawable.pic3),
        Dog("lola", 1, R.drawable.pic4),
        Dog("juicy", 3, R.drawable.pic5),
        Dog("coco", 2, R.drawable.pic6),
        Dog("browni", 3, R.drawable.pic1),
        Dog("lusi", 2, R.drawable.pic2),
        Dog("koda", 1, R.drawable.pic3),
    )

    Surface(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(dogs) { dog ->
                DogItem(dog)
            }
        }
    }
}
@Composable
fun DogItem(dog: Dog) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(dog.image),
                contentDescription = dog.name,
                modifier = Modifier.size(64.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(text = dog.name, fontSize = 20.sp)
                Text(text = "Age: ${dog.age}", fontSize = 14.sp)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun WoofAppPreview() {
    WoofApp()
}