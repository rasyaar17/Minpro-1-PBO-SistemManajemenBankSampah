package com.mycompany.sistemmanajemenbanksampah;

public class Sampah {

    private int idSampah;
    private String jenisSampah;
    private double berat;

    public Sampah(int idSampah, String jenisSampah, double berat) {
        this.idSampah = idSampah;
        this.jenisSampah = jenisSampah;
        this.berat = berat;
    }

    public int getIdSampah() {
        return idSampah;
    }

    public String getJenisSampah() {
        return jenisSampah;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        if (berat < 0) {
            System.out.println("Berat tidak boleh kurang dari 0!");
        } else {
            this.berat = berat;
        }
    }
}