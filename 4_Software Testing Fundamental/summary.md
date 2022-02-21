## Definition of Software Testing
Proses menganalisis perangkat lunak untuk mendeteksi perbedaan kondisi perangkat lunak dengan kondisi yang diperlukan, serta untuk mengevaluasi hasil dan kinerja perangkat lunak.

## How Important Software Testing
1. Bug is dangerous and expensive, testing software could prevent it
2. Assuring product quality
3. Security factor
4. Ensuring customer satisfaction

## Testing Platform
4 macam : API, Web, Mobile, Desktop

## Types of Software Testing

1. Functional Testing (Manual, Automate)
    Memverifikasi bahwa setiap fungsi aplikasi dapat digunakan sesuai fungsinya dan berjalan dengan baik.
        - Manual Testing : Tester melakukan pengujian semua fitur secara manual tanpa bantuan script atau tools
        - Automation Testing : Tester melakukan pengujian semua fitur secara otomatis dengan bantuan testing tools,
                                membandingkan output yang diprediksi dengan output yang dihasilkan sistem.
    "The right selection of automation tool, testing process, and team, are important players for automation to be succesful. Manual and automation methods go hand-in-hand for succesful testing."

2. Non-functional Testing (Performance Testing)
    Pengujian aspek nonfungsional seperti kinerja, keamanan sistem. Dilakukan setelah Functional Testing.
        - Performance Testing : Menjamin sistem dapat bekerja pada beban kerja yang diharapkan
            Ensuring software speed, scalability, stability.

3. Maintanance Testing (Regression)
    Dilakukan setelah aplikasi dideploy/diluncurkan. Mempertahankan / meningkatkan sistem selama masa pakai seperti kompatibilitas, efisiensi, keamanan dan portabilitas.
        - Regression Testing : setiap adanya fitur baru yang ditambahkan atau adanya fitur lama yang dihapus, dilakukan regression testing untuk menjamin tidak ada bug baru.

## Level of Testing

1. Unit Testing
    - menguji sebuah komponen dalam perangkat lunak
    - dilakukan dalam masa development
    - komponen yang diuji = unit dari perangkat lunak (fungsi, modul, metode, prosedur, objek)
    - memvalidasi setiap unit dalam perangkat lunak dapat berjalan sesuai yang diharapkan
    - Automation tools for unit testing : J unit, N unit, J mockit, MA, php unit, dll

2. Integration Testing
    - pengujian dari hasil penggabungan unit unit yang ada
    - biasanya tester menguji unit-unit sebagai kombinasi, bukan unit individual
    - sebaiknya dilakukan bertahap untuk mengurangi kesulitan penelusuran jika terjadi error
    - bertujuan untuk menguji kinerja aplikasi, apakah dapat berjalan dengan baik, menguji struktur yang telah dirancang

3. System Testing
    - pengujian keseluruhan system (end-to-end testing), mengklarifikasi semua skenario berjalan dengan baik
    - menguji aspek fungsional dan non-fungsional
    - menguji apakah perangkat lunak sudah layak untuk digunakan

4. Acceptance Testing
    - menentukan sistem yang didevelop telah memenuhi kebutuhan pengguna
    - dilakukan sebelum perangkat lunak diserahkan pada pengguna, setelah melakukan unit testing, integration testing, system testing
    - menguji apakah aplikasi yang dibuat sesuai dengan proses bisnis dan kebutuhan atau tidak

"Testers don't like to break things; they like to dispel the illusion that things work."
- Kanner, Bach, Pettichord


### Challenge di halaman 28

Sedang dilakukan pengujian terhadap 2 modul. Didalam modul tersebut hanya ada 1 kelas.

Pengujian pada modul pertama
    hanya mencapai 67% atau 6 dari 9 Line Coverage. Artinya dari seluruh baris kode yang ada, hanya 6 dari 9 baris kode yang dieksekusi.
    hanya mencapai 67% atau 2 dari 3 Mutation Coverage. Mutation testing dilakukan untuk menguji apakah sistem dapat mendeteksi perubahan apabila dilakukan perubahan-perubahan kecil dalam unit. Dilakukan pengujian pada 3 mutant, 2 terbunuh karena menyebabkan kegagalan sistem, 1 selamat.

Pengujian pada modul kedua,
    mencapai 100% atau 9 dari 9 Line Coverage. Artinya dari seluruh baris kode yang ada, hanya 9 dari 9 baris kode / seluruh abris kode berhasil dieksekusi.
    hanya mencapai 75% atau 3 dari 4 Mutation Coverage. Mutation testing dilakukan untuk menguji apakah sistem dapat mendeteksi perubahan apabila dilakukan perubahan-perubahan kecil dalam unit. Dilakukan pengujian pada 4 mutant, 3 terbunuh karena menyebabkan kegagalan sistem, 1 selamat.

### Challenge di halaman 29
Di dalam kelas CalculatorServiceImpl, terdapat dua fungsi yaitu add dan substract.
Pada fungsi add, int a dijumlah dengan int b, nantinya mengembalikan nilai dalam variabel c.
Pada fungsi add, int a dikurangi dengan int b, nantinya mengembalikan nilai dalam variabel c.