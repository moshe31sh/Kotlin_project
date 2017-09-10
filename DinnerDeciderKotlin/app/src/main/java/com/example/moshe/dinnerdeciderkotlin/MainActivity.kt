package com.example.moshe.dinnerdeciderkotlin

import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

/**
 * Created by moshe on 10/09/2017.
 */


class MainActivity : BaseActivity(){

    private val foodList = arrayListOf("Pizza" , "Hamburger", "French fries")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun getResourceLayout(): Int {
        return R.layout.activity_main
    }

    private fun initView(){
        addFoodBtn.setOnClickListener {
            foodList.add(addFoodText.text.toString())
            Toast.makeText(this,"Successfully add " + addFoodText.text.toString(),Toast.LENGTH_SHORT).show()
            addFoodText.text.clear()

        }

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.size)
            selectedFoodText.text = foodList[randomFood]
        }

    }

}