# Module 1 — Kotlin & Android Fundamentals

## Overview

**Module 1** is the first stage of my Mobile Application Development learning portfolio. It consists of **three parts**, all completed under the **`module-one` branch**.

This module covers Kotlin programming fundamentals, running Android applications on physical devices and emulators, and building a simple Android application using **Jetpack Compose**.

Through these three parts, I developed foundational skills in **Kotlin, Android Studio, Android debugging, device testing, and modern Android UI development**.

---

##  Module 1 — Parts

| Part | Topic | Main Skills |
|------|-------|-------------|
| **Part 1** | Kotlin Practice | Variables, `val`, `var`, functions, parameters, arithmetic, string interpolation |
| **Part 2** | Running Android Apps on a Physical Device | USB debugging, Wi-Fi debugging, OEM drivers, emulator testing, troubleshooting |
| **Part 3** | Happy Birthday App | Jetpack Compose, Material 3, composable functions, responsive UI, previews |

---

#  Part 1 — Kotlin Practice

## Overview

The first part of Module 1 focuses on **Kotlin programming fundamentals**. I created simple examples using IntelliJ IDEA to practice variables, functions, parameters, arithmetic operations, and output formatting.

### Example 1 — Variables and Keywords

**Concepts covered:**

- `val` for values that do not change
- `var` for mutable values
- Basic `println()` usage

This example demonstrates the difference between `val` and `var` and how Kotlin variables are declared and used.

### Output

![Kotlin Badge](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/0389b5dd05aee06d1f4233b500565c7a8c862211/Assets/badge_Kotlin.png)

![Kotlin Output](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/0389b5dd05aee06d1f4233b500565c7a8c862211/Assets/img.png)

```text
Use the val keyword when the value doesn't change.
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it.
When you call a function, you pass arguments for the parameters.
```

---

### Example 2 — Functions and Arithmetic

**Concepts covered:**

- Function definition and parameters
- Return values
- Basic arithmetic operations

This example implements `add()` and `subtract()` functions and calls them in `main()` to display the results.

### Output

```text
10 + 5 = 15
10 - 8 = 2
```

---

### Example 3 — Functions with Parameters

**Concepts covered:**

- Passing multiple arguments
- String interpolation
- Printing structured data

This example defines `printWeatherForCity()` to display weather information for different cities.

### Output

```text
City: Guatemala City
Low temperature: 50, High temperature: 55
Chance of rain: 2%
```

---

### 🛠️ Tools Used

- **IDE:** IntelliJ IDEA
- **Language:** Kotlin
- **JDK:** 20.0.1

###  Learning Reflection

These examples helped reinforce my understanding of Kotlin fundamentals, especially the difference between `val` and `var`, how functions encapsulate logic, and how parameters and arguments are used.

---

#  Part 2 — Running Android Apps on a Physical Device

## Overview

The second part of Module 1 focused on learning how to run Android applications on a **physical Android device and Android Emulator**.

## What You'll Need

Before running my application on a real device, I made sure I had:

- Android Studio installed on my computer
- A simple Kotlin Android project
- An Android device
- A USB cable
- Appropriate OEM USB drivers when required

---

##  Steps I Followed

### 1. Turned on USB Debugging

I went into my phone's **Developer Options** and enabled **USB Debugging** so that my computer could communicate with the Android device.

### 2. Connected with a USB Cable

I connected my phone to the computer using a USB cable. Since I was using Windows, I also installed the appropriate **OEM USB drivers** to make sure Android Studio could recognize my device.

Once connected, my phone appeared in the Android Studio run menu, allowing me to launch the application directly on the device.

### 3. Tried Running with Wi-Fi

I also learned that Android Studio supports **wireless debugging**. Instead of using a cable, the phone can be paired using:

- QR code
- 6-digit pairing code

This allows the application to be deployed over Wi-Fi.

---

##  Troubleshooting

Some troubleshooting methods I learned include:

- Unplugging and reconnecting the USB cable
- Restarting Android Studio
- Checking whether USB Debugging is enabled
- Re-authorizing the computer on the Android device
- Installing the correct OEM USB driver
- Checking Android Studio's hardware-device configuration

If the device is unauthorized:

1. Open **Settings → Developer Options** on the phone.
2. Revoke USB debugging authorizations.
3. Reconnect the device.
4. Grant authorization again when prompted.

---

##  Running the App on Emulator

Here is my Kotlin application running successfully on the Android Emulator:

![App Running Screenshot](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/cf8b9a3bd0d7c5ce9a072a05786407889c0bad6a/Assets/Hello%20Android.png)

![App Running Screenshot](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/cf8b9a3bd0d7c5ce9a072a05786407889c0bad6a/Assets/highlight.png)

---

##  Reflection

This part taught me how to connect Android Studio to my computer and run applications directly on Android devices.

I learned both **USB and Wi-Fi debugging methods**, basic troubleshooting techniques, and why proper device drivers are important when working with Android devices on Windows.

---

# 🔹 Part 3 — Happy Birthday App

## Overview

The third part of Module 1 involved creating a simple and personalized **Happy Birthday App** using **Kotlin and Jetpack Compose**.

This project demonstrates modern Android UI development by creating a greeting card interface that displays a birthday message and sender name with clean typography and a responsive layout.

---

##  Key Features

- **Jetpack Compose UI** — Fully declarative and modern Android UI framework
- **Material 3 Design** — Modern design system for Android applications
- **Dynamic Layout** — Automatically adapts to different screen sizes
- **Composable Functions** — Reusable, readable, and organized code structure
- **Preview Support** — Real-time UI visualization in Android Studio

---

##  Code Highlight

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

This composable function defines the greeting layout and demonstrates the use of text alignment, font sizing, padding, and reusable Compose components.

---

## 📸 App Preview

| Home Screen | Greeting Card View |
|-------------|--------------------|
| ![Home Screen](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/83655811d3a257f35c7de2e7b81bd122f0c97d6d/Assets/Badges.png) | ![Greeting Card](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/83655811d3a257f35c7de2e7b81bd122f0c97d6d/Assets/badge.png) |

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| **Kotlin** | Core programming language |
| **Jetpack Compose** | Declarative UI framework |
| **Material 3** | Modern Android design system |
| **Android Studio** | Development environment |

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio.git
```

2. Open the project in **Android Studio**.
3. Switch to the **`module-one`** branch.
4. Navigate to the relevant **Module 1** project.
5. Open the required Part folder.
6. Run the application on an **Android Emulator or physical Android device**.

---

# Overall Module 1 Learning Outcomes

By completing all three parts of Module 1, I developed foundational skills in both **Kotlin programming and Android application development**.

### I learned how to:

- Write basic Kotlin programs
- Use `val` and `var`
- Create and call functions
- Work with parameters and return values
- Perform arithmetic operations
- Use string interpolation
- Set up Android projects in Android Studio
- Connect Android devices for application testing
- Configure USB debugging
- Use Wi-Fi debugging
- Run applications on an Android Emulator
- Troubleshoot Android device connection problems
- Build user interfaces using Jetpack Compose
- Use Material 3 design principles
- Create reusable composable functions
- Design a simple responsive Android application

---

# Module 1 Reflection

Module 1 gave me a strong foundation in **mobile application development**.

I started with basic Kotlin programming concepts, then progressed to running Android applications on physical and virtual devices. Finally, I applied these skills by creating a complete **Happy Birthday application using Jetpack Compose**.

The three parts allowed me to gradually connect **programming fundamentals, Android development, device testing, and modern UI design**. This module has prepared me to continue developing more advanced Android applications in the following modules.

---

# 📂 Repository Structure

```text
mobile-app-learning-portfolio/
│
└── Module-1/
    │
    ├── Part-1/
    │   └── Kotlin Practice
    │
    ├── Part-2/
    │   └── Running Android Apps
    │
    └── Part-3/
        └── Happy Birthday App
```

**Branch:** `module-one`

---

## 👩‍💻 Author

**Yalda Ashrafi**  
Student Developer | Mobile Application Development  
**Albukhary International University**
