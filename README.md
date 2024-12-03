# Sistem Antrian Pengunjung di Kebun Binatang

Program ini dibuat untuk membantu mahasiswa memahami konsep **Queue (Antrean)** dalam algoritma dan pemrograman. Dengan program ini, mahasiswa dapat mempelajari cara mengimplementasikan antrean menggunakan Java dan mempraktikkan operasi dasar pada antrean.

---

## 🎯 Tujuan Pembelajaran
1. Mahasiswa dapat memahami konsep **Queue** sebagai struktur data.
2. Mahasiswa dapat mengimplementasikan operasi dasar antrean, seperti:
   - Menambahkan elemen ke antrean (**enqueue**).
   - Menghapus elemen dari antrean (**dequeue**).
   - Menampilkan elemen dalam antrean.
3. Mahasiswa dapat membedakan **Queue** dari struktur data lain seperti **Stack**.
4. Mahasiswa dapat mengintegrasikan logika antrean ke dalam kasus nyata.

---

## 📚 Konsep Utama
### **Queue (Antrean)**
- **Definisi**: Struktur data linear yang mengikuti prinsip **FIFO** (First In, First Out), di mana elemen yang masuk pertama akan keluar pertama.
- **Operasi Utama**:
  - **Enqueue**: Menambahkan elemen baru ke akhir antrean.
  - **Dequeue**: Menghapus elemen dari awal antrean.
  - **Peek**: Melihat elemen pertama dalam antrean tanpa menghapusnya.
- **Implementasi dalam Java**:
  - Menggunakan interface `Queue` dari Java Collections Framework.
  - Kelas seperti `LinkedList` sering digunakan untuk implementasi sederhana.

### **Ide dari Program**
- Simulasi antrean pengunjung di kebun binatang.
- Menggunakan nama pengunjung sebagai elemen dalam antrean.
- Operasi mencakup penambahan pengunjung, pelayanan pengunjung, dan pengecekan antrean.

---

## 🔍 Common Mistaken Errors dan Miskonsepsi
### Miskonsepsi
1. **Queue adalah sama dengan Stack**:
   - Salah. Stack mengikuti prinsip **LIFO** (Last In, First Out), sedangkan Queue mengikuti **FIFO**.
2. **Queue hanya bisa diimplementasikan dengan array**:
   - Tidak benar. Queue dapat diimplementasikan dengan struktur lain seperti **Linked List**.
3. **Operasi enqueue dan dequeue hanya satu-satunya fungsi penting**:
   - Tidak tepat. Operasi seperti `peek` dan `isEmpty` juga sangat penting untuk memahami status antrean.

### Common Errors
1. **NullPointerException**:
   - Terjadi jika mencoba menghapus elemen dari antrean kosong tanpa pengecekan.
   - Solusi: Pastikan menggunakan metode `isEmpty()` sebelum memanggil `poll()`.

   ```java
   if (!queue.isEmpty()) {
       queue.poll();
   } else {
       System.out.println("Antrean kosong!");
   }
InputMismatchException:

Terjadi jika pengguna memasukkan input non-integer pada menu pilihan.
Solusi: Gunakan validasi input dengan try-catch untuk menangani error ini.
java
Copy code
try {
    int pilihan = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Input harus berupa angka!");
    scanner.next(); // membersihkan buffer
}
Duplicate Entry in Queue:

Pengunjung dengan nama yang sama dapat dimasukkan ke antrean.
Solusi: Tambahkan logika untuk memeriksa apakah nama sudah ada dalam antrean.
java
Copy code
if (!queue.contains(nama)) {
    queue.add(nama);
} else {
    System.out.println("Nama sudah ada dalam antrean!");
}
🛠️ Tools yang Digunakan
IntelliJ IDEA (atau IDE Java lainnya seperti Eclipse/NetBeans)
Java Development Kit (JDK)
versi 8 atau lebih baru.

📂 Struktur Folder
```
ZooQueueSystem/
├── src/
│   └── ZooQueue.java   // File utama program
├── .idea/              // Konfigurasi IntelliJ IDEA (otomatis dibuat)
├── ZooQueueSystem.iml  // Metadata proyek
└── out/                // File hasil kompilasi
```

📋 Langkah-Langkah Instalasi dan Penggunaan
Clone Repository:

bash
Copy code
git clone https://github.com/username/ZooQueueSystem.git
cd ZooQueueSystem
Buka di IntelliJ IDEA:

Pilih opsi Open di IntelliJ IDEA.
Navigasikan ke folder proyek dan klik OK.
Setup JDK:

Pastikan JDK sudah terpasang dan diatur di IntelliJ IDEA.
Pergi ke File > Project Structure > SDK, pilih versi JDK yang sesuai.
Jalankan Program:

Buka file ZooQueue.java di dalam folder src.
Klik tombol hijau di samping metode main untuk menjalankan program.
💻 Kode Program

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ZooQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        while (true) {
            System.out.println("\n--- Sistem Antrian Pengunjung ---");
            System.out.println("1. Masukkan Pengunjung");
            System.out.println("2. Layani Pengunjung");
            System.out.println("3. Cek Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pengunjung: ");
                    String nama = scanner.nextLine();
                    queue.add(nama);
                    System.out.println("Pengunjung " + nama + " telah ditambahkan ke antrian.");
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        String dilayani = queue.poll();
                        System.out.println("Pengunjung " + dilayani + " sedang dilayani.");
                    } else {
                        System.out.println("Antrian kosong! Tidak ada pengunjung yang bisa dilayani.");
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Pengunjung dalam antrian:");
                        for (String pengunjung : queue) {
                            System.out.println("- " + pengunjung);
                        }
                    } else {
                        System.out.println("Antrian kosong!");
                    }
                    break;

                case 4:
                    System.out.println("Sistem ditutup. Terima kasih!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

```

📖 Penjelasan
Queue: Struktur data FIFO (First In, First Out).
LinkedList: Digunakan untuk mengimplementasikan antrean.
Scanner: Digunakan untuk menerima input dari pengguna.
🧑‍🎓 Tugas Mahasiswa
Tambahkan fitur untuk menghitung jumlah pengunjung dalam antrean.
Tambahkan validasi jika nama pengunjung sudah ada dalam antrean.
Dokumentasikan program menggunakan komentar untuk setiap bagian kode.
📜 Lisensi
Proyek ini menggunakan lisensi MIT. Anda bebas menggunakannya untuk tujuan belajar.

## 📚 Konsep Dasar Queue dan Stack

### 🔄 Queue (Antrian)
**Queue** adalah struktur data yang mengikuti prinsip **First In, First Out (FIFO)**. Elemen pertama yang masuk ke dalam queue adalah elemen pertama yang keluar.

#### Karakteristik:
1. Elemen baru ditambahkan di belakang (rear) antrian.
2. Elemen dihapus dari depan (front) antrian.

#### Operasi Dasar:
- **Enqueue**: Menambahkan elemen ke belakang antrian.
- **Dequeue**: Menghapus elemen dari depan antrian.
- **Peek/Front**: Melihat elemen di depan tanpa menghapusnya.

#### Contoh:
- Antrian pelanggan di restoran.
- Buffer printer.

---

### ↩️ Stack (Tumpukan)
**Stack** adalah struktur data yang mengikuti prinsip **Last In, First Out (LIFO)**. Elemen terakhir yang masuk ke dalam stack adalah elemen pertama yang keluar.

#### Karakteristik:
1. Elemen ditambahkan dan dihapus hanya di satu ujung yang disebut **top**.
2. Operasi dilakukan dari atas tumpukan.

#### Operasi Dasar:
- **Push**: Menambahkan elemen ke atas stack.
- **Pop**: Menghapus elemen dari atas stack.
- **Peek/Top**: Melihat elemen di atas tanpa menghapusnya.

#### Contoh:
- Tumpukan piring di dapur.
- Fungsi rekursi dalam pemrograman.

---

## 🚨 Miskonsepsi Umum

### ❌ Queue
1. **Miskonsepsi**: Elemen dapat ditambahkan di mana saja dalam antrian.
   - **Fakta**: Penambahan elemen hanya bisa dilakukan di belakang (rear).
   
2. **Miskonsepsi**: Queue selalu kosong setelah satu elemen dihapus.
   - **Fakta**: Queue tetap dapat memiliki elemen, tergantung pada operasi yang dilakukan.

---

### ❌ Stack
1. **Miskonsepsi**: Elemen dapat dihapus dari mana saja dalam stack.
   - **Fakta**: Elemen hanya bisa dihapus dari atas (top).

2. **Miskonsepsi**: Stack dapat digunakan untuk semua jenis urutan data.
   - **Fakta**: Stack hanya cocok untuk urutan dengan sifat **LIFO**, seperti undo/redo di editor teks.

---

## 🎯 Tips untuk Memahami
1. **Visualisasi Konsep**: 
   - Bayangkan **queue** seperti antrian di loket tiket.
   - Bayangkan **stack** seperti tumpukan piring di dapur.

2. **Eksperimen dengan Kode**: 
   - Gunakan operasi seperti `enqueue`, `dequeue`, `push`, dan `pop` dalam program kecil untuk melihat bagaimana queue dan stack bekerja.

3. **Gunakan Analog**: 
   - Hubungkan konsep ini dengan situasi nyata agar lebih mudah dipahami.

---

## ✏️ Studi Kasus
1. **Queue**:
   - Bagaimana sistem antrian pelanggan di restoran menggunakan FIFO untuk efisiensi.
   
2. **Stack**:
   - Bagaimana browser menyimpan riwayat halaman menggunakan stack untuk fitur "Back" dan "Forward".

---

Dengan memahami konsep ini, mahasiswa diharapkan dapat mengimplementasikan **queue** dan **stack** dalam pemrograman Java serta mengenali kapan harus menggunakan salah satu dari keduanya.



Happy coding! 🚀#   B e l a j a r - S t r u k t u r - D a t a - d e n g a n - S i s t e m - P e s a n a n - R e s t o r a n  
 