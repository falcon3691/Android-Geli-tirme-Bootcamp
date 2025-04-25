package com.example.ders2.nesne_tabanli_programlama

fun main() {
    var odev = Odev2()
    println("\n************ SORU 1 ************")
    println("Donusturmek istediginiz Celcius derecesini, sayi ile giriniz: ")
    odev.soru1(readLine()?.toIntOrNull())

    println("\n************ SORU 2 ************")
    println("Cevresini hesaplamak istediginiz Dikdortgenin, 1. kenarini giriniz: ")
    var kenar1 = readLine()?.toIntOrNull()
    println("2. kenari giriniz: ")
    var kenar2 = readLine()?.toIntOrNull()
    odev.soru2(kenar1, kenar2)

    println("\n************ SORU 3 ************")
    println("Faktoriyelini hesaplamak istediginiz sayiyi giriniz: ")
    odev.soru3(readLine()?.toIntOrNull())

    println("\n************ SORU 4 ************")
    println("Icindeki a harfi miktarini ogrenmek istediginiz metni giriniz: ")
    odev.soru4(readLine())

    println("\n************ SORU 5 ************")
    println("Ic acilar toplamini ogrenmek istediginiz seklin kenar sayisini giriniz: ")
    odev.soru5(readLine()?.toIntOrNull())

    println("\n************ SORU 6 ************")
    println("Calisilan gun sayisini giriniz: ")
    odev.soru6(readLine()?.toIntOrNull())

    println("\n************ SORU 7 ************")
    println("Harcadiginiz kota miktarini giriniz: ")
    odev.soru7(readLine()?.toIntOrNull())
}