### Definition
Software yang digunakan dalam development suatu proyek

### JIRA
- Dikembangkan sebagai tools bug tracking, issue tracking, project management
- Fitur :
    1. Task Assignment, anggota dan tim lain dapat mengetahui progres projek
    2. Scrum and Kanban Boards, tim dapat lebih mudah melakukan brain storming. Tiap anggota dapat menentukan prioritas kerja. Anggota tim dapat mengetahui masalah yang dialami anggota lain
    3. Roadmaps, anggota tim dapat mengetahui gambaran ke depan. Tim Leader dapat mengetahui apa yang sedang dikerjakan
    4. Konektivitas dengan aplikasi lain
    5. Visualisasi laporan pengerjaan project

## How to Create New Project
1. Create Project
2. Choose method (Kanban, Scrum, Bug Tracking)
3. Choose Project Type (Team Manage, Company Manage)
4. Add Project Details (Name)
5. Add Panel if needed (Deliver, Testing, Finish, Need Fix)

## Panels
- To Do : Story yang akan dikerjakan dan sudah diprioritaskan saat planning. Story paling atas = prioritas yang paling diutamakan
- In Progress : Story yang sedang dikerjakan
- Finish : Story yang selesai dikerjakan developer namun belum siap di testing
- Deliver : Story yang selesai dikerjakan developer dan sudah siap di testing
- Testing : Story yang sedang di testing oleh quality engineer
- Need Fix : Story yang tidak lolos kriteria
- Done : Story yang sudah lolos kriteria

## How to make issue
1. Choose Project
2. Choose Issue Type
    - Story : Issue untuk membuat fitur baru
    - Task : Issue untuk merinci tugas
    - Bug : Issue untuk merinci penemuan Bug oleh tester
    - Epic : Issue untuk mengelompokkan task
3. Summary (Judul issue yang akan dibuat)
4. Description : Penjelasan maksud dari sebuah issue
5. Assign : menentukan siapa yang akan mengerjakan sebuah issue
6. Labels : mengkategorikan issue
7. Sprint : ruang waktu pengerjaan issue
8. Priority : berdasarkan tingkat kesulitan (Highest, High, Lowest, Medium)
9. Reporter : pembuat issue
10. Fill optional field if neccessary

### Yang harus diperhatikan oleh QE pada JIRA
- Ketika menemukan bug saat testing, kita harus membuat issue bertipe bug
- Jelaskan kondisi saat ini seperti apa, expected result seperti apa, serta langkah-langkah untuk melakukan testing
- Pindahkan story ke panel in progress


## Task Challenge
1. Apa yang dimaksud dengan Bugs ?
    - Ketidaksesuaian hasil yang diperoleh dengan requirement suatu fitur
2. Apa yang dimaksud dengan "TO DO" pada JIRA?
    - Kolom "TO DO" berisikan story yang akan dikerjakan dan sudah diprioritaskan saat planning
3. Apa yang dimaksud dengan "IN PROGRESS" pada JIRA?
    - Kolom "IN PROGRESS" berisikan story yang sedang dikerjakan oleh developer
4. Apa perbedaan antara "Deliver" dan "Finish"?
    - Story pada kolom finish belum siap di testing sedangkan story pada kolom deliver sudah siap untuk ditesting.
5. Apa yang dimaksud dengan "EPIC" pada JIRA?
    - EPIC digunakan untuk mengelompokkan task
6. Apa yang harus dilakukan saat menggunakan tools jira, jika kita menemukan bugs pada fitur yang sudah dilakukan testing
    - Saat melakukan testing dan menemukan bugs, kita harus membuat issue baru bertipe bug
    - Pada issue tersebut, kita dapat menjelaskan bagaimana kondisi saat ini, serta expected resultnya seperti apa
    - Kita juga dapat menjelaskan langkah-langkah yang kita lakukan untuk melakukan testing
    - Lalu kita harus memindahkan issue / story tersebut ke panel in progress