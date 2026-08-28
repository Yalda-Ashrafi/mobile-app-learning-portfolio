
##  Happy Birthday App — Module 1 Part 3

### Overview
The **Happy Birthday App** is a simple yet elegant Android application built using **Jetpack Compose**.  
It was developed as part of *Module 1 – Part 3* in the Mobile Application Development course to demonstrate modern UI design principles in Kotlin.

This project focuses on creating a personalized greeting card interface that displays a birthday message and sender name with clean typography and responsive layout.

---

###  Key Features
- **Jetpack Compose UI:** Fully declarative and modern Android UI framework  
- **Material 3 Design:** Uses the latest Material Theme for a polished look  
- **Dynamic Layout:** Automatically adjusts to different screen sizes  
- **Composable Functions:** Reusable, readable, and efficient code structure  
- **Preview Support:** Real‑time design visualization in Android Studio  

---

###  Code Highlights
```kotlin
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}
```
This composable function defines the greeting layout, combining text alignment, font sizing, and padding for a visually balanced design.

---

###  App Preview
*(Replace these placeholders with your actual screenshots once uploaded to GitHub)*

|  Home Screen |  Greeting Card View |
|----------------|----------------------|
![image alt](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/83655811d3a257f35c7de2e7b81bd122f0c97d6d/Assets/Badges.png)
 ![image alt](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/83655811d3a257f35c7de2e7b81bd122f0c97d6d/Assets/badge.png)


---

### Tech Stack
| Technology | Purpose |
|-------------|----------|
| **Kotlin** | Core programming language |
| **Jetpack Compose** | Declarative UI framework |
| **Material 3** | Design system for modern Android apps |
| **Android Studio** | Development environment |

---

###  How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio.git
   ```
2. Open the project in **Android Studio**.
3. Navigate to `Module‑1/Part‑3`.
4. Run the app on an emulator or physical device.

---

### 🧾 Author
**Yalda Ashrafi**  
Student Developer | Mobile Application Development  
 Albukhary International University  

