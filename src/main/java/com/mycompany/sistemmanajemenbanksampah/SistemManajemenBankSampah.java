/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmanajemenbanksampah;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class SistemManajemenBankSampah {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<PenyetorSampah> daftarPenyetor = new ArrayList<>();
        ArrayList<Sampah> daftarSampah = new ArrayList<>();
        ArrayList<PetugasSampah> daftarPetugas = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("SISTEM MANAJEMEN BANK SAMPAH");
            System.out.println("1. Data Penyetor Sampah");
            System.out.println("2. Data Sampah");
            System.out.println("3. Data Petugas Sampah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                
                case 1:

                    int menuPenyetor;

                    do {
            System.out.println("\n DATA PENYETOR SAMPAH");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu : ");
            menuPenyetor = input.nextInt();
            input.nextLine();

            switch (menuPenyetor) {

            case 1:
            System.out.print("Nama Penyetor : ");
            String nama = input.nextLine();

            System.out.print("Alamat : ");
            String alamat = input.nextLine();

            System.out.print("No. Telepon : ");
            String noTelepon = input.nextLine();

            daftarPenyetor.add(
            new PenyetorSampah(
                                                nama,
                                                alamat,
                                                noTelepon
                                        )
                                );

                                System.out.println("Data penyetor berhasil ditambahkan.");
                                break;

                            case 2:

                                if (daftarPenyetor.isEmpty()) {
                                    System.out.println("Belum ada data penyetor.");
                                } else {
                                    System.out.println("\n DAFTAR PENYETOR");

                                    // Perulangan menampilkan data
                                    for (int i = 0; i < daftarPenyetor.size(); i++) {
                                        PenyetorSampah p = daftarPenyetor.get(i);
                                        System.out.println("\nData ke-" + (i + 1));
                                        System.out.println("Nama       : " + p.nama);
                                        System.out.println("Alamat     : " + p.alamat);
                                        System.out.println("No Telepon : " + p.noTelepon);
                                    }
                                }

                                break;

                            case 3:

                                if (daftarPenyetor.isEmpty()) {
                                    System.out.println("Belum ada data penyetor.");
                                } else {
                                    System.out.print("Masukkan nomor data yang ingin diubah : ");
                                    int index = input.nextInt();
                                    input.nextLine();

                                    if (index > 0 && index <= daftarPenyetor.size()) {

                                        PenyetorSampah p =
                                                daftarPenyetor.get(index - 1);

                                        System.out.print("Nama baru : ");
                                        p.nama = input.nextLine();

                                        System.out.print("Alamat baru : ");
                                        p.alamat = input.nextLine();

                                        System.out.print("No Telepon baru : ");
                                        p.noTelepon = input.nextLine();

                                        System.out.println(
                                                "Data penyetor berhasil diubah."
                                        );

                                    } else {
                                        System.out.println("Nomor data tidak ditemukan.");
                                    }
                                }

                                break;

                            case 4:

                                if (daftarPenyetor.isEmpty()) {
                                    System.out.println("Belum ada data penyetor.");
                                } else {

                                    System.out.print(
                                            "Masukkan nomor data yang ingin dihapus : "
                                    );
                                    int index = input.nextInt();
                                    input.nextLine();

                                    if (index > 0 && index <= daftarPenyetor.size()) {

                                        daftarPenyetor.remove(index - 1);

                                        System.out.println(
                                                "Data penyetor berhasil dihapus."
                                        );

                                    } else {
                                        System.out.println("Nomor data tidak ditemukan.");
                                    }
                                }

                                break;
                            case 5:
                                System.out.println("Kembali ke menu utama.");
                                break;
                            default:
                                System.out.println("Menu tidak tersedia.");
                        }
                    } while (menuPenyetor != 5);

                    break;


                // DATA SAMPAH
                case 2:

                    int menuSampah;
                    do {
                        System.out.println("\nDATA SAMPAH");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Tampilkan Data");
                        System.out.println("3. Ubah Data");
                        System.out.println("4. Hapus Data");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih menu : ");
                        menuSampah = input.nextInt();
                        input.nextLine();

                        switch (menuSampah) {

                            case 1:

                                System.out.print("Jenis Sampah : ");
                                String jenis = input.nextLine();

                                System.out.print("Kategori : ");
                                String kategori = input.nextLine();

                                System.out.print("Berat (Kg) : ");
                                double berat = input.nextDouble();

                                System.out.print("Harga per Kg : ");
                                double harga = input.nextDouble();
                                input.nextLine();

                                daftarSampah.add(
                                        new Sampah(
                                                jenis,
                                                kategori,
                                                berat,
                                                harga
                                        )
                                );
                                System.out.println("Data sampah berhasil ditambahkan.");
                                break;

                            case 2:

                                if (daftarSampah.isEmpty()) {
                                    System.out.println("Belum ada data sampah.");
                                } else {

                                    System.out.println("\nDAFTAR SAMPAH");

                                    // Perulangan menampilkan data
                                    for (int i = 0; i < daftarSampah.size(); i++) {

                                        Sampah s = daftarSampah.get(i);

                                        System.out.println("\nData ke-" + (i + 1));
                                        System.out.println("Jenis Sampah : " + s.jenisSampah);
                                        System.out.println("Kategori     : " + s.kategori);
                                        System.out.println("Berat        : " + s.berat + " Kg");
                                        System.out.println("Harga/Kg     : Rp" + s.hargaPerKg);
                                    }
                                }

                                break;

                            case 3:

                                if (daftarSampah.isEmpty()) {
                                    System.out.println("Belum ada data sampah.");
                                } else {

                                    System.out.print(
                                            "Masukkan nomor data yang ingin diubah : "
                                    );
                                    int index = input.nextInt();
                                    input.nextLine();

                                    if (index > 0 && index <= daftarSampah.size()) {
                                        Sampah s =
                                                daftarSampah.get(index - 1);

                                        System.out.print("Jenis sampah baru : ");
                                        s.jenisSampah = input.nextLine();

                                        System.out.print("Kategori baru : ");
                                        s.kategori = input.nextLine();

                                        System.out.print("Berat baru (Kg) : ");
                                        s.berat = input.nextDouble();

                                        System.out.print("Harga per Kg baru : ");
                                        s.hargaPerKg = input.nextDouble();
                                        input.nextLine();

                                        System.out.println(
                                                "Data sampah berhasil diubah."
                                        );
                                    } else {
                                        System.out.println("Nomor data tidak ditemukan.");
                                    }
                                }

                                break;

                            case 4:

                                if (daftarSampah.isEmpty()) {
                                    System.out.println("Belum ada data sampah.");
                                } else {

                                    System.out.print(
                                            "Masukkan nomor data yang ingin dihapus : "
                                    );
                                    int index = input.nextInt();
                                    input.nextLine();

                                    if (index > 0 && index <= daftarSampah.size()) {

                                        daftarSampah.remove(index - 1);

                                        System.out.println(
                                                "Data sampah berhasil dihapus."
                                        );

                                    } else {
                                        System.out.println("Nomor data tidak ditemukan.");
                                    }
                                }

                                break;

                            case 5:
                                System.out.println("Kembali ke menu utama.");
                                break;

                            default:
                                System.out.println("Menu tidak tersedia.");
                        }

                    } while (menuSampah != 5);

                    break;

                    // DATA PETUGAS SAMPAH
                case 3:

                    int menuPetugas;

                    do {
                        System.out.println("\n= DATA PETUGAS SAMPAH =");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Tampilkan Data");
                        System.out.println("3. Ubah Data");
                        System.out.println("4. Hapus Data");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih menu : ");
                        menuPetugas = input.nextInt();
                        input.nextLine();

                        switch (menuPetugas) {

                            case 1:

                                System.out.print("Nama Petugas : ");
                                String namaPetugas = input.nextLine();

                                System.out.print("Jabatan : ");
                                String jabatan = input.nextLine();

                                System.out.print("No. Telepon : ");
                                String teleponPetugas = input.nextLine();

                                daftarPetugas.add(
                                        new PetugasSampah(
                                                namaPetugas,
                                                jabatan,
                                                teleponPetugas
                                        )
                                );

                                System.out.println("Data petugas berhasil ditambahkan.");
                                break;

                            case 2:

                                if (daftarPetugas.isEmpty()) {
                                    System.out.println("Belum ada data petugas.");
                                } else {

                                    System.out.println("\n== DAFTAR PETUGAS ==");

                                    // Perulangan menampilkan data
                                    for (int i = 0; i < daftarPetugas.size(); i++) {

                                        PetugasSampah p =
                                                daftarPetugas.get(i);

                                        System.out.println("\nData ke-" + (i + 1));
                                        System.out.println(
                                                "Nama Petugas : " + p.namaPetugas
                                        );
                                        System.out.println(
                                                "Jabatan      : " + p.jabatan
                                        );
                                        System.out.println(
                                                "No Telepon   : " + p.noTelepon
                                        );
                                    }
                                }

                                break;

                            case 3:

                                if (daftarPetugas.isEmpty()) {
                                    System.out.println("Belum ada data petugas.");
                                } else {

        System.out.print(
        "Tekan 1 Kalo Mau Ubah Data Kak : "
        );
        int index = input.nextInt();
                                    input.nextLine();

                                    if (index > 0 && index <= daftarPetugas.size()) {
                                        PetugasSampah p =
                                                daftarPetugas.get(index - 1);

                                        System.out.print("Nama petugas baru : ");
                                        p.namaPetugas = input.nextLine();

                                        System.out.print("Jabatan baru : ");
                                        p.jabatan = input.nextLine();

                                        System.out.print("No Telepon baru : ");
                                        p.noTelepon = input.nextLine();

                                        System.out.println(
                                                "Data petugas berhasil diubah."
                                        );
                                    } else {
                                        System.out.println("Nomor data tidak ditemukan.");
                                    }
                                }

                                break;

                            case 4:

                                if (daftarPetugas.isEmpty()) {
                                    System.out.println("Belum ada data petugas.");
                                } else {

                                    System.out.print(
                                            "Masukkan nomor data yang ingin dihapus : "
                                    );
                                    int index = input.nextInt();
                                    input.nextLine();

                                    if (index > 0 && index <= daftarPetugas.size()) {

                                        daftarPetugas.remove(index - 1);

                                        System.out.println(
                                                "Data petugas berhasil dihapus."
                                        );

                                    } else {
                                        System.out.println("Nomor data tidak ditemukan.");
                                    }
                                }

                                break;

                            case 5:
                                System.out.println("Kembali ke menu utama.");
                                break;

                            default:
                                System.out.println("Menu tidak tersedia.");
                        }

                    } while (menuPetugas != 5);

                    break;

                // KELUAR
                case 4:
                    System.out.println("\nTerima kasih telah menggunakan");
                    System.out.println("Sistem Manajemen Bank Sampah.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 4);

        input.close();
    }
}