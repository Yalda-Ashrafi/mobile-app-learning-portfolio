# Module 3: Building Interactive Android UIs

Welcome to the third module of my Android development journey! This module focused on transitioning from static layouts to dynamic, interactive user interfaces using **Jetpack Compose**. I learned how to handle user interactions, manage UI state, and use essential debugging tools in Android Studio.

## 🚀 Projects in this Module

### 1. Interactive Dice Roller App
A fun, interactive application that simulates a dice roll. Users can tap a button to generate a random number, and the app dynamically updates the dice image to reflect the result.

#### Key Learnings & Skills:
*   **Interactivity with Lambdas:** Implemented `onClick` handlers using Kotlin lambdas to trigger app logic.
*   **State Management:** Used the `remember` composable to store objects in memory during recomposition.
*   **Observable State:** Leveraged `mutableStateOf` to create observable state that automatically triggers a UI refresh when the data changes.
*   **Conditional UI:** Utilized Kotlin `when` expressions to dynamically swap drawable resources (`Image` composables) based on state.
*   **Resource Management:** Managed string resources and vector drawables for a clean, translatable, and scalable UI.

---

### 2. Interactive Lemonade App
An interactive multi-step application that takes users through the process of selecting a lemon from a tree, squeezing it multiple times to make juice, drinking the refreshing lemonade, and restarting from an empty glass.

#### Key Learnings & Skills:
*   **Advanced Squeeze Logic:** Implemented a randomized tap threshold (2-4 taps) dynamically generated each time a fresh lemon is chosen from the tree, tracking click progression before advancing.
*   **Highly Reusable UI Components:** Authored a clean, modular `LemonTextAndImage` composable function that parameterized the text label, images, and custom click actions for maintainable and scalable code.
*   **State Optimization:** Utilized specialized `mutableIntStateOf` to store primitive integers directly without boxing overhead, optimizing performance across recompositions.
*   **Visual Polish & Design Guidelines:** Configured precise Material Design parameters, including an `18sp` text size, `16dp` spacer arrangement, `RoundedCornerShape(4.dp)`, and a specialized border stroke color `RGB(105, 205, 216)`.
*   **Accessibility Integration:** Integrated dynamic string resources and distinct content descriptions on all graphical elements to provide full support for screen readers.

---

## 🛠️ Technical Concepts Covered

### Jetpack Compose Fundamentals
*   **Button & Image Composables:** Learning the properties and parameters (like `painterResource` and `contentDescription`) to display interactive visual elements.
*   **Layout Composables:** Deepened understanding of `Column`, `Row`, and `Spacer` for precise UI positioning.
*   **Recomposition:** Understanding how Compose detects state changes and efficiently updates only the necessary parts of the UI.

### Kotlin for Android
*   **Function Literals (Lambdas):** Writing concise, inline functions for callbacks.
*   **Randomness:** Using `(1..6).random()` and `(2..4).random()` to implement game and business logic.

### Debugging in Android Studio
*   Attaching the debugger to a running process.
*   Setting **Breakpoints** to pause execution and inspect variables.
*   Mastering navigation: **Step Into**, **Step Over**, and **Step Out**.
*   Using the Debugger pane to gain deep visibility into the app's runtime behavior.

---
*This portfolio is part of my learning path in the Mobile Application Development course.*
