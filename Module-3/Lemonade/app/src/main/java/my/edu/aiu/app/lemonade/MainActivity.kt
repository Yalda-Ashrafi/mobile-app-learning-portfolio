package my.edu.aiu.app.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import my.edu.aiu.app.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                LemonApp()
            }
        }
    }
}

/**
 * Main Composable function that handles state management for the Lemonade App.
 */
@Composable
fun LemonApp() {
    // Current step the app is displaying (1 to 4)
    var currentStep by remember { mutableIntStateOf(1) }

    // Number of times the lemon needs to be squeezed (randomized between 2 and 4)
    var squeezeCount by remember { mutableIntStateOf(0) }

    // Number of times the lemon has been squeezed so far
    var squeezeProgress by remember { mutableIntStateOf(0) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when (currentStep) {
            1 -> {
                // Step 1: Select a lemon from the tree
                LemonTextAndImage(
                    textResourceId = R.string.lemon_select,
                    imageResourceId = R.drawable.lemon_tree,
                    contentDescriptionResourceId = R.string.lemon_tree_content_description,
                    onImageClick = {
                        currentStep = 2
                        // Generate a random number between 2 and 4 (inclusive)
                        squeezeCount = (2..4).random()
                        squeezeProgress = 0
                    }
                )
            }
            2 -> {
                // Step 2: Squeeze the lemon
                LemonTextAndImage(
                    textResourceId = R.string.lemon_squeeze,
                    imageResourceId = R.drawable.lemon_squeeze,
                    contentDescriptionResourceId = R.string.lemon_content_description,
                    onImageClick = {
                        squeezeProgress++
                        // If squeezed enough times, move to the next step
                        if (squeezeProgress >= squeezeCount) {
                            currentStep = 3
                        }
                    }
                )
            }
            3 -> {
                // Step 3: Drink the lemonade
                LemonTextAndImage(
                    textResourceId = R.string.lemon_drink,
                    imageResourceId = R.drawable.lemon_drink,
                    contentDescriptionResourceId = R.string.lemonade_content_description,
                    onImageClick = {
                        currentStep = 4
                    }
                )
            }
            4 -> {
                // Step 4: Empty glass, tap to restart
                LemonTextAndImage(
                    textResourceId = R.string.lemon_restart,
                    imageResourceId = R.drawable.lemon_restart,
                    contentDescriptionResourceId = R.string.empty_glass_content_description,
                    onImageClick = {
                        currentStep = 1
                    }
                )
            }
        }
    }
}

/**
 * Reusable Composable function that displays text above a stylized clickable image button.
 *
 * @param textResourceId The resource ID for the text label.
 * @param imageResourceId The resource ID for the drawable image.
 * @param contentDescriptionResourceId The resource ID for the image content description.
 * @param onImageClick Lambda function to execute when the image button is clicked.
 * @param modifier Modifier to be applied to the layout.
 */
@Composable
fun LemonTextAndImage(
    textResourceId: Int,
    imageResourceId: Int,
    contentDescriptionResourceId: Int,
    onImageClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        // Text label with custom font size
        Text(
            text = stringResource(textResourceId),
            fontSize = 18.sp
        )
        // Additional space between text and image button
        Spacer(modifier = Modifier.height(16.dp))
        // Clickable button with specific accent color, border, and rounded corners
        Button(
            onClick = onImageClick,
            shape = RoundedCornerShape(4.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE2F3F5)),
            border = BorderStroke(2.dp, Color(105, 205, 216)),
            modifier = Modifier.wrapContentSize()
        ) {
            Image(
                painter = painterResource(imageResourceId),
                contentDescription = stringResource(contentDescriptionResourceId),
                modifier = Modifier.wrapContentSize().padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadeTheme {
        LemonApp()
    }
}