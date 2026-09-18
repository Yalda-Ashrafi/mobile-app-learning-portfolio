package my.edu.aiu.app.kotlinpracticesolutions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import my.edu.aiu.app.kotlinpracticesolutions.ui.theme.KotlinPracticeSolutionsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinPracticeSolutionsTheme {
                ExerciseApp()
            }
        }
    }
}

@Composable
fun ExerciseApp() {
    var outputText by remember { mutableStateOf("Select an exercise to see the output here.") }
    
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Kotlin Practice Exercises",
                style = MaterialTheme.typography.headlineMedium
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Column(modifier = Modifier.weight(1f).verticalScroll(rememberScrollState())) {
                ExerciseButton("Mobile Notifications") {
                    outputText = OutputCapturer.capture {
                        mobileNotificationsMain() 
                    }
                }
                
                ExerciseButton("Movie Ticket Price") {
                    outputText = OutputCapturer.capture { 
                        movieTicketPriceMain()
                    }
                }
                
                ExerciseButton("Temperature Converter") {
                    outputText = OutputCapturer.capture {
                        temperatureConverterMain()
                    }
                }
                
                ExerciseButton("Internet Profile") {
                    outputText = OutputCapturer.capture {
                        internetProfileMain()
                    }
                }
                
                ExerciseButton("Song Catalog") {
                    outputText = OutputCapturer.capture {
                        songCatalogMain()
                    }
                }
                
                ExerciseButton("Foldable Phones") {
                    outputText = OutputCapturer.capture {
                        foldablePhonesMain()
                    }
                }
                
                ExerciseButton("Special Auction") {
                    outputText = OutputCapturer.capture {
                        specialAuctionMain()
                    }
                }
            }
            
            HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))
            
            Text(
                text = "Output:",
                style = MaterialTheme.typography.titleMedium
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = outputText,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun ExerciseButton(name: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Text(text = name)
    }
}