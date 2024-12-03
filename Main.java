// Impor paket yang dibutuhkan untuk struktur data dan input
import java.util.LinkedList; // Untuk implementasi queue
import java.util.Queue;      // Antarmuka queue
import java.util.Scanner;    // Untuk input dari pengguna
import java.util.Stack;      // Untuk implementasi stack

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Deklarasi queue untuk menyimpan antrian pesanan
        Queue<Order> antrianPesanan = new LinkedList<>();
        
        // Deklarasi stack untuk menyimpan riwayat pesanan yang selesai
        Stack<Order> historyPesanan = new Stack<>();
        
        // Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        int pilihan; // Variabel untuk menyimpan pilihan menu pengguna

        // Menu interaktif menggunakan loop
        do {
            // Menampilkan menu pilihan
            System.out.println("\n=== Sistem Manajemen Pesanan Padang Resto ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Antrian Pesanan");
            System.out.println("3. Selesaikan Pesanan");
            System.out.println("4. Lihat History Pesanan Selesai");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            // Membaca input pilihan dari pengguna
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Menghilangkan newline dari input

            // Switch case untuk menangani pilihan menu
            switch (pilihan) {
                case 1 -> {
                    // Tambah Pesanan
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = scanner.nextLine(); // Membaca nama pelanggan
                    
                    System.out.print("Masukkan Nomor Meja: ");
                    int noMeja = scanner.nextInt();   // Membaca nomor meja
                    scanner.nextLine();              // Menghilangkan newline
                    
                    System.out.print("Masukkan Pesanan: ");
                    String pesanan = scanner.nextLine(); // Membaca pesanan
                    
                    System.out.print("Masukkan Jumlah: ");
                    int qty = scanner.nextInt();        // Membaca jumlah pesanan
                    
                    // Menambahkan pesanan ke dalam antrian
                    antrianPesanan.add(new Order(nama, noMeja, pesanan, qty));
                    System.out.println("Pesanan berhasil ditambahkan ke antrian.");
                }
                case 2 -> {
                    // Lihat Antrian Pesanan
                    System.out.println("\n=== Antrian Pesanan ===");
                    if (antrianPesanan.isEmpty()) {
                        // Jika tidak ada pesanan dalam antrian
                        System.out.println("Tidak ada pesanan dalam antrian.");
                    } else {
                        // Menampilkan semua pesanan dalam antrian
                        for (Order order : antrianPesanan) {
                            System.out.println(order);
                        }
                    }
                }
                case 3 -> {
                    // Selesaikan Pesanan
                    if (antrianPesanan.isEmpty()) {
                        // Jika tidak ada pesanan yang dapat diselesaikan
                        System.out.println("Tidak ada pesanan yang dapat diselesaikan.");
                    } else {
                        // Memindahkan pesanan dari antrian ke history
                        Order selesai = antrianPesanan.poll();
                        historyPesanan.push(selesai);
                        System.out.println("Pesanan telah diselesaikan: " + selesai);
                    }
                }
                case 4 -> {
                    // Lihat History Pesanan Selesai
                    System.out.println("\n=== History Pesanan Selesai ===");
                    if (historyPesanan.isEmpty()) {
                        // Jika belum ada pesanan yang diselesaikan
                        System.out.println("Belum ada pesanan yang diselesaikan.");
                    } else {
                        // Menampilkan semua pesanan yang telah selesai
                        for (Order order : historyPesanan) {
                            System.out.println(order);
                        }
                    }
                }
                case 5 -> {
                    // Keluar dari sistem
                    System.out.println("Keluar dari sistem. Terima kasih!");
                }
                default -> {
                    // Pilihan tidak valid
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        } while (pilihan != 5); // Loop berlanjut selama pengguna tidak memilih keluar
       // Tutup Scanner untuk mencegah kebocoran sumber daya
       scanner.close();
    }
}
