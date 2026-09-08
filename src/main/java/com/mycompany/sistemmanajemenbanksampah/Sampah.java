/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenbanksampah;

/**
 *
 * @author Lenovo
 */
public class Sampah {
    String jenisSampah;
    String kategori;
    double berat;
    double hargaPerKg;

    // Constructor
    public Sampah(String jenisSampah, String kategori, double berat, double hargaPerKg) {
        this.jenisSampah = jenisSampah;
        this.kategori = kategori;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
    }
}