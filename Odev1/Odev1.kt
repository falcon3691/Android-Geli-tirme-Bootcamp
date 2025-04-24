package com.example.ders1.degiskenler

import android.graphics.Color

fun main(){
    val sehir = "Sakarya"
    val ulke  = "Turkiye"
    val telefon = "0555 444 33 22"
    val postaKodu = "54000"
    val eMail = "oguzhan@cakar.com"
    val meslek = "Proje Yoneticisi"
    val stokMiktari = 5
    val musteriAdi = "Oguzhan Cakar"
    val bakiye = 1000
    val dogumGunu = "01/01/0000"
    val maas = 35000
    val medeniDurumu = false
    val urunYorumu = "Baya iyi bir urun."
    val odemeTarihi = "24/04/2025"
    val odeme = false
    val siparisAdeti = 10
    val arabaModeli = "Suzuki"
    val kitapAdi = "Prens"
    val yayinlamaTarihi = "01/01/1532"
    val idirimMiktari = 0.25
    val odaSayisi = 3
    val enlem = "30°27'27.0\"E"
    val boylam  ="40°43'26.4\"N"
    val urunAdi = "Kitap"
    val yemekFiyati = 100.00
    val marka = "YKY"
    val muzikAdi = "Ave Maria"
    val videoSuresi = 6.17
    val urunPuani = 4.7
    val resimAdi = "kitapKapagi"
    val dosyaFormati = ".png"
    val renk = "Siyah"
    val renkKodu = "#000000"
    val telefonModeli = "Samsung"
    val ekranBoyutu = 6.7
    val agirlik = 0.200
    val ulusalGun = "Ulusal Egemenlik ve Cocuk Bayrami"
    val tatilGunu = "23/04/2025"
    val rezervasyonTarihi = "10/05/2025"
    val sokakAdi = "Yeni"
    val otobusHatti = "ADARAY - ADAPAZARI - ARIFIYE"
    val kalanDakika = 4
    val takipKodu = 4567891237410
    val kuponSuresi = 28
    val kuponKodu = "HOSGELDIN50"
    val faturaAdresi = "Yeni Sokak Sakarya/Turkiye"

    println("Musteri Bilgileri")
    println("Adi: $musteriAdi")
    println("Dogum Gunu: $dogumGunu")
    println("Medeni Durumu: ${if (medeniDurumu) "Evli" else "Bekar"}")
    println("Meslek: $meslek")
    println("E-posta: $eMail")
    println("Telefon: $telefon")
    println("Adres: $sokakAdi, $sehir / $ulke")
    println("Posta Kodu: $postaKodu")
    println("Fatura Adresi: $faturaAdresi")
    println()

    println("Finansal Bilgiler")
    println("Bakiye: $bakiye TL")
    println("Maas: $maas TL")
    println("Odeme Yapildi mi?: ${if (odeme) "Evet" else "Hayir"}")
    println("Odeme Tarihi: $odemeTarihi")
    println("Indirim Miktari: %${idirimMiktari * 100}")
    println("Kupon Kodu: $kuponKodu (Gecerlilik: $kuponSuresi gun)")
    println()

    println("Siparis Bilgileri")
    println("Urun Adi: $urunAdi")
    println("Urun Puani: $urunPuani")
    println("Urun Yorumu: $urunYorumu")
    println("Stok Miktari: $stokMiktari")
    println("Siparis Adeti: $siparisAdeti")
    println("Yemek Fiyati: $yemekFiyati TL")
    println("Marka: $marka")
    println("Takip Kodu: $takipKodu")
    println()

    println("Urun Detaylari")
    println("Resim Adi: $resimAdi$dosyaFormati")
    println("Renk: $renk")
    println("Renk Kodu: $renkKodu")
    println("Agirlik: ${agirlik}kg")
    println()

    println("Medya ve Yayin Bilgileri")
    println("Kitap Adi: $kitapAdi")
    println("Yayin Tarihi: $yayinlamaTarihi")
    println("Muzik Adi: $muzikAdi")
    println("Video Suresi: $videoSuresi dk")
    println()

    println("Arac Bilgileri")
    println("Araba Modeli: $arabaModeli")
    println("Telefon Modeli: $telefonModeli")
    println("Ekran Boyutu: $ekranBoyutu inc")
    println()

    println("Tarihler")
    println("Tatil Gunu: $tatilGunu")
    println("Ulusal Gun: $ulusalGun")
    println("Rezervasyon Tarihi: $rezervasyonTarihi")
    println()

    println("Konum Bilgileri")
    println("Enlem: $enlem")
    println("Boylam: $boylam")
    println()

    println("Ulasim Bilgileri")
    println("Otobus Hatti: $otobusHatti")
    println("Kalan Dakika: $kalanDakika dk")
}