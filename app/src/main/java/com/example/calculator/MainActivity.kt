package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.textview) as TextView

    }

    fun Plus(view: View) {
        //does addition
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        val textView = findViewById<TextView>(R.id.textview) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        val newtext = "$oldtext + ";
        textView.append(newtext)
        textViewMain.setText("");
    }
    fun Minus(view: View) {
        //does subtraction
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        val textView = findViewById<TextView>(R.id.textview) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        val newtext = "$oldtext - ";
        textView.append(newtext)
        textViewMain.setText("");
    }
    fun Multiply(view: View) {
        //does multiplying
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        val textView = findViewById<TextView>(R.id.textview) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        val newtext = "$oldtext * ";
        textView.append(newtext)
        textViewMain.setText("");
    }
    fun Divide(view: View) {
        //does divide
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        val textView = findViewById<TextView>(R.id.textview) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        val newtext = "$oldtext / ";
        textView.append(newtext)
        textViewMain.setText("");
    }
    fun Seven(view: View) {
        //view the number seven
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("7")
    }
    fun Eight(view: View) {
        //view the number eight
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("8")
    }
    fun Nine(view: View) {
        //view the number nine
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("9")
    }
    fun Clear(view: View) {
        //does clear
        val textView = findViewById<TextView>(R.id.textview) as TextView
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textView.setText("");
        textViewMain.setText("");
    }
    fun Four(view: View) {
        //view the number four
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("4")
    }
    fun Five(view: View) {
        //view the number five
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("5")
    }
    fun Six(view: View) {
        //view the number six
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("6")
    }
    fun Zero(view: View) {
        //view the number zero
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("0")
    }
    fun One(view: View) {
        //view the number one
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("1")
    }
    fun Two(view: View) {
        //view the number two
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("2")
    }
    fun Three(view: View) {
        //view the number three
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append("3")
    }
    fun Equal(view: View) {
        //view the answer
        val textView = findViewById<TextView>(R.id.textview) as TextView

    }


}

