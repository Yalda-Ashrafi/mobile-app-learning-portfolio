# Enable running Kotlin Exercises on Emulator

This plan introduces a menu in the `MainActivity` to select and run different Kotlin exercises (`InternetProfile`, `MovieTicketPrice`, etc.) and display their output directly on the emulator screen.

## User Review Required

> [!IMPORTANT]
> To capture the `println()` output from your exercises without modifying your existing code, I will use a helper that temporarily redirects standard output. This allows your exercises to stay exactly as they are while still showing up on the phone screen.

## Proposed Changes

### [app]

#### [NEW] [OutputCapturer.kt](file:///E:/5th_Semester/KotlinPracticeSolutions/app/src/main/java/my/edu/aiu/app/kotlinpracticesolutions/OutputCapturer.kt)
A utility class to capture everything printed to the console within a block of code.

#### [MODIFY] [MainActivity.kt](file:///E:/5th_Semester/KotlinPracticeSolutions/app/src/main/java/my/edu/aiu/app/kotlinpracticesolutions/MainActivity.kt)
Update the UI to show a list of exercises and a display area for the results.

## Verification Plan

### Manual Verification
1. Run the app on the emulator.
2. Select "Internet Profile" from the menu.
3. Verify that the output (Name, Age, etc.) appears on the screen.
4. Select another exercise and verify its output replaces the previous one.
