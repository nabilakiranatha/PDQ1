import java.util.Scanner;

public class latihanPercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar member
        String namaMember = "", alamatMember = "", noHpmember = "";
        String jawab = "";
        
        // Tambahkan variabel penanda member
        boolean statusMember = false; 

        // Transaksi belanja
        String namaBarang = "";
        double harga = 0, jumlah = 0, total = 0, diskon = 0, grandTotal = 0;

        System.out.print("Apakah ingin mendaftar member? (Y/T): ");
        jawab = scanner.nextLine();

        if (jawab.equalsIgnoreCase("y")) {
            statusMember = true; // Tandai bahwa dia member
            System.out.print("Nama anda: ");
            namaMember = scanner.nextLine();
            System.out.print("Alamat anda: ");
            alamatMember = scanner.nextLine();
            System.out.print("No HP anda: ");
            noHpmember = scanner.nextLine();

            System.out.print("Ingin lanjut berbelanja? (Y/T): ");
            jawab = scanner.nextLine();
            
            if (jawab.equalsIgnoreCase("y")) {
                System.out.print("Nama barang: ");
                namaBarang = scanner.nextLine();
                System.out.print("Harga: ");
                harga = scanner.nextDouble();
                System.out.print("Jumlah: ");
                jumlah = scanner.nextDouble();

                total = harga * jumlah;
                System.out.println("Total: " + total);

                // 1. Logika Diskon Nominal (10% atau 5%)
                if (total > 300000) {
                    diskon = total * 0.1; 
                } else if (total > 100000) {
                    diskon = total * 0.05;
                }

                // 2. Tambahan Logika Diskon Member (2%)
                if (statusMember) {
                    diskon = diskon + (total * 0.02); // Menambah 2% ke diskon yang sudah ada
                }
                
                grandTotal = total - diskon;
                System.out.println("Diskon: " + diskon);
                System.out.println("Total Bayar: " + grandTotal);
            }
        } else {
            System.out.println("Terima kasih telah berkunjung.");
        }
        
        scanner.close();
    }
}