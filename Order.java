// Definisi kelas Order untuk merepresentasikan pesanan
public class Order {
    private String namaCust; // Nama pelanggan
    private int noTable;     // Nomor meja
    private String pesanan;  // Pesanan pelanggan
    private int qty;         // Jumlah pesanan

    // Konstruktor untuk menginisialisasi atribut pesanan
    public Order(String namaCust, int noTable, String pesanan, int qty) {
        this.namaCust = namaCust;
        this.noTable = noTable;
        this.pesanan = pesanan;
        this.qty = qty;
    }

    // Getter untuk nama pelanggan
    public String getNamaCust() {
        return namaCust;
    }

    // Getter untuk nomor meja
    public int getNoTable() {
        return noTable;
    }

    // Getter untuk pesanan pelanggan
    public String getPesanan() {
        return pesanan;
    }

    // Getter untuk jumlah pesanan
    public int getQty() {
        return qty;
    }

    // Override metode toString untuk menampilkan informasi pesanan
    @Override
    public String toString() {
        return "Nama: " + namaCust + ", Meja: " + noTable + ", Pesanan: " + pesanan + ", Jumlah: " + qty;
    }
}
