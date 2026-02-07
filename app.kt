I will provide you with a complete Android Kotlin project for a basic calculator app. This includes the `MainActivity.kt` file for the logic and `activity_main.xml` for the layout.

---

**1. `activity_main.xml` (Layout File)**

This file defines the user interface of your calculator. It uses a `GridLayout` for the buttons and a `TextView` to display the input/result.

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <!-- Display Area -->
    <TextView
        android:id="@+id/tvResult"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:background="#E0E0E0"
        android:padding="16dp"
        android:text="0"
        android:textAlignment="viewEnd"
        android:textSize="48sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/gridLayout"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0"
        app:layout_constraintVertical_chainStyle="packed" />

    <!-- Calculator Buttons Grid -->
    <GridLayout
        android:id="@+id/gridLayout"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:columnCount="4"
        android:rowCount="5"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvResult">

        <!-- Row 1 -->
        <Button
            android:id="@+id/btnAC"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:backgroundTint="#FF9800"
            android:onClick="onClear"
            android:text="AC"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btnPlusMinus"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:backgroundTint="#FF9800"
            android:onClick="onOperator"
            android:text="+/-"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btnPercent"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:backgroundTint="#FF9800"
            android:onClick="onOperator"
            android:text="%"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btnDivide"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:backgroundTint="#FF9800"
            android:onClick="onOperator"
            android:text="/"
            android:textSize="24sp" />

        <!-- Row 2 -->
        <Button
            android:id="@+id/btn7"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="7"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btn8"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="8"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btn9"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="9"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btnMultiply"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:backgroundTint="#FF9800"
            android:onClick="onOperator"
            android:text="*"
            android:textSize="24sp" />

        <!-- Row 3 -->
        <Button
            android:id="@+id/btn4"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="4"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btn5"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="5"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btn6"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="6"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btnMinus"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:backgroundTint="#FF9800"
            android:onClick="onOperator"
            android:text="-"
            android:textSize="24sp" />

        <!-- Row 4 -->
        <Button
            android:id="@+id/btn1"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="1"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btn2"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="2"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btn3"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="3"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btnPlus"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:backgroundTint="#FF9800"
            android:onClick="onOperator"
            android:text="+"
            android:textSize="24sp" />

        <!-- Row 5 -->
        <Button
            android:id="@+id/btn0"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnSpan="2"
            android:layout_columnWeight="2"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="0"
            android:textSize="24sp" />

        <Button
            android:id="@+id/btnDot"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:onClick="onDigit"
            android:text="."
            android:textSize="24sp" />

        <Button
            android:id="@+id/btnEquals"
            style="@style/Widget.AppCompat.Button"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_rowWeight="1"
            android:backgroundTint="#FF9800"
            android:onClick="onEqual"
            android:text="="
            android:textSize="24sp" />

    </GridLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
```

**2. `MainActivity.kt` (Kotlin Code)**

This file contains the logic for the calculator, handling button clicks and performing calculations.

```kotlin
package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    private var tvResult: TextView? = null
    private var lastNumeric: Boolean = false
    private var lastDot: Boolean = false
    private var operatorPressed: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResult = findViewById(R.id.tvResult)
    }

    fun onDigit(view: View) {
        if (operatorPressed) {
            tvResult?.text = (view as Button).text
            operatorPressed = false
        } else {
            if (tvResult?.text.toString() == "0") {
                tvResult?.text = (view as Button).text
            } else {
                tvResult?.append((view as Button).text)
            }
        }
        lastNumeric = true
        lastDot = false // Reset lastDot when a new digit is entered
    }

    fun onClear(view: View) {
        tvResult?.text = "0"
        lastNumeric = false
        lastDot = false
        operatorPressed = false
    }

    fun onOperator(view: View) {
        tvResult?.text?.let { value ->
            if (lastNumeric && !isOperatorAdded(value.toString())) {
                val buttonText = (view as Button).text.toString()

                when (buttonText) {
                    "+/-" -> {
                        val currentValue = value.toString()
                        if (currentValue != "0") {
                            // Check if it's already negative
                            if (currentValue.startsWith("-")) {
                                tvResult?.text = currentValue.substring(1) // Remove minus
                            } else {
                                tvResult?.text = "-$currentValue" // Add minus
                            }
                        }
                    }
                    "%" -> {
                        try {
                            val number = BigDecimal(value.toString())
                            val result = number.divide(BigDecimal(100), 10, RoundingMode.HALF_UP) // Divide by 100
                            tvResult?.text = removeZeroAfterDot(result.toPlainString())
                        } catch (e: Exception) {
                            tvResult?.text = "Error"
                        }
                        lastNumeric = true
                        lastDot = false
                        operatorPressed = true // Treat as an operation completed
                    }
                    else -> { // For +, -, *, /
                        tvResult?.append(buttonText)
                        lastNumeric = false
                        lastDot = false
                        operatorPressed = true
                    }
                }
            }
        }
    }

    fun onEqual(view: View) {
        if (lastNumeric) {
            var tvValue = tvResult?.text.toString()
            var prefix = ""

            try {
                if (tvValue.startsWith("-")) {
                    prefix = "-"
                    tvValue = tvValue.substring(1)
                }

                if (tvValue.contains("-") && !tvValue.startsWith("-")) { // Subtraction
                    val splitValue = tvValue.split("-")
                    var one = BigDecimal(splitValue[0])
                    val two = BigDecimal(splitValue[1])
                    if (prefix.isNotEmpty()) {
                        one = one.negate()
                    }
                    tvResult?.text = removeZeroAfterDot((one - two).toPlainString())
                } else if (tvValue.contains("+")) { // Addition
                    val splitValue = tvValue.split("+")
                    var one = BigDecimal(splitValue[0])
                    val two = BigDecimal(splitValue[1])
                    if (prefix.isNotEmpty()) {
                        one = one.negate()
                    }
                    tvResult?.text = removeZeroAfterDot((one + two).toPlainString())
                } else if (tvValue.contains("*")) { // Multiplication
                    val splitValue = tvValue.split("*")
                    var one = BigDecimal(splitValue[0])
                    val two = BigDecimal(splitValue[1])
                    if (prefix.isNotEmpty()) {
                        one = one.negate()
                    }
                    tvResult?.text = removeZeroAfterDot((one * two).toPlainString())
                } else if (tvValue.contains("/")) { // Division
                    val splitValue = tvValue.split("/")
                    var one = BigDecimal(splitValue[0])
                    val two = BigDecimal(splitValue[1])
                    if (prefix.isNotEmpty()) {
                        one = one.negate()
                    }
                    // Handle division by zero
                    if (two == BigDecimal.ZERO) {
                        tvResult?.text = "Error"
                        return
                    }
                    tvResult?.text = removeZeroAfterDot(one.divide(two, 10, RoundingMode.HALF_UP).toPlainString())
                }
            } catch (e: ArithmeticException) {
                tvResult?.text = "Error"
            } catch (e: Exception) {
                tvResult?.text = "Error"
            }
        }
        lastNumeric = true
        lastDot = false
        operatorPressed = true // After calculation, next digit should clear the screen
    }

    private fun removeZeroAfterDot(result: String): String {
        var value = result
        if (value.contains(".0")) {
            value = value.substring(0, value.length - 2)
        }
        // If it's a very long decimal, trim it to a reasonable length for display
        if (value.contains(".") && value.length > 15) {
            val decimalPart = value.substringAfter(".")
            if (decimalPart.length > 10) { // Keep up to 10 decimal places
                val truncated = BigDecimal(value).setScale(10, RoundingMode.HALF_UP).toPlainString()
                return removeZeroAfterDot(truncated) // Re-apply .0 removal
            }
        }
        return value
    }

    private fun isOperatorAdded(value: String): Boolean {
        // Check if the last character is an operator (excluding the leading minus for negative numbers)
        return if (value.startsWith("-")) {
            false // A leading minus sign is not considered an operator for this check
        } else {
            value.contains("/") || value.contains("*") || value.contains("+") || value.contains("-")
        }
    }
}
```

**3. `build.gradle.kts (app)` (Module: app)**

You generally don't need to change much here, but ensure you have the standard dependencies.

```kotlin
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.mycalculator" // Make sure this matches your package name
    compileSdk = 34 // Or your desired SDK version

    defaultConfig {
        applicationId = "com.example.mycalculator" // Make sure this matches your package name
        minSdk = 24 // Or your desired min SDK version
        targetSdk = 34 // Or your desired SDK version
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
```

**How to set up in Android Studio:**

1.  **Create a New Project:** Open Android Studio, select "New Project," choose "Empty Activity," and click "Next."
2.  **Configure Project:**
    *   Set "Name" to "MyCalculator" (or whatever you like).
    *   Set "Package name" to `com.example.mycalculator` (or your preferred package).
    *   Set "Language" to Kotlin.
    *   Click "Finish."
3.  **Replace `activity_main.xml`:** Navigate to `app > src > main > res > layout` and open `activity_main.xml`. Replace its entire content with the XML code provided above.
4.  **Replace `MainActivity.kt`:** Navigate to `app > src > main > java > com.example.mycalculator` (or your package name) and open `MainActivity.kt`. Replace its entire content with the Kotlin code provided above.
5.  **Sync Gradle:** Android Studio might prompt you to sync Gradle after changes. If not, go to `File > Sync Project with Gradle Files`.
6.  **Run the App:** Click the "Run" button (green triangle) in the toolbar to deploy the app to an emulator or a connected device.

This calculator handles basic arithmetic operations (+, -, \*, /), percentage, sign change, and decimal numbers. It also includes basic error handling for division by zero.