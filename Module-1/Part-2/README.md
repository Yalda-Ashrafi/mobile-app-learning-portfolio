
#  Module‑1 — Part‑2  
## Running Android Apps on a Physical Device

##  What You'll Need
Before I could run my app on a real device, I made sure I had:
- Android Studio installed on my computer  
- A simple Kotlin project already set up  

---

###  Steps I Followed
1. **Turned on USB Debugging**  
   I went into my phone’s Developer Options and enabled USB Debugging so my computer could talk to the device.  

2. **Connected with a USB Cable**  
   I plugged my phone into the computer. Since I’m on Windows, I also installed the OEM USB drivers to make sure Android Studio recognized my device. Once connected, I could see my phone listed in the run menu and launch the app directly.  

3. **Tried Running with Wi‑Fi**  
   I learned that if I don’t have a cable, I can still connect wirelessly. Android Studio lets me pair my phone using either a QR code or a 6‑digit code, and then I can run the app over Wi‑Fi.  

---

###  Troubleshooting
- If Android Studio doesn’t recognize the device: unplug/replug the cable or restart Android Studio  
- If the device is unauthorized:  
  - On the phone → Settings → Developer Options → Revoke USB debugging authorizations  
  - Reconnect and grant authorization again  
- Windows/Linux users: check **Run apps on a hardware device** guide  
- Windows users: install the correct **OEM USB driver** if emulator/device connection fails  

---
### Running the App on Emulator
Here is my Kotlin app running successfully on the Android Emulator:

![App Running Screenshot](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/cf8b9a3bd0d7c5ce9a072a05786407889c0bad6a/Assets/Hello%20Android.png)
![App Running Screenshot](https://github.com/Yalda-Ashrafi/mobile-app-learning-portfolio/blob/cf8b9a3bd0d7c5ce9a072a05786407889c0bad6a/Assets/highlight.png)


---

###  Reflection
This part taught me how to connect Android Studio to my PC and run apps directly on my phone. I now understand both USB and Wi‑Fi debugging methods, how to troubleshoot connection issues, and why proper drivers are essential for Windows users.
