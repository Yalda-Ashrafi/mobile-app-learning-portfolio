
#  Module‑1 — Part‑2  
## Running Android Apps on a Physical Device

###  What You'll Need
- Android Studio installed on your computer  
- An app project set up in Android Studio  

---

###  Steps I Learned
1. **Enable USB Debugging**  
   - Turn on Developer Options on the phone  
   - Enable USB Debugging  

2. **Run with a USB Cable**  
   - Connect the phone via USB  
   - Install OEM USB drivers (Windows) if needed  
   - Select the device in Android Studio and run the app  

3. **Run with Wi‑Fi**  
   - Pair using a QR code or 6‑digit code  
   - Run the app wirelessly if no cable is available  

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

### 🧩 Reflection
This part taught me how to connect Android Studio to my PC and run apps directly on my phone. I now understand both USB and Wi‑Fi debugging methods, how to troubleshoot connection issues, and why proper drivers are essential for Windows users.
