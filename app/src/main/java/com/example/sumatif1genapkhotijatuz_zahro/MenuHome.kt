package com.example.sumatif1genapkhotijatuz_zahro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

  class MenuHome : AppCompatActivity(){
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_menu_home)
          val btnBuku=Button(findViewById(R.id.btnBuku))
          val guru=Button(findViewById(R.id.btnGuru))
          val siswa=Button(findViewById(R.id.btnSiswa))
          val visi_misi= Button(findViewById(R.id.btnVisi_misi))



          btnBuku.setOnClickListener {
              if (btnBuku.text.toString().equals(btnBuku) && btnBuku.text.toString()
                      .equals(btnBuku)
              ) {

                  fun pindah1(view: View) {
                      val pindah1 = Intent(this, guru::class.java)
                      startActivity(pindah1)
                  }

              }


          }
      }
  }



