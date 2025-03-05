package com.example.deisidrata_te

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deisidrata_te.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    override fun onResume(){
        super.onResume()

        binding.submitButton.setOnClickListener{
            val drinkIndex = binding.spinnerDrink.selectedItemPosition


            val drinkType = DrinkType.entries[drinkIndex]
            val amount = binding.sliderAmount.value.toInt()
            val notes = binding.inputNotes.text.toString()

        }
    }
}