# Serenity BDD

- Serenity = merupakan BDD open source framework yang membantu penulisan terstruktur dan maintanable acceptance pengujian otomasi
- Arsitektur Serenity terdiri dari Requirements, Tests, Steps, Pages, and Reports.

## Define Requrements
- Dimulai dari kebutuhan yang ingin diimplementasikan
- Diekspresikan dengan cerita user serta kriteria accepance untuk memperjelas kebutuhan
- Cerita tersebut yang diotomasi serenity

## Automate Acceptance Criteria
- Deskripsikan kriteria acceptance dengan bahasa bisnis tingkat tinggi
- Kriteria acceptance dapat direkam menggunakan alat BDD (Cucumber) dalam bentuk fitur agar dapat dijalankan serenity

## Implement Test
- Implementasikan kriteria acceptance ke dalam kode sehingga dapat dijalankan pada aplikasi yang sebenarnya.
- Pengujian dipecah ke dalam langkah langkah untuk readibility dan maintanance yang lebih mudah

## Report On Test Result
- Serenity memberikan penjelasan detail pada hasil dan eksekusi pengujian termasuk :
    1. Narasi untuk setiap pengujian
    2. Tangkapan layar untuk setiap langkah didalam pengujian
    3. Hasil pengujian seperti waktu eksekusi, pesan error apabila pengujian gagal

## BDD With Cucumber
1. Menulis cerita (Gherkin Syntax)
2. Configure Stories
3. Browser Interaction (Map steps to browser manipulation)
4. Run Stories (Intellij Idea, maven)
5. View Reports

## Writing the test
1. Create File Stories
2. Create File Test Class
3. Create File Test Steps
4. Create File Page Objects
- Definisi Skenario Test
- Otomasi Stories
- Penjelasan langkah langkah dalam skenario
- Berinteraksi dengan browser

### Write Test Story
- Membuat file story didalam direktori test resource
- Feature terdiri dari 3 bagian : Feature, Scenario dan Scenario dalam syntax Gherkin (Given, When, Then)

### Create Test Class
- Membuat test class didalam package test/java
- Setiap "Given", "When" dan "Then" didalam file story harus direpresentasikan dalam 1 fungsi saja
- Fungsi dianotasikan dengan syntax gherkin yang berhubungan

### Create Page Object
- Membuat class yang meng extends PageObject
- Didalam kelas ini terdapat fungsi yang menyimpan lokasi elemen dan mengoperasikan elemen web
- Tidak ada batasan untuk metode untuk mencari selektor / locate the element seperti menggunakan id, xpath, class, css selector.

### Run the test
- Jalankan pengujian dengan perintah mvn verify
- Perintah tersebut akan menghasilkan log pada konsol dan berbagai error apabila ada
- Setelah pengujian dijalankan, laporan secara otomatis dibuat dan disimpan pada lokasi default

### Serenity Properties
- Serenity mendukung berbagai properti untuk menyesuaikan berjalannya pengujian
- Webdriver.driver mendeskripsikan browser mana yang digunakan dalam pengujian
- Ignore.failures.in.stories mengatur serenity untuk melanjutkan testing ke skenario selanjutnya meskipun skenario yang sedang dijalankan

### Parameter Injection
- Tulisan pada story dapat digunakan sebagai variabel, menggunakan {} pada anoasi string didalam class test
- Contoh "billy@alterra.com" digunakan sebagai variable dengan nama email_user

### Meta Filtering
- Untuk mengatur story scenario, dapat digunakan tag untuk setiap fitur/skenario yang berhubungan
- Untuk menjalankan test dengan tag spesifik, menggunakan perintah seperti dibawah
> mvn verify -Dtags="@User"

### Parameterised Scenario
- Didalam story, skenario dapat digunakan dengan parameter dengan nilai yang dikonfigurasi
- Scenario dengan parameter sama namun dengan nilai berbeda

###