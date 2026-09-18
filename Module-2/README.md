# Module 2: Kotlin Fundamentals Practice Solutions

This module contains a series of Kotlin programming exercises designed to master the core concepts of the language, such as classes, inheritance, conditional logic, and functional programming.

To enhance the learning experience, these exercises have been integrated into a **Jetpack Compose Android Application**, allowing them to be executed and viewed directly on an Android emulator.
![image alt](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/5ec2b17d784ecc529e616d705b479594b8f261a5/Module-2/LLL.png)

##  Interactive Features

*   **Exercise Menu:** A clean, button-based UI to switch between different Kotlin logic problems.
*   **Console Redirect:** Captures standard `println()` output from standalone Kotlin files and displays it within the app's UI.
*   **Scrollable Output:** Handles long exercise results with a smooth vertical scroll.

##  Included Exercises

1.  **Mobile Notifications:** Handles notification summaries based on the number of messages.
2.  **Movie Ticket Price:** Calculates ticket pricing based on age and day of the week (Monday discounts).
3.  **Temperature Converter:** Uses higher-order functions to convert between Celsius, Fahrenheit, and Kelvin.
4.  **Internet Profile:** Demonstrates class relationships, nullability, and formatted string output.
5.  **Song Catalog:** Implements a simple class to track song metadata and popularity.
6.  **Foldable Phones:** Explores inheritance and method overriding to simulate foldable device states.
7.  **Special Auction:** Uses null-safety operators (`?.` and `?:`) to handle bidding logic.

##  How to Run

1.  Open the project in **Android Studio**.
2.  Select the **'app'** run configuration.
3.  Click **Run** (Green Play Button) to launch on an Emulator or Physical Device.
4.  Use the menu buttons to trigger each exercise's logic.

## 💻 Technical Details

*   **Language:** Kotlin
*   **UI Framework:** Jetpack Compose (Material 3)
*   **Architecture:** Modular exercise logic separated from the View layer.
*   **Helper Utility:** `OutputCapturer.kt` handles the redirection of `System.out` to `StateFlow` for UI rendering.

---
*Part of the Mobile App Learning Portfolio.*
