package com.example.myfirstapp

class MataKuliah(var dosen : String) {

    companion object {
        const val NAMA_MATKUL = "Basis Data"
    }
    fun belajar(){
        print("$dosen mengajar matkul ${Companion.NAMA_MATKUL}")
    }
}
