package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity {
   var matkul = MataKuliah("Ibu Jelita")
    var deklar = matkul.belajar()
    fun main(){
        print(deklar)
    }

}