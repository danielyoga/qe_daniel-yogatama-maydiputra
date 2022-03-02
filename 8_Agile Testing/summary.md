# SDLC
### Software Development Life Cycle

- Merancang, Mengembangkan, Menguji Software dengan kualitas tinggi
- Menyediakan alur terstruktur dalam manajemen pengembangan software
- Dimulai dengan mengevaluasi sistem yang ada untuk mengidentifikasi persyaratan pada sistem yang baru
- Software dibuat sesuai tahapan-tahapan SDLC
- SDLC mengantisipasi kesalahan, mengurangi code fixing
- Metodologi yang berulang, diharuskan memastikan kualitas kode disetiap siklus
- Tujuan SDLC :
    1. Sarana komunikasi tim developer dengan client
    2. Membagi peranan dan tanggung jawab dalam tim (Developer, Designer, Business Analyst, Project Manager)
- Mendapatkan gambaran input dan output yang jelas dari satu tahap ke tahap selanjutnya
- Setiap fase akan menghasilkan apa yang dibutuhkan fase berikutnya, persyaratan tersebut diterjemahkan ke dalam design. Code diproduksi sesuai design dalam tahap development. Lalu dilakukan testing, memastikan hasil development sesuai dengan requirement awal

## Phase of SDLC

1. Requirements Gathering (Tahap Perencanaan)
    - Sistem dianalisis, bagaimana sistem akan dijalankan nantinya
    - Hasil analisis : Kelebihan, Kekurangan, pembaharuan yang dapat diterapkan
    - Yang ada didalam Tahap perencanaan :
        alokasi sumber daya, perencanaan kapasitas, pendaulat proyek, estimasi biaya, penetapan.
    - Hasil dari tahap ini :
    Rencana Proyek, Jadwal Estimasi, Biaya, Ketentuan
    - Idealnya Developer dan PM dapat bekerja dengan maksimal pada tahap ini

2. Design
    - Membuat model cara kerja software
    - Aspek :
        -   Communication
            Mendefinisikan metode aplikasi berkomunikasi dengan aset lainnya (Server Pusat, API, dll)
        -   Programming
            Penentuan Bahasa Pemrograman, Metode pemecahan masalah, tugas-tugas yang ada dalam aplikasi
        -   Architecture
            Menentukan Bahasa Pemrograman, Praktik dalam Industri, Design keseluruhan, menggunakan template tertentu
        -   User Interface
            Menentukan cara user berinteraksi dengan software
            Menentukan cara software merespon input dari user
        -   Platform
            Menentukan Platform berjalannya software (Android, Ios, Desktop, Web, Linux)
        -   Security
            Mendefinisikan langkah-langkah mengamankan aplikasi (Perlindungan Kata sandi, Enkripsi SSL traffic, membuat penyimpanan credentials yang aman)
        -   Prototype
            Menjadi versi awal dari software dalam pengembangan
            Menjadi ide dasar bagaimana software terlihat dan bekerja
            
3. Development (code)
    - Code ditulis
    - Dalam proyek besar, code ditulis bersama oleh beberapa tim
    - Menggunakan tools access control / source code management untuk membantu developer melacak perubahan, memastikan kompatibilitas proyek antara tim
    - Menemukan dan memperbaiki error
    - Penulisan Dokumentasi, bantuan FAQ untuk masalah teknis
    - Merupakan tahap paling panjang, akan muncul kendala baru yang menghambat pengembangan
    - Pada tahap ini perancangan dapat berubah

4. Testing
    - Software harus diuji sebelum dipublish
    - Harus dilakukan untuk mengetahui apakah software yang dikembangkan optimal atau tidak
    - Yang harus diperhatikan : kemudahan penggunaan sistem, pencapaian tujuan dari sistem yang sudah dirancang
    - Tahap paling penting, tidak mungkin melakukan publish sebuah software tanpa melalui testing
    - Testing yang dilakukan : Kualitas Code, Functional Testing, Integration Testing, Performance Testing, Security Testing
    - Memastikan Testing berjalan dengan baik, tidak ada yang terlewat, Testing dilakukan menggunakan Continous Integration
    - Dihasilkan software yang siap untuk dirilis

5. Deployment
    - Aplikasi sudah tersedia bagi user untuk digunakan
    - Bisa jadi lebih rumit, beberapa perusahaan perlu melakukan update database ke software yang baru dikembangkan
    - Bukan untuk menunjukkan tahap SDLC sudah selesai, namun harus mendengarkan feedback dari user
    - Bila perlu dilakukan penyesuaian product lagi

6. Maintanance
    - Tahap akhir, aplikasi sudah selesai dan dapat digunakan
    - Pengguna bisa jadi menemukan Bug yang tidak ditemukan pada Testing
    - Bisa jadi muncul siklus SDLC baru untuk memperbaiki Bug
    - Menentukan tambahan fitur pada rilis mendatang


## Model untuk melaksanakan SDLC

### Waterfall Model
- Model paling tua dan tersingkat
- Setiap 1 fase selesai, fase berikutnya harus segera dimulai
- Setiap Fase memiliki rencana kecil, menurun ke fase berikutnya
- Kekurangan : jika terdapat 1 detail kecil yang tertinggal, dapat mempengaruhi keseluruhan rencana dan berakhir berantakan

### Agile Model
- Model SDLC yang dapat memisahkan product dengan proses pengerjaan secara tepat
- Tim mencoba tiap produk yang sudah selesai untuk meminimalisir kesalahan
- Kekurangan : dapat memicu proyek ke arah yang salah, tidak sesuai requirement

### Iterative Model
- Memiliki repetisi tinggi
- Developer menciptakan produk dengan cepat, murah, mencoba produk dan merivisi jika ada kesalahan

## V Model
- Lanjutan dari waterfall model
- Mencoba tiap fase dalam proses pengembangan produk

## Big Bang Model
- Beresiko tinggi untuk dijalankan
- Tim menginvestasikan semua sumber daya dalam proyek
- Cenderung berhasil untuk proyek kecil, berbahaya untuk proyek besar

## Spiral Model
- Metode ini lumayan fleksibel, mirip dengan iterative model
- Berfokus pada repetisi dalam pengerjaan


# Agile Testing Manifesto
- Dapat mengevaluasi seberapa baik kita melakukan testing
- Pada metode lain testing tidak dapat dilakukan sebelum developer selesai bekerja, adanya blaming kesalahan saat terjadi bug

## 5 Keys

1. Testing is an activity not a phase
    - Testing dilakukan beriringan pada proses development
    - Membuat Test Case sebelum developer memproduksi code
    - Acceptance Criteria dapat dibuat terlebih dahulu

2. Prevent Bugs rather than Finding Bugs
    - Berfokus untuk mencegah bugs daripada menemukan / mencari bugs
    - Faktor munculnya bugs : Requirement yang kurang lengkap / detail, dapat dicegah dengan berkomunikasi dengan tim

3. Don't be a checker, be a tester
    - Sebagai Tester, Tidak cukup hanya melakukan testing tanpa memberikan masukan/improvement mengenai apa yang di test
    - Jika hanya melakukan functional testing tanpa memahami kebutuhan user yang akna menggunakan aplikasi, peran tester dipertanyakan
    - Pertan Tester sesungguhnya : memberikan feedback mengenai apa yang sudah ditest

4. Don't try to break the system, instead help build the best possible system
    - Tujuan utama development : menciptakan produk berkualitas
    - Seorang QA seharusnya memposisikan dirinya sebagai user, memiliki perspektif user, sehingga dapat memberikan masukan untuk developer

5. The whole team is responsible for quality, not just the tester
    - Beban kualitas produk yang dibangun tidak semestinya dibebankan pada 1 anggota saja
    - Bisa saja ada bug yang ditemukan saat produk baru saja dirilis, tidak serta-merta tanggung jawab tersebut dibebankan pada QA, dan juga tidak membebankan tanggung jawab tersebut pada Developer.
    - Setiap anggota tim bertanggung jawab berlandaskan kepemilikan atas produk yang dibangun bersama-sama
    - Seorang QA tidak diharuskan memberikan jaminan
    - QA membantu menganalisis pengujian


# Testing Pyramid
- Mengurangi waktu Tim untuk mengidentifikasi apakah perubahan yang dilakukan dapat merusak sistem dengan menawarkan feedback secara langsung
- Mengurangi waktu Tim Automation dalam eksekusi Test Case dengan mengkategorikan setiap fitur baru dalam 1 / semua test
- 3 Level Testing Pyramid :

    -   Level Paling Bawah : Unit Test
        Menguji setiap unit/komponen dalam software
        Dilakukan pada tahap development
        Unit dapat berupa function, method, procedure, module, object
        Tujuan : memvalidasi setiap unit dapat berjalan sesuai requirement

    -   Level Tengah : Inegration Testing
        Pengujian dari hasil penggabungan unit-unit yang ada
        QA menguji bagaimana unit-unit yang ada bekerja sebagai suatu kombinasi, bukan lagi sebagai unit individual
        Sebaiknya dilakukan secara bertahap untuk mengurangi kesulitan penelusuran jika terjadi kesalahan

    -   Level Paling Atas : UI Test (End to End Test)
        Paling dekat dengan interaksi pengguna
        User input harus memicu tindakan yang tepat, data harus dapat disajikan pada user
        Status UI harus berubah seperti requirement
        Menggunakan tools/framework end to end test memberitahu aplikasi apa yang harus di click, ketik, expected result yang diharapkan dari testing tersebut
- Berdasarkan Testing Pyramid, semakin tinggi level testing, semakin sedikit testing yang harus dilakukan
- Semakin tinggi level testing, untuk membuat test case, menjalankan dalam pipeline, dan maintanance butuh biaya yang lebih mahal
- Testing di level rendah cenderung berjalan lebih cepat, tidak memerlukan pedoman DOM yang lengkap dan mudah dimaintain karena masih berskala kecil
- Penulisan test tiap level berbeda tingkat detailnya
- Haruf berfokus pada unit test, menulis banyak unit test kecil dan cepat untuk mencakup semua kemungkinan kondisi dan output
- Menulis beberapa integration test untuk memastikan aplikasi kita memiliki behavior yang benar
- Meskipun kita dapat menampilkan konektivitas aplikasi dari ujung ke ujung untuk di test, kita tetap tidak dapat menguji semua tipe testing. Apakah UI nya cocok dengan design. Itulah mengapa testing tingkat tinggi penting.



# Task

1.  Pada fase apa saja QE berperan pada proses SDLC?
    Sebutkan dan jelaskan peran seperti apa yang QE dapat lakukan pada setiap fase tersebut !

    QE dapat berperan pada fase Design, Development, dan Testing
    - Pada Fase Design
        QE dapat merancang Test Case apa saja yang akan dilakukan, memperkirakan waktu testing berdasarkan kompleksitas projek
    - Pada Fase Development
        Jika mengacu pada agile testing, maka QE sudah dapat melakukan testing beriringan dengan development.
        Namun jika menggunakan model tradisional, maka QE hanya dapat menunggu hingga developer selesai memproduksi code.
    - Pada Fase Testing
        QE melakukan testing, baik unit testing, functional testing, integration testing, UI Test
        Menguji penggunaan aplikasi.

2.  Menurut teman-teman apa tantangan ketika menerapkan agile testing
    Berikan penjelasan pada masing-masing 5 poin agile testing manifesto !

    1. Testing adalah aktivitas, bukan fase
    Artinya testing dapat dilakukan bersamaan dengan proses development, tidak harus menunggu developer selesai memperoduksi Code.
    Test Case dapat dibuat sebelum developer memproduksi Code, Acceptance Criteria dapat dibuat terlebih dahulu.
    2. Prevent Bugs rather than Finding Bugs, berfokus untuk mencegah bugs bukan menemukan bugs. Biasanya bugs muncul apabila requirement kurang detail.
    3. Don't be a checker, be a tester, Tester tidak hanya melakukan testing namun juga mengevaluasi dan memberi masukan untuk pengembangan software
    4. Don't try to break the system, instead help build the best possible system, QE memposisikan diri sebagai user, dengan perspektif user, berfokus untuk memberikan masukan pada developer.
    5. The whole team is responsible for quality, not just the tester. Tanggung jawab software yang dibangun bersama adalah tanggung jawab tim bukan individual. Kesalahan / bug yang terjadi adalah kesalahan bersama, tidak dapat dibebankan menjadi kesalahan individual. Setiap anggota tim memposisikan diri sebagai pemilik software sehingga semua anggota memiliki tanggung jawab yang sama.