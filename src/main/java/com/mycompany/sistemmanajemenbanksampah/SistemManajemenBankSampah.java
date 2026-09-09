/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmanajemenbanksampah;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SistemManajemenBankSampah {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<PenyetorSampah> daftarPenyetor = new ArrayList<>();
        ArrayList<Sampah> daftarSampah = new ArrayList<>();
        ArrayList<PetugasSampah> daftarPetugas = new ArrayList<>();

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("\n=== SISTEM MANAJEMEN BANK SAMPAH ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Hapus Penyetor Sampah");
            System.out.println("4. Update Berat Sampah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== TAMBAH DATA PENYETOR SAMPAH ===");

                    // Data Penyetor
                    System.out.print("ID Penyetor: ");
                    int idPenyetor = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nama Penyetor: ");
                    String namaPenyetor = scanner.nextLine();

                    System.out.print("Alamat: ");
                    String alamat = scanner.nextLine();

                    PenyetorSampah penyetor = new PenyetorSampah(
                            idPenyetor,
                            namaPenyetor,
                            alamat
                    );

                    daftarPenyetor.add(penyetor);

                    // Data Sampah
                    System.out.println("\n=== DATA SAMPAH ===");

                    System.out.print("ID Sampah: ");
                    int idSampah = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Jenis Sampah: ");
                    String jenisSampah = scanner.nextLine();

                    System.out.print("Berat Sampah (kg): ");
                    double berat = scanner.nextDouble();
                    scanner.nextLine();

                    Sampah sampah = new Sampah(
                            idSampah,
                            jenisSampah,
                            berat
                    );

                    daftarSampah.add(sampah);

                    // Data Petugas
                    System.out.println("\n=== DATA PETUGAS ===");

                    System.out.print("ID Petugas: ");
                    int idPetugas = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nama Petugas: ");
                    String namaPetugas = scanner.nextLine();

                    System.out.print("Jabatan: ");
                    String jabatan = scanner.nextLine();

                    PetugasSampah petugas = new PetugasSampah(
                            idPetugas,
                            namaPetugas,
                            jabatan
                    );

                    daftarPetugas.add(petugas);

                    System.out.println("\nData berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== DATA PENYETOR SAMPAH ===");

                    if (daftarPenyetor.isEmpty()) {
                        System.out.println("Belum ada data penyetor.");
                    } else {
                        for (PenyetorSampah p : daftarPenyetor) {
                            System.out.println("----------------------------");
                            System.out.println("ID Penyetor : " + p.getIdPenyetor());
                            System.out.println("Nama        : " + p.getNamaPenyetor());
                            System.out.println("Alamat      : " + p.getAlamat());
                        }
                    }

                    System.out.println("\n=== DATA SAMPAH ===");

                    if (daftarSampah.isEmpty()) {
                        System.out.println("Belum ada data sampah.");
                    } else {
                        for (Sampah s : daftarSampah) {
                            System.out.println("----------------------------");
                            System.out.println("ID Sampah    : " + s.getIdSampah());
                            System.out.println("Jenis Sampah : " + s.getJenisSampah());
                            System.out.println("Berat        : " + s.getBerat() + " kg");
                        }
                    }

                    System.out.println("\n=== DATA PETUGAS ===");

                    if (daftarPetugas.isEmpty()) {
                        System.out.println("Belum ada data petugas.");
                    } else {
                        for (PetugasSampah pt : daftarPetugas) {
                            System.out.println("----------------------------");
                            System.out.println("ID Petugas : " + pt.getIdPetugas());
                            System.out.println("Nama       : " + pt.getNamaPetugas());
                            System.out.println("Jabatan    : " + pt.getJabatan());
                        }
                    }

                    break;

                case 3:
                    System.out.println("\n=== HAPUS PENYETOR SAMPAH ===");

                    System.out.print("Masukkan ID Penyetor: ");
                    int idHapus = scanner.nextInt();

                    boolean ditemukan = false;

                    for (int i = 0; i < daftarPenyetor.size(); i++) {

                        if (daftarPenyetor.get(i).getIdPenyetor() == idHapus) {

                            daftarPenyetor.remove(i);
                            ditemukan = true;

                            System.out.println("Data berhasil dihapus!");
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data penyetor tidak ditemukan!");
                    }

                    break;

                case 4:
                    System.out.println("\n=== UPDATE BERAT SAMPAH ===");

                    System.out.print("Masukkan ID Sampah: ");
                    int idUpdate = scanner.nextInt();

                    boolean ditemukanSampah = false;

                    for (Sampah s : daftarSampah) {

                        if (s.getIdSampah() == idUpdate) {

                            System.out.println("Jenis Sampah  : " + s.getJenisSampah());
                            System.out.println("Berat Saat Ini : " + s.getBerat() + " kg");

                            System.out.print("Masukkan berat baru: ");
                            double beratBaru = scanner.nextDouble();

                            s.setBerat(beratBaru);

                            ditemukanSampah = true;

                            System.out.println("Berat sampah berhasil diperbarui!");
                            break;
                        }
                    }

                    if (!ditemukanSampah) {
                        System.out.println("Data sampah tidak ditemukan!");
                    }

                    break;

                case 5:
                    berjalan = false;
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }

        scanner.close();
    }
}