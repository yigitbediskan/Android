package com.example.tablelayouttest

import android.content.Context
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btn_add : Button
    private lateinit var et_androidVersion : EditText
    private lateinit var et_codeName : EditText
    private lateinit var tl : TableLayout
    private lateinit var tr : TableRow
    private lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add = findViewById(R.id.button)
        btn_add.setOnClickListener {
            if(!et_androidVersion.text.toString().equals("") && !et_codeName.text.toString().equals(""))
                addNewRow()
            else{
                Toast.makeText(applicationContext, "Please fill all the boxes and try again", Toast.LENGTH_SHORT).show()
            }
        }
        et_androidVersion = findViewById(R.id.androidVersion)
        et_codeName = findViewById(R.id.codeName)
        tl = findViewById(R.id.TableLay)
        tr = findViewById(R.id.tableRow_2) // for getting layout params of the static rows
        tv = findViewById(R.id.tvTmp) // for getting layout params of the static textViews of the rows
    }
    private fun addNewRow(){
        val tableRow = TableRow(this)
        tableRow.layoutParams = tr.layoutParams
        tableRow.setBackgroundResource(R.color.purple_200)
        val tv1  = TextView(this)
        val tv2  = TextView(this)

        tv1.layoutParams = tv.layoutParams
        tv1.setText(et_androidVersion.text.toString())
        tv1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16.0f)

        tv2.layoutParams = tv.layoutParams
        tv2.setText(et_codeName.text.toString())
        tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16.0f)

        tableRow.addView(tv1,0)
        tableRow.addView(tv2,1)

        tl.addView(tableRow)

        et_androidVersion.setText("")
        et_codeName.setText("")
    }

}