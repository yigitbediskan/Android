package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var foods: ArrayList<String> =
        arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese");
    private lateinit var foodText: TextView;
    private lateinit var newFood: EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var addFood: Button = findViewById(R.id.addFoodButton);
        var decide: Button = findViewById(R.id.decideButton);
        foodText = findViewById(R.id.foodText);
        newFood = findViewById(R.id.newFood);

        addFood.setOnClickListener {
            addFoodToList();
        }

        decide.setOnClickListener {
            decide();
        }

    }

    private fun decide() {
        foodText.text = foods.random();
    }

    private fun addFoodToList() {

        if (!newFood.text.toString().equals("") && !foods.contains(newFood.text.toString())) {
            foods.add(newFood.text.toString())
        }
    }
}