# Woof App

## Description
Woof App is a simple Android application developed using Kotlin and Jetpack Compose. It displays a list of dogs with their names, ages, and images. The application uses a vertically scrollable list and Material Design cards to present dog information in a clean and organized layout.

## Aim
To develop an Android application that displays dog information using Kotlin and Jetpack Compose.

## Features
- Displays a list of nine dogs.
- Shows each dog's name, age, and image.
- Uses a scrollable list to display multiple dogs.
- Presents dog details inside Material Design cards.
- Provides a simple and user-friendly interface.
- Includes a preview of the application UI.

## Technologies Used
- **Programming Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Design:** Material 3
- **IDE:** Android Studio

## Application Components
- `MainActivity.kt` – Main entry point of the application.
- `Dog` – Data class that stores the dog's name, age, and image resource.
- `WoofApp()` – Creates the dog list and displays it using `LazyColumn`.
- `DogItem()` – Displays an individual dog's image, name, and age inside a card.
- `WoofAppPreview()` – Provides a preview of the application UI.

## Dog Details
The application displays the following dogs:

- Sana – 2 years
- Rosii – 1 year
- Shihtzu – 3 years
- Lola – 1 year
- Juicy – 3 years
- Coco – 2 years
- Browni – 3 years
- Lusi – 2 years
- Koda – 1 year

## Required Image Resources
Place the following images in the `res/drawable` folder:

- `pic1`
- `pic2`
- `pic3`
- `pic4`
- `pic5`
- `pic6`

Some images are reused for multiple dogs.

## How to Run
1. Clone or download the repository.
2. Open the project in Android Studio.
3. Add all required images to the `res/drawable` folder.
4. Sync the Gradle files.
5. Run the application on an Android emulator or physical device.
6. Scroll through the list to view the dog details.

## Concepts Learned
- Kotlin data classes and lists
- Jetpack Compose composable functions
- `LazyColumn` and `items`
- Layouts using `Row`, `Column`, and `Spacer`
- Displaying images with `painterResource`
- Material 3 cards and surfaces
- Modifiers, padding, and alignment
- Creating previews using `@Preview`

## Author
**Kondri Indumathi**
