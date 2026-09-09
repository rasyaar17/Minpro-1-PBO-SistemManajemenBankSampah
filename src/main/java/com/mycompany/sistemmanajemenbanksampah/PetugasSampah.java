package com.mycompany.sistemmanajemenbanksampah;

public class PetugasSampah {

    private int idPetugas;
    private String namaPetugas;
    private String jabatan;

    public PetugasSampah(int idPetugas, String namaPetugas, String jabatan) {
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.jabatan = jabatan;
    }

    public int getIdPetugas() {
        return idPetugas;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public String getJabatan() {
        return jabatan;
    }
}