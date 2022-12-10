package com.example.exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //Setting the array
    val dropdownlist1 = arrayOf("Sodium", "Magnesium", "Indium")
    val dropdownlist2 = arrayOf("Chlorine", "Sulfur", "Phosphorus")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //This is to hide the top bar of the activity screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        supportActionBar?.hide();
        setContentView(R.layout.activity_main)

        val text = "Welcome to PeriodT! Learn Compounds!"

        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_LONG)
        toast.show()

        //Using array adapter to link the spinner to the array
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)

        //Setting the first element to its specific adapter
        element1.adapter = adapter


        //Setting the second element to its specific adapter
        element2.adapter = adapter2


        //Button function for displaying the results
        button.setOnClickListener {
            //Every result has a supporting image using .setImageResource()
            if (element1.selectedItemPosition == 0 && element2.selectedItemPosition == 0)
            {
                result.text = "The result is: Sodium Chloride (NaCl)"
                resultimage.setImageResource(R.drawable.sodiumchloride)
            }
            if (element1.selectedItemPosition == 0 && element2.selectedItemPosition == 1)
            {
                result.text = "The result is: Sodium Sulfide (Na2S)"
                resultimage.setImageResource(R.drawable.sodiumsulfide)
            }
            if (element1.selectedItemPosition == 0 && element2.selectedItemPosition == 2)
            {
                result.text = "The result is: Sodium Phosphide (Na3P)"
                resultimage.setImageResource(R.drawable.sodiumphosphide)
            }
            if (element1.selectedItemPosition == 1 && element2.selectedItemPosition == 0)
            {
                result.text = "The result is: Magnesium Chloride (MgCl2)"
                resultimage.setImageResource(R.drawable.magnesiumchloride)
            }
            if (element1.selectedItemPosition == 1 && element2.selectedItemPosition == 1)
            {
                result.text = "The result is: Magnesium Sulfide (MgS)"
                resultimage.setImageResource(R.drawable.magnesiumsulfide)
            }
            if (element1.selectedItemPosition == 1 && element2.selectedItemPosition == 2)
            {
                result.text = "The result is: Magnesium Phosphide (Mg3P2)"
                resultimage.setImageResource(R.drawable.magnesiumphosphide)
            }
            if (element1.selectedItemPosition == 2 && element2.selectedItemPosition == 0)
            {
                result.text = "The result is: Indium Chloride (InCl3)"
                resultimage.setImageResource(R.drawable.indiumchloride)
            }
            if (element1.selectedItemPosition == 2 && element2.selectedItemPosition == 1)
            {
                result.text = "The result is: Indium Sulfide (InS3)"
                resultimage.setImageResource(R.drawable.indiumsulfide)
            }
            if (element1.selectedItemPosition == 2 && element2.selectedItemPosition == 2)
            {
                result.text = "The result is: Indium Phosphide (InP)"
                resultimage.setImageResource(R.drawable.indiumphosphide)
            }
        }

    }
}