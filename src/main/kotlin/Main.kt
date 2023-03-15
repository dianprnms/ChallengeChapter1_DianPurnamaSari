package oop_solid

import Segitiga
import SegitigaTerbalik
import BelahKetupat
import Plus
import X
import SegitigaSiku

fun main(){
    val jumlahBaris : Int = 8
    var batas : String = "=====BATAS====="

    var tdktrblk = Segitiga(jumlahBaris)
    var trblik = SegitigaTerbalik(jumlahBaris)
    var blhktpt = BelahKetupat(jumlahBaris)
    var pls = Plus(jumlahBaris)
    var ex = X(jumlahBaris)
    var sgtigaSiku = SegitigaSiku(jumlahBaris)

    val mList = mutableListOf(tdktrblk, trblik, blhktpt, pls, ex,  sgtigaSiku)
    mList[0].sgtg()
    mList[0].jenisBangunDatar("Segitiga")
    println(" ")
    println(batas)
    println(" ")
    mList[1].sgtg()
    mList[1].jenisBangunDatar("Segitiga Terbalik")
    println(" ")
    println(batas)
    println(" ")
    mList[2].sgtg()
    mList[2].jenisBangunDatar("Belah Ketupat")
    println(" ")
    println(batas)
    println(" ")
    mList[3].tambah().toString()
    mList[3].jenisBangunDatar("Plus")
    println(" ")
    println(batas)
    println(" ")
    mList[4].sgtg()
    mList[4].jenisBangunDatar("X")
    println(" ")
    println(batas)
    println(" ")
    mList[5].sgtg()
    mList[5].jenisBangunDatar("Segitiga Siku-Siku")
}