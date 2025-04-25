package com.example.ders2.nesne_tabanli_programlama
import java.math.BigInteger
class Odev2 {
    fun soru1(c: Int?){
        var sonuc = 0.0
        if(c != null){
            sonuc = c.times(1.8).plus(32)
            println("Girilen $c Celcius derecesinin, Fahrenheit degeri $sonuc derecedir")
        }
        else
            println("Girilen deger hatali")
    }

    fun soru2(kenar1:Int?, kenar2:Int?){
        var sonuc = 0
        if(kenar1 != null && kenar2 != null){
            sonuc = (2*kenar1)+(2*kenar2)
            println("Kenar uzunluklari $kenar1 ve $kenar2 olan Dikdortgenin cevresi: $sonuc")
        }
        else
            println("Girilen deger hatali")
    }
    fun soru3(sayi: Int?) : BigInteger {
        if (sayi != null) {
            if (sayi == 1) {
                println("$sayi sayisinin faktoriyeli 1")
                return BigInteger.ONE
            } else {
                val sonuc = sayi.toBigInteger() * soru3(sayi - 1)
                println("$sayi sayisinin faktoriyeli $sonuc")
                return sonuc
            }
        }
        else
            println("Girilen deger hatali")

        return BigInteger.ZERO
    }

    fun soru4(metin:String?){
        if(!metin.isNullOrEmpty()){
            var harfAdedi = 0
            for(harf in metin.lowercase())
                harfAdedi += if (harf == 'a') 1 else 0
            println("Girdiginiz \"$metin\" metni icinde \'a\' harfi, $harfAdedi defa gecmektedir")
        }
        else
            println("Girilen deger hatali")
    }

    fun soru5(kenar:Int?){
        if(kenar != null){
            if(kenar >= 3){
                var sonuc = kenar.minus(2).times(180)
                println("$kenar kenarli seklin ic acilar toplami: $sonuc derecedir")
            }
            else
                println("Kenar sayisi 3 veya daha fazla olmali")
        }
        else
            println("Girilen deger hatali")
    }

    fun soru6(gunler:Int?){
        var saat = gunler?.times(8)
        if(saat != null){
            if(saat <= 160){
                var toplam = saat.times(10)
                println("Toplam calisma saati $saat, Toplam ucret $toplam TL")
            }
            else{
                var calisma = 160
                var toplam =calisma.times(10)
                println("Toplam calisma saati $calisma, ucreti $toplam TL")
                var mesai = saat.minus(160)
                toplam = mesai.times(20)
                println("Toplam mesai saati $mesai, ucreti $toplam TL")
                toplam = (calisma.times(10)) + (mesai.times(20))
                println("Toplam ucret $toplam TL")
            }
        }
        else
            println("Girilen deger hatali")
    }

    fun soru7(kota:Int?){
        if(kota != null){
            if(kota <= 50) {
                var sonuc = kota.times(2)
                println("Harcanan kota miktari $kota GB, ucreti $sonuc TL")

            }
            else {
                println("Normal kota miktari 50 GB, ucreti 100 TL")
                var asilanKota = kota.minus(50)
                var sonuc = asilanKota.times(4)
                println("Asilan kota miktari $asilanKota GB, ucreti $sonuc TL")
                println("Toplam ucret ${sonuc + 100} TL")
            }
        }
        else
            println("Girilen deger hatali")
    }
}