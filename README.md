# Sistem Manajemen Fasilitass Taman Kota🌳🛝🌻

## Deskripsi Singkat
Sistem Manajemen Fasilitas Taman Kota adalah program yang berbasis Java. Program ini digunakan untuk mengelola data fasilitas yang terdapat pada taman kota. Program ini menerapkan konsep Pemrograman Berorientasi Objek (PBO) dan memiliki fitur CRUD (Create, Read, Update, dan Delete) untuk menambah, menampilkan mengubah, dan menghapus data fasilitas.

## Fitur Program
- Menampilkan data fasilitas,
- Menambah data fasilitas,
- Menghapus data fasilitas,
- Mengupdate (memperbarui) data fasilitas,
- Validasi input,
- Menu interaktif.

## Data Fasilitas
Data fasilitas yang dikelola adalah:
- ID fasilitas
  (Contoh: 1, 2, 3, dan seterusnya),
- Nama fasilitas
  (Contoh: Bangku Taman, Tempat Sampah, Lampu Taman),
- Jenis fasilitas
  (Contoh: Tempat Duduk, Kebersihan, Penerangan),
- Kondisi fasilitas
  (Contoh: Baik, Cukup, Rusak),
- Jumlah fasilitas
  (Contoh: 15, 10, 2).

## Alur Program
**1. Program dijalankan melalui class 'Main'.**
<img width="738" height="396" alt="image" src="https://github.com/user-attachments/assets/1e44a2dd-cced-4554-b058-fa3df6c34d85" />

**2. Program menampilkan menu utama Sistem Manajemen Fasilitas Taman Kota dan pengguna memilih menu menggunakan input angka.**
<img width="554" height="348" alt="image" src="https://github.com/user-attachments/assets/f48c32bd-90aa-442e-99bc-d7491f8ca88d" />

**3. Jika Pengguna memilih menu 1 yaitu Tampilkan Fasilitas, program akan menampilkan seluruh data fasilitas yang tersimpan.**
<img width="564" height="1136" alt="image" src="https://github.com/user-attachments/assets/559c804a-d21c-40ed-95f9-0661ec43b824" />

**4. Jika Pengguna memilih menu 2 yaitu Tambah Fasilitas, Pengguna memasukkan ID, nama, jenis, kondisi, dan jumlah fasilitas. Data kemmudian disimpan ke dalam 'ArrayList'.**
<img width="472" height="346" alt="image" src="https://github.com/user-attachments/assets/cc08c44c-e883-4aff-bbcb-e36102619623" />
<img width="406" height="178" alt="image" src="https://github.com/user-attachments/assets/43161bce-a3fd-4411-ae18-9ddd80712b0a" />

**5. Jika Pengguna memilih menu 3 yaitu Hapus Fasilitas, Pengguna memasukkan ID fasilitas yang ingin dihapus. Program akan mencari data berdasarkan ID dan menghapus data tersebut jika ditemukan.**
<img width="476" height="404" alt="image" src="https://github.com/user-attachments/assets/6133ca37-592f-4b3a-9d2a-bb8562a63214" />
<img width="482" height="538" alt="image" src="https://github.com/user-attachments/assets/cdc52858-8406-45de-8f50-bb1ec25e13c4" />

**6. Jika Pengguna memilih menu 4 yaitu Update Fasilitas, Pengguna memasukkan ID fasilitas yang ingin diperbarui. Program kemudian meminta data baru dan memperbarui data fasilitas tersebut.**
<img width="486" height="684" alt="image" src="https://github.com/user-attachments/assets/a981399b-9aaf-4f54-aadf-409b5f7585c4" />
<img width="438" height="178" alt="image" src="https://github.com/user-attachments/assets/242824ff-088e-403b-ae78-471992c8b130" />

**7. Jika Pengguna memilih menu 5 yaitu Keluar dari Program, program akan berhenti.**
<img width="894" height="478" alt="image" src="https://github.com/user-attachments/assets/8fe29c0c-bb26-42db-acc4-e0952790a1e4" />

## Penjelasan Letak Penerapan Nilai Tambah
Program menerapkan nilai tambah sebagai berikut:
### 1. Access Modifier
Access modifier 'private' diterapkan pada atribut class 'Fasilitas' untuk membatasi akses langsung terhadap atribut dari luar class.
***Letak Penerapan:*** 'models/Fasilitas.java'
### 2. Encapsulation
Encapsulation diterapkan dengan menggunakan atribut 'privat' yang diakses melalui method getter dan setter.
***Letak Penerapan:*** 'models/Fasilitas.java'
### 3. Validasi Input
Validasi input diterapkan untuk memastikan data yang dimasukkan pengguna sesuai dengan ketentuan program. Validasi yang digunakan meliputi input tidak boleh kosong, input harus berupa angka, angka tidak boleh negatif, pilihan kondisi harus valid, dan ID fasilitas tidak boleh duplikat.
***Letak Penerapan:*** 'helper/InputHelper.java' dan 'manager/FasilitasManager.java'
