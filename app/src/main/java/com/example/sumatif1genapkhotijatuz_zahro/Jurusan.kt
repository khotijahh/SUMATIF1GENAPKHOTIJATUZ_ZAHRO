package com.example.sumatif1genapkhotijatuz_zahro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class Jurusan(private val dataSet: ArrayList<DataGambar>):
        RecyclerView.Adapter<Jurusan.ViewHolder>(){
            class ViewHolder(view: View):RecyclerView.ViewHolder(view){

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val Inflate =LayoutInflater.from(parent.context)
             .inflate(R.layout.activity_jurusan,parent,false)
        return ViewHolder(Inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val DataGambar = dataSet[position]
        
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}
