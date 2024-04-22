package com.misbah.mobil;

public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil avanza = new Mobil();
        avanza.nama = "mizz";
        avanza.warna = "gold";
        avanza.roda = 4;
        avanza.tahunProduksi = 2024;

        System.out.println("Nama Mobil: " + avanza.nama);
        System.out.println("Warna Mobil: " + avanza.warna);
        System.out.println("Roda Mobil: " + avanza.roda);
        System.out.println("Tahun Produksi Mobil: " + avanza.tahunProduksi);

        System.out.println("================");

        Mobil toyota = new Mobil();
        toyota.nama = "kijang";
        toyota.warna = "merah";
        toyota.roda = 4;
        toyota.tahunProduksi = 2020;
        toyota.printMobil();
    }
}
