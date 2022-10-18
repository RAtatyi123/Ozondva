package com.example.ozonzonzon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.ozonzonzon.databinding.ActivityCategoryBinding
import com.example.ozonzonzon.databinding.ActivityMainBinding
import imageadapter

class CategoryActivity : AppCompatActivity() {

    private  lateinit var recyclerView: RecyclerView
    private  lateinit var foodList:ArrayList<Kategories>
    private  lateinit var foodAdapter: imageadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)


        init()

    }

    private fun init(){
        recyclerView = findViewById(R.id.rcView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this , RecyclerView.HORIZONTAL , false)
        foodList = ArrayList()

        addToList()

        foodAdapter = imageadapter(foodList)
        recyclerView.adapter = foodAdapter
    }

    private fun addToList() {
        foodList.add(Kategories(R.drawable.motocicle, "Мотоциклы"))
        foodList.add(Kategories(R.drawable.carito, "Электроника"))
    }


}


