package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //, View.OnClickListener
    //val operations: List<String> = listOf("+","-","*","/","√","^","%");
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val operations: List<String> = listOf("+","-","*","/","√","^","%");
        val entries: MutableList<String> = mutableListOf()
    }

    fun SquareRoot() {
        //does
        val textViewMain = findViewById<TextView>(R.id.solution_tv) as TextView
        val textView = findViewById<TextView>(R.id.result_tv) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        //assign value to global variable
        val newtext = "$oldtext √ ";
        textView.append(newtext)
        textViewMain.setText("")
    }
    fun Power() {
        //multiply by the exponent
        val textViewMain = findViewById<TextView>(R.id.solution_tv) as TextView
        val textView = findViewById<TextView>(R.id.result_tv) as TextView
        val oldtext = textViewMain.text;
        //val oldtextInt = Integer.parseInt(oldtext as String);
        //assign value to global variable
        val newtext = "$oldtext ^ ";
        textView.append(newtext)
        textViewMain.setText("");
    }
    fun BackSpace() {
        val resutTV = findViewById<TextView>(R.id.result_tv) as TextView
        val oldtext1 = resutTV.text;
        if(oldtext1.isNotEmpty()){
            var newtext = removeLastChars(oldtext1.toString(), 1)
            resutTV.text=newtext;
        }
    }
    fun removeLastChars(str: String, n: Int): String{
        return str.substring(0,str.length-n)
    }
    fun Plus() {
        val solutionTv = findViewById<TextView>(R.id.solution_tv) as TextView
        val resultTV = findViewById<TextView>(R.id.result_tv) as TextView
        val resultOldtext = resultTV.text.toString()
        val solutionOldtext = solutionTv.text.toString()

        if(resultOldtext.isNotEmpty()){
            val newtext = "$resultOldtext+";
            solutionTv.append(newtext)
            resultTV.setText("");
        }else{
            var newtext = removeLastChars(solutionOldtext.toString(), 1)
            newtext += "+"
            solutionTv.text=newtext;
        }
    }

    fun Minus() {
        val solutionTv = findViewById<TextView>(R.id.solution_tv) as TextView
        val resultTV = findViewById<TextView>(R.id.result_tv) as TextView
        val resultOldtext = resultTV.text.toString()
        val solutionOldtext = solutionTv.text.toString()

        if(resultOldtext.isNotEmpty()){
            val newtext = "$resultOldtext+";
            solutionTv.append(newtext)
            resultTV.setText("");
        }else{
            var newtext = removeLastChars(solutionOldtext.toString(), 1)
            newtext += "-"
            solutionTv.text=newtext;
        }
    }

    fun Multiply() {
        val solutionTv = findViewById<TextView>(R.id.solution_tv) as TextView
        val resultTV = findViewById<TextView>(R.id.result_tv) as TextView
        val resultOldtext = resultTV.text.toString()
        val solutionOldtext = solutionTv.text.toString()

        if(resultOldtext.isNotEmpty()){
            val newtext = "$resultOldtext+";
            solutionTv.append(newtext)
            resultTV.setText("");
        }else{
            var newtext = removeLastChars(solutionOldtext.toString(), 1)
            newtext += "*"
            solutionTv.text=newtext;
        }
    }

    fun Divide() {
        val solutionTv = findViewById<TextView>(R.id.solution_tv) as TextView
        val resultTV = findViewById<TextView>(R.id.result_tv) as TextView
        val resultOldtext = resultTV.text.toString()
        val solutionOldtext = solutionTv.text.toString()

        if(resultOldtext.isNotEmpty()){
            val newtext = "$resultOldtext+";
            solutionTv.append(newtext)
            resultTV.setText("");
        }else{
            var newtext = removeLastChars(solutionOldtext.toString(), 1)
            newtext += "/"
            solutionTv.text=newtext;
        }
    }

    fun Clear(view: View) {
        val textView = findViewById<TextView>(R.id.result_tv) as TextView
        val textViewMain = findViewById<TextView>(R.id.solution_tv) as TextView
        textView.setText("");
        textViewMain.setText("");
    }
    fun Dot(){

    }

    fun Equal(view: View) {
        //view the answer
        val textView = findViewById<TextView>(R.id.result_tv) as TextView

    }

    fun Percent(){

    }

    fun NumberEvent(view: View) {
        val solutionTV = findViewById<TextView>(R.id.solution_tv) as TextView
        val ResultTV = findViewById<TextView>(R.id.result_tv) as TextView

        when(view.id){
            //numbers
            R.id.Btn1 -> {ResultTV.append("1")}
            R.id.Btn2 -> {ResultTV.append("2")}
            R.id.Btn3 -> {ResultTV.append("3")}
            R.id.Btn4 -> {ResultTV.append("4")}
            R.id.Btn5 -> {ResultTV.append("5")}
            R.id.Btn6 -> {ResultTV.append("6")}
            R.id.Btn7 -> {ResultTV.append("7")}
            R.id.Btn8 -> {ResultTV.append("8")}
            R.id.Btn9 -> {ResultTV.append("9")}
            R.id.Btn0 -> {ResultTV.append("0")}
            //other
            R.id.open_bracket_Btn -> {ResultTV.append("(")}
            R.id.close_bracket_Btn -> {ResultTV.append(")")}
            R.id.Btn_Dot -> {ResultTV.append(".")}
            R.id.PnN_Btn -> {Dot()}
            R.id.backspace_Btn -> {BackSpace()}
            //special symbols

        }
    }

    fun OperationEvent(view: View) {
        val ResultTV = findViewById<TextView>(R.id.result_tv) as TextView
        when(view.id){
            R.id.minus_Btn -> {Minus()}
            R.id.plus_Btn -> {Plus()}
            R.id.multiply_Btn -> {Multiply()}
            R.id.divide_Btn -> {Divide()}
            R.id.power_Btn -> {Power()}
            R.id.SqRoot_Btn -> {SquareRoot()}
            R.id.percent_Btn -> {Percent()}
        }
    }


}

