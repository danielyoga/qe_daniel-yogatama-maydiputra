## Practical Test Pyramid

Unit Testing -> menguji bagian" / unit" komponen dari sebuah perangkat lunak. Dilakukan dalam masa development oleh developer. Unit dapat berua function, method, procedure, module dll. Memvalidasi setiap unit dalam perangkat lunak.

Component Testing -> pengujian dilakukan pada komponen secara terpisah tanpa mengintegrasikan dengan komponen lain. Salah satu black box testing yang sering dilakukan QA.

Integration Testing -> pengujian dari penggabungan beberapa unit. Menguji unit" bekerja sebagai kombinasi yang saling terintegrasi dan berinteraksi. Dilakukan secara bertahap untuk mengurangi kesulitan bug tracking.

UI Test -> menguji cara user berinteraksi dengan sistem, notifikasi perubahan status kepada pengguna. Testing tingkat tertinggi.

Pengujian pada tahap yang lebih tinggi memerlukan lebih sedikit jumlah test. Namun Biaya yang diperlukan pada pengujian tahap tinggi lebih mahal dan lebih rumit dibanding pengujian tingkat rendah.
Penulisan test tiap level berbeda tingkat detailnya
1. Menulis banyak unit test untuk menguji semua kondisi yang mungkin terjadi
2. Menulis beberapa integrasi test untuk memastikan aplikasi dapat berperilaku dengan benar

Test pada tingkat tinggi harus berfokus pada scenario yang penting.

## 


x = y
    x = 4
    y = 4
    z = 6

y = z
    x = 4
    y = 6
    z = 6

z = x
    x = 4
    y = 6
    z = 4