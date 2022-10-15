package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create int GLOBAL VARIABLES here > val

    }

    fun SquareRoot(view: View) {
        //does
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        val textView = findViewById<TextView>(R.id.textview) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        //assign value to global variable
        val newtext = "$oldtext √ ";
        textView.append(newtext)
        textViewMain.setText("")
    }
    fun Power(view: View) {
        //multiply by the exponent
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        val textView = findViewById<TextView>(R.id.textview) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        //assign value to global variable
        val newtext = "$oldtext ^ ";
        textView.append(newtext)
        textViewMain.setText("");
    }
    fun Delete(view: View) {
        //does deleting the previous numbers entered

        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        val textView = findViewById<TextView>(R.id.textview) as TextView
        //assigning the textview numbers to variables
        val oldtext1 = textViewMain.text;
        val oldtext2 = textView.text;
        var newtext = "";

        //check if variable
        if(oldtext1.isNotEmpty()){
            newtext = removeLastChars(oldtext1.toString(), 1)
            textViewMain.text=newtext;
        }
        else{
            newtext = removeLastChars(oldtext2.toString(), 1)
            textView.text=newtext;
        }

    }
    fun removeLastChars(str: String, n: Int): String{
        return str.substring(0,str.length-n)
    }


    fun Plus(view: View) {
        //does addition
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        val textView = findViewById<TextView>(R.id.textview) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        //assign value to global variable
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

    fun Point(view: View) {
        //view in decimal number
        val textViewMain = findViewById<TextView>(R.id.textViewMain) as TextView
        textViewMain.append(".")
    }
    fun Open_Bracket(view: View){

    }
    fun Close_Bracket(view: View){

    }
    fun Reserve(view: View){

    }
    fun PnN(view: View){

    }



}

