package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var foods: ArrayList<String> =
        arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese", "Turkish");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var addFood: Button = findViewById(R.id.addFoodButton);
        var decide: Button = findViewById(R.id.decideButton);
        var foodText: TextView = findViewById(R.id.foodText);
        var newFood: EditText = findViewById(R.id.newFood);

        addFood.setOnClickListener {
            addFoodToList(newFood);
        }

        decide.setOnClickListener {
            decide(foodText);
        }

    }

    private fun decide(foodText: TextView) {
        foodText.text = foods.random();
    }

    private fun addFoodToList(newFood: EditText) {

        if (!newFood.text.toString().equals("") && !foods.contains(newFood.text.toString())) {
            foods.add(newFood.text.toString())
        }
    }
}