# Post Processor

- Digunakan untuk mengekstrak data tertentu dari sebuah response.
- Salah satu Post Processor = JSON Extractor
- Beberapa expression yang dapat digunakan untuk mengekstrak data dari sebuah response yang berformat json:
    - $ = root element
    - . = child element
    - [] = child operator (sebuah elemen di dalam sebuah array)
    - ..= recursive descent (langsung ke objek)
    - * = wildcard (semua nilai)
    - - [start:end] = array slice operator borrowed