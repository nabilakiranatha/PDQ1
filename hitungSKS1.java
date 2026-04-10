import java.util.Scanner;
public class hitungSKS1 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan total nilai (bobot * sks): ");
        double totalBobot = input.nextDouble();

        System.out.print("Masukkan total SKS yang diambil: ");
        int totalSksDiambil = input.nextInt();

        // 2. Menghitung IPS
        double ips = totalBobot / totalSksDiambil;
        int sksMaks;
        String keterangan; // Variabel tambahan untuk menampung deskripsi

       System.out.println("\nIPS " + nama + " adalah: " + ips);

        // 3. Logika Penentuan Kategori
        int kategori;
        if (ips >= 3.50) {
            kategori = 4;
        } else if (ips >= 3.00) {
            kategori = 3;
        } else if (ips >= 2.00) {
            kategori = 2;
        } else {
            kategori = 1;
        }

        // 4. Logika Switch Case dengan Tambahan Keterangan
        switch (kategori) {
            case 4:
                sksMaks = 24;
                keterangan = "Sangat Baik";
                break;
            case 3:
                sksMaks = 22;
                keterangan = "Baik";
                break;
            case 2:
                sksMaks = 20;
                keterangan = "Kurang Baik";
                break;
            case 1:
            default:
                sksMaks = 18;
                keterangan = "Kurang Baik Banget";
                break;
        }

        // 5. Output Akhir
        System.out.println("Beban Belajar Maksimal Semester depan: " + sksMaks + " SKS");
        System.out.println("Predikat: " + keterangan);
        
        input.close();
    }
}