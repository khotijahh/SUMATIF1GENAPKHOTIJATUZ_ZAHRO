package com.example.sumatif1genapkhotijatuz_zahro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class halGuru : AppCompatActivity() {

    private  lateinit var RecyclerView:RecyclerView
    private  lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_guru)

        RecyclerView = findViewById(R.id.listData)
        val data
        data.add(DataGambarGuru(R.drawable.guru2."Minhatulmaula", "produktif RPL"))
        data.add(DataGambarGuru(R.drawable.gurulk2."Imam Ichsan Arifin","produktif RPL"))
        data.add(DataGambarGuru(R.drawable.gurun."Yasin Eka Safitri","Matematika"))

        recyclerAdapter= halGuru
        layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        RecyclerView.adapter = recyclerAdapter: layoutManager

    }
}