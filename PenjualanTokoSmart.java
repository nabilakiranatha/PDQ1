 import java.util.Scanner; 

public class PenjualanTokoSmart {
    public static void main(String[] args) {

        // try w resources
        try (Scanner input = new Scanner (System.in)) {

        //--- 1. DEKLARASI & VARIABEL ---
        System.out.println("SISTEM PENJUALAN TOKO SMART MERR ");

        System.out.print("Masukkan Nama Barang  : ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan Harga Barang : ");
        double hargaBarang = input.nextDouble();

        System.out.print("Masukkan Jumlah Beli  : ");
        int jumlahBeli = input.nextInt();

        // --- 2. PROSES (KALKULASI) ---
        // Menghitung total belanja
        double totalBayar = hargaBarang * jumlahBeli;

        //--- 3. OUTPUT (STRUK BELANJA) ---
        System.out.println("TOKO SMART MERR");
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Harga Satuan   : Rp " + hargaBarang);
        System.out.println("Jumlah Beli    : " + jumlahBeli + " pcs");
        System.out.println("-------------------------------------");
        
        //Menggunakan \n untuk baris baru agar rapi
        System.out.println("TOTAL BELANJA  : Rp " + totalBayar);
        System.out.println("=====================================");
        System.out.println("Cabang: Merr, Surabaya");

        input.close(); //Menutup scanner 
        }
    }
}