import java.util.Scanner;

public class latihanPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalBayar = 0;
        String daftarBarang = "";
        
        System.out.println("=== Selamat Datang di Inimaret ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBarang ke-" + i);
            
            System.out.print("Nama Barang  : ");
            String nama = input.nextLine();
            
            System.out.print("Harga Barang : ");
            long harga = input.nextLong();
            input.nextLine(); // Clear buffer

            totalBayar += harga;
            daftarBarang += i + ". " + nama + " (Rp " + harga + ")\n";

            // Cek jika sudah mencapai batas maksimal 5 barang
            if (i == 5) {
                System.out.println("\n[Kapasitas Penuh! Program otomatis mencetak nota]");
                break; 
            }

            // Tanya user apakah mau lanjut atau tidak
            System.out.print("Lanjut input barang? (iya/tidak): ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("tidak")) {
                break; // Keluar dari perulangan
            }
        }

        // Cetak Struk
        System.out.println("\n========== NOTA INIMARET ==========");
        System.out.print(daftarBarang);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL BELANJA : Rp " + totalBayar);
        System.out.println("===================================");
        
        input.close();
    }
}