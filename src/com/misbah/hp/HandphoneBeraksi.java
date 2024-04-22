package com.misbah.hp;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone nokia = new Handphone();

        nokia.hidupkan();
        nokia.lakukanPanggilan();
        nokia.kirimSMS();
        nokia.matikan();
    }
}
