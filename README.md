# 📱 Practical 6 – Frame-by-Frame Animation & Splash Screen

## 📌 Aim

**Create an Android application to demonstrate Frame-by-Frame Animation and Splash Screen to demonstrate Tween Animation.**

This practical is developed as part of the **Mobile Application Development (MAD)** course. The application demonstrates different types of Android animations, including **Frame-by-Frame Animation** and **Tween Animation** using a Splash Screen.

---

## 🎯 Objectives

The main objectives of this practical are:

* Understand the concept of **Animation** in Android.
* Implement **Frame-by-Frame Animation**.
* Implement a **Splash Screen**.
* Demonstrate **Tween Animation**.
* Apply animation effects to Android UI components.
* Understand how multiple animation frames can create a continuous animation.
* Understand how animation can be used during application startup.

---

## 🛠️ Technologies Used

* **IDE:** Android Studio
* **Language:** Kotlin
* **UI:** XML
* **Platform:** Android
* **Build System:** Gradle
* **Animation:** Frame-by-Frame Animation & Tween Animation

---

# 🎬 What is Animation?

**Animation** in Android is used to create visual effects and make an application's user interface more interactive and attractive.

Android provides different ways to implement animations.

In this practical, two animation concepts are demonstrated:

1. **Frame-by-Frame Animation**
2. **Tween Animation**

---

# 1️⃣ Frame-by-Frame Animation

**Frame-by-Frame Animation** displays a sequence of different images one after another.

Each image is called a **frame**. When the frames are displayed quickly in sequence, they create the appearance of movement.

### Working

```text
Frame 1
   ↓
Frame 2
   ↓
Frame 3
   ↓
Frame 4
   ↓
Animation
```

### Example

```text
Image 1 → Image 2 → Image 3 → Image 4
                ↓
        Continuous Animation
```

Frame-by-Frame animation is useful when an animation requires different images for each stage of movement.

---

# 2️⃣ Splash Screen

A **Splash Screen** is the screen displayed when an application starts.

It is generally used to display the application logo, name, or a short animation before the main screen appears.

### Working

```text
Application Start
       ↓
Splash Screen
       ↓
Animation
       ↓
Main Activity
```

---

# 3️⃣ Tween Animation

**Tween Animation** creates movement or transformation of a UI component from one state to another.

It can be used for effects such as:

* Alpha
* Scale
* Rotate
* Translate

For example:

```text
Small / Invisible
        ↓
     Animation
        ↓
Large / Visible
```

Tween animation changes the properties of an object over a period of time.

---

# 🔄 Overall Working of Application

The overall working of the application can be represented as:

```text
Application Launch
       ↓
Splash Screen
       ↓
Tween Animation
       ↓
Main Activity
       ↓
Frame-by-Frame Animation
```

---

# 📱 Application Demonstration

The application demonstrates both types of animation.

### Frame-by-Frame Animation

A sequence of images is displayed one after another.

```text
Image 1
   ↓
Image 2
   ↓
Image 3
   ↓
Image 4
   ↓
Frame-by-Frame Animation
```

### Splash Screen with Tween Animation

When the application starts, the Splash Screen is displayed with an animation effect.

```text
Application Start
       ↓
Splash Screen
       ↓
Tween Animation
       ↓
Main Activity
```

---

# 🔗 Types of Animation Used

| **Animation Type**           | **Purpose**                                     |
| ---------------------------- | ----------------------------------------------- |
| **Frame-by-Frame Animation** | Displays multiple images sequentially           |
| **Tween Animation**          | Creates movement/transformation effects         |
| **Splash Screen Animation**  | Provides an animated application startup screen |

---

# 🔄 Difference Between Frame-by-Frame and Tween Animation

| **Feature**            | **Frame-by-Frame Animation**   | **Tween Animation**            |
| ---------------------- | ------------------------------ | ------------------------------ |
| Working                | Displays a sequence of images  | Changes properties of a view   |
| Frames                 | Multiple images are used       | Start and end states are used  |
| Main purpose           | Creates animation using images | Creates transformation effects |
| Example                | Image sequence                 | Fade, rotate, scale, translate |
| Used in this practical | Yes                            | Yes                            |

---

# 📂 Project Structure

```text
24012021039_pratical_6_MAD/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── ...
│           │
│           ├── res/
│           │   ├── anim/
│           │   ├── drawable/
│           │   ├── mipmap/
│           │   ├── values/
│           │   └── layout/
│           │       └── ...
│           │
│           └── AndroidManifest.xml
│
├── gradle/
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
└── README.md
```

The repository contains the Android application module and standard Gradle project files.

---

# ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/jiyapatel02/24012021039_pratical_6_MAD.git
```

2. Open **Android Studio**.
3. Select **Open** and choose the cloned project folder.
4. Allow Gradle to sync.
5. Connect an Android device or start an Android Emulator.
6. Click the **Run ▶** button.
7. Launch the application.
8. Observe the Splash Screen animation.
9. Test the Frame-by-Frame Animation in the application.

---

# 🧪 Practical Testing

## Test 1 – Splash Screen

**Action:** Launch the application.

**Expected Result:**

```text
Application Launch
       ↓
Splash Screen
       ↓
Tween Animation
       ↓
Main Activity
```

The Splash Screen is displayed with the configured animation before the main screen appears.

---

## Test 2 – Frame-by-Frame Animation

**Action:** Open the animation section of the application.

**Expected Result:**

```text
Frame 1
   ↓
Frame 2
   ↓
Frame 3
   ↓
Frame 4
   ↓
Continuous Animation
```

The images are displayed sequentially to create a frame-by-frame animation.

---

# 📚 Concepts Covered

| **No.** | **Concept**              |
| ------- | ------------------------ |
| 1       | Android Animation        |
| 2       | Frame-by-Frame Animation |
| 3       | Tween Animation          |
| 4       | Splash Screen            |
| 5       | Image Sequence           |
| 6       | Alpha Animation          |
| 7       | Scale Animation          |
| 8       | Rotate Animation         |
| 9       | Translate Animation      |
| 10      | Android UI Animation     |

---

# 🎓 Learning Outcome

After completing this practical, we understand:

* What animation is in Android.
* How **Frame-by-Frame Animation** works.
* How to display a sequence of images as an animation.
* What a **Splash Screen** is.
* How to implement a Splash Screen in an Android application.
* How **Tween Animation** works.
* How animation can be used to improve the user interface.
* How different animation techniques can be implemented in Android applications.

---

# 👩‍💻 Author

**Jiya Patel**

**B.Tech – Information Technology**

**Mobile Application Development (MAD)**

---

## 🔗 GitHub Repository

[24012021039_pratical_6_MAD – GitHub Repository](https://github.com/jiyapatel02/24012021039_pratical_6_MAD)

---

## ⭐ Conclusion

This practical provides an understanding of **Frame-by-Frame Animation, Tween Animation, and Splash Screen** in Android.

By developing this application, we learn how to create animations using a sequence of images and how to apply animation effects to a Splash Screen.

The practical demonstrates how Android animation techniques can be used to create a more interactive and visually engaging application.
