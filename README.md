Nama: Rasya Aditya Ramadani

NIM:2509116082

Sistem Informasi C'25

Latar Belakang tema "Sistem Manajemen Bank Sampah"

Pengembangan program Sistem Manajemen Bank Sampah ini dilatarbelakangi oleh kebutuhan akan pencatatan transaksi dan pengelolaan data operasional sampah yang lebih terstruktur, efisien, serta terdigitalisasi untuk meminimalisir kesalahan rekapitulasi secara manual. Program berbasis konsol ini dirancang dengan tujuan utama mempermudah petugas dalam mengelola seluruh alur pendataan secara terintegrasi, mulai dari menambahkan data penyetor dan sampah, menampilkan rekapitulasi informasi, memperbarui catatan berat sampah, hingga menghapus entitas data yang sudah tidak relevan melalui antarmuka menu yang sederhana dan mudah dioperasikan


berikut adalah alur dari sistem:


<img width="238" height="412" alt="Cuplikan layar 2026-09-10 140852" src="https://github.com/user-attachments/assets/086d0df4-f5ba-45f0-8046-acd5d32371ad" />

Hasil eksekusi program di atas menunjukkan pengujian fitur Tambah Data pada Sistem Manajemen Bank Sampah. Saya memilih opsi 1 untuk menginputkan data penyetor atas nama Rasya (ID: 2501) yang beralamat di Tubun, jenis sampah Kering & Organik dengan berat 8,5 kg (ID: 001), serta data petugas bernama Saiful (ID: 0001). Setelah seluruh data dimasukkan, sistem berhasil menyimpan informasi tersebut yang ditandai dengan pesan konfirmasi "Data berhasil ditambahkan!" lalu secara otomatis menampilkan kembali menu utama

<img width="241" height="422" alt="Cuplikan layar 2026-09-10 140920" src="https://github.com/user-attachments/assets/d8f0759e-17fc-46a0-a395-6bba79c26e23" />

program di atas menunjukkan pengujian fitur Tampilkan Data pada Sistem Manajemen Bank Sampah. Pengguna memilih opsi 2 pada menu utama, lalu sistem berhasil menampilkan seluruh rincian data yang tersimpan, meliputi data penyetor atas nama Rasya (ID: 2501, Alamat: Tubun), data sampah jenis Kering & Organik dengan berat 8.5 kg (ID Sampah: 1), serta data petugas atas nama Saiful (ID Petugas: 1, Jabatan: Staff). Setelah data selesai ditampilkan, sistem secara otomatis mengembalikan tampilan ke menu utama

<img width="260" height="458" alt="Cuplikan layar 2026-09-10 141021" src="https://github.com/user-attachments/assets/a0a24ee0-cc82-4242-911b-d89a148c3c44" />

Gambar di atas memperlihatkan alur pengujian fungsi pembaruan data (*update*) serta verifikasi hasilnya pada aplikasi. Pengguna awalnya memilih opsi angka 4 untuk mengubah bobot sampah dengan acuan ID Sampah `001`. Sistem kemudian menampilkan berat awal sebesar 8.5 kg, lalu pengguna mengisikan nilai baru yaitu 9. Begitu konfirmasi "Berat sampah berhasil diperbarui!" muncul, pengujian dilanjutkan dengan memilih opsi 2 (Tampilkan Data) guna memastikan perubahan telah tersimpan. Terlihat pada rincian data terbaru bahwa variabel berat untuk sampah jenis Kering & Organik milik penyetor Rasya telah sukses diperbarui menjadi 9.0 kg

<img width="257" height="352" alt="Cuplikan layar 2026-09-10 141057" src="https://github.com/user-attachments/assets/5cc1338d-5178-4e95-9179-100c83a009b0" />

Tampilan di atas menyajikan proses pengujian untuk fungsi penghapusan record sekaligus penghentian program. Awalnya, opsi 3 dipilih guna mengakses menu Hapus Penyetor Sampah, di mana input ID Penyetor `2501` berhasil diproses hingga memunculkan notifikasi "Data berhasil dihapus!". Setelah mengembalikan tampilan ke menu utama, pengujian diakhiri dengan memilih opsi 5 (Keluar) yang memicu munculnya pesan "Program selesai." serta status "BUILD SUCCESS", menandakan seluruh alur operasi aplikasi telah ditutup secara normal tanpa ada masalah
