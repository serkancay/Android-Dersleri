package com.serkancay.ozellistview;

/**
 * Created by Serkan on 05.04.2015.
 */
public class Icecek {
    private String isim;
    private double fiyat;

    public  Icecek(String mIsım, double mFiyat){
        isim=mIsım;
        fiyat=mFiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
