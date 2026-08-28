
##  Happy Birthday App — Module 1 Part 3

###  Overview
The **Happy Birthday App** is an Android project built with **Kotlin** and **Jetpack Compose**.  
It was developed as part of *Module 1 – Part 3* in the Mobile Application Development course.  
The app displays a personalized birthday greeting message with clean typography and responsive layout.

---

###  Key Features
- **Jetpack Compose UI** — declarative and modern Android UI framework  
- **Material 3 Design** — polished look with adaptive theming  
- **Dynamic Layout** — adjusts to different screen sizes  
- **Composable Functions** — reusable and efficient code structure  
- **Preview Support** — real‑time design visualization in Android Studio  

---

###  Code Highlights
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

---

###  App Preview

| 🎂 Greeting Screen | 💌 Output Screen |
|--------------------|------------------|
| ![image alt](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/0f0119b64fe2e172fa0947fd4c6dfa801e92aba1/Assets/Happy_Birthday.png)
| ![image alt](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/0f0119b64fe2e172fa0947fd4c6dfa801e92aba1/Assets/Output.png)
 ![image alt](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/83655811d3a257f35c7de2e7b81bd122f0c97d6d/Assets/Badges.png)
 ![image alt](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/83655811d3a257f35c7de2e7b81bd122f0c97d6d/Assets/badge.png)

###  Tech Stack
| Technology | Purpose |
|-------------|----------|
| **Kotlin** | Core programming language |
| **Jetpack Compose** | Declarative UI framework |
| **Material 3** | Design system |
| **Android Studio** | Development environment |

---

###  How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio.git
   ```
2. Open the project in **Android Studio**.  
3. Navigate to `Module‑1/Part‑3`.  
4. Run the app on an emulator or physical device.  

---

### 🧾 Author
**Yalda Ashrafi**  
Student Developer | Mobile Application Development  
Albukhary International University

