# Module 4: Interacting with UI and State - Tip Time App

## Overview
This module focuses on building a dynamic and interactive user interface using **Jetpack Compose**. The primary project is **Tip Time**, a functional tip calculator that demonstrates the power of state management, user input handling, and adaptive layouts in modern Android development.

## 🚀 Key Features
- **Dynamic Tip Calculation**: Calculates tips in real-time as the user types.
- **Customizable Tip Percentage**: Users can enter a custom percentage to calculate the tip.
- **Rounding Logic**: A toggle switch allows users to round up the tip to the nearest whole number.
- **Icon Integration**: Visual cues using Material Design icons for better UX.
- **Adaptive Layout**: Support for both portrait and landscape orientations with vertical scrolling.
- **Keyboard Optimization**: Specifically configured keyboard types and action buttons (Next/Done) for a smooth input flow.

## 📸 Visuals

### App UI
![Tip Time UI](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/raw/6d55a261730c9af0f1faad9979fb67ad3494e5ef/Assets/D.png)

### 🎥 Demo Video
Watch the app in action: [Tip Time App Demo Recording](https://drive.google.com/file/d/13oH_4V-obi_SgFjfkcyBC8sDlRVvxCA2/view?usp=sharing)

---

## 🧠 Concepts Learned

### 1. State and Recomposition
Understanding how Compose tracks changes to data and automatically updates the UI.
- Use of `mutableStateOf` to create observable state.
- Use of `remember` to persist state across recompositions.

### 2. State Hoisting
The pattern of moving state to a caller to make components stateless and reusable.
- Extracting state from `EditNumberField` to `TipTimeLayout`.
- Passing data down via parameters and events up via callbacks.

### 3. Material 3 Components
Deep dive into essential UI elements:
- `TextField`: Handling text and number input.
- `Switch`: Toggling preferences.
- `Row` & `Column`: Building structured layouts.
- `Icon`: Enhancing visual communication.

### 4. User Experience (UX)
- Configuring `KeyboardOptions` (numeric keypad).
- Setting `ImeAction` for efficient navigation between fields.
- Implementing scrolling for smaller screens or landscape mode.

---

## 🛠️ Technology Stack
- **Language**: Kotlin
- **Framework**: Jetpack Compose
- **Design System**: Material Design 3

## 📂 Project Structure
The source code for this module can be found in the [TipCalculator](TipCalculator/) directory.
