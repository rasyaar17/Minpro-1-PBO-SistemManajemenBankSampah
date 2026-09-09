package com.mycompany.sistemmanajemenbanksampah;

public class PenyetorSampah {

    private int idPenyetor;
    private String namaPenyetor;
    private String alamat;

    public PenyetorSampah(int idPenyetor, String namaPenyetor, String alamat) {
        this.idPenyetor = idPenyetor;
        this.namaPenyetor = namaPenyetor;
        this.alamat = alamat;
    }

    public int getIdPenyetor() {
        return idPenyetor;
    }

    public String getNamaPenyetor() {
        return namaPenyetor;
    }

    public String getAlamat() {
        return alamat;
    }
}