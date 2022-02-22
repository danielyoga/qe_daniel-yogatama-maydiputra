### TEST SCENARIO
- Dokumen berisi langkah-langkah sistematis yang disusun tester, untuk memastikan sistem dapat digunakan oleh user dan dapat berjalan dengan baik serta memenuhi standar tertentu
- Tingkatan tertinggi dari test case
- Tujuan :
    1. Mempermudah developer dan tester untuk melakukan testing
    2. Menjadi dasar pengembangan project
    3. Dasar klien untuk menyesuaikan system requirement
- Tools : Google Spreadsheet, TestRails, Testlink, dll

- Good Test Scenario :
    1. In line with system requirement
    2. Give Context (User dapat bersikap seolah-olah harus melakukan suatu tindakan)
    3. Give Details (Memberikan rincian spesifisik mengenai hal-hal yang perlu diketauhi user)
    4. Crystal Clear, Easy to Understand (Memberikan penjelasan detail dan expected result untuk mempermudah testing)
    5. Complete (User dapat melakukan apapun sesuai scenario yang diberikan)
    6. Coherent (Scenario satu dengan yang lain, Step satu dengan yang lain harus berkesinambungan)
    7. Proofed (Lengkapi dengan hasil yang didapatkan dari scenario yang telah dilakukan seperti pass or failed)
    8. Konsisten dengan penggunaan kata
    9. End user mind, dont assume
    10. Don't forget to cover negative test
    11. Update (Perubahan itu pasti, perbaharui versi perubahannya)

- Contoh Test Scenario :
    Check login functionality
    Check forgot email functionality
    Check create new account functionality

### TEST CASE
- Uji Kasus : rangkaian tindakan yang dilakukan tester untuk memverifikasi fitur
- Beberapa step positive dan negativ yang dapat di execute dalam sebuah test scenario
- Mampu memberi respon ketika ada output yang tidak valid
- Terdiri dari : Pre-Conditions, Steps, Expected Result, Status, Expected / Actual Result
- Perhatikan :
    1. Dibuat sederhana dan transparan (jelas, ringkas agar bisa dieksekusi orang lain)
    2. Dibuat dengan end user in mind (Membuat kasus uji dengan perspektif pengguna akhir)
    3. Hindari pengulangan test case
       Apabila diperlukan beberapa test case untuk mengeksekusi test case lain, dapat dimasukkan ke dalam pre-conditions.
    4. Jangan berasumsi

- Trashability metrics dapat digunakan untuk memverifikasi tidak ada fungsi yang belum diuji
- Testcase dan id nya harus dapat diidentifikasi , mempermudah pelacakan error, mengidentifikasi requirement berikutnya
- Repeatable. Testcase harus bisa menghasilkan hasil yang sama meskipun testing diperlukan berulang kali, dan dilakukan oleh siapa saja.
- Peer review, test case yang dibuat harus direview orang lain untuk menemukan cacat dalam test case yang bisa saja terjadi.

Contoh Test Case dalam Test Scenario :
    Test Scenario -> Check The Login Functionality
        Test Case 1 : Enter valid email and valid password (Disebut Positive Test Case)
        Test Case 2 : Enter valid email and invalid password (Disebut Negative Test Case)
        Test Case 3 : Enter invalid email and valid password (Disebut Negative Test Case)
        Test Case 4 : Enter invalid email and invalid password (Disebut Negative Test Case)

Test Scenario = "What to be tested"
Test Case = "How to be tested"

## Challenge

[TestScenario.xlsx](./praktikum/TestScenario_sepulsacom.xlsx)