import java.util.Scanner;
public class latihanPraktikum7 {
    public static void main(String[] args) {
        // Deklarasi Variabel 
        int[] kumpulanAngka = { 3, 7, 10, 23, 38, 45, 56, 110, 77, 89, 96, 100 };
        int tertinggi;
        int cari;
        boolean ditemukan;
        Scanner input = new Scanner(System.in);

        // Menampilkan Isi Array 
        System.out.println("Isi Array: ");
        for (int x : kumpulanAngka) {
            System.out.print(x + " ");
        } // Tutup loop menampilkan array
        System.out.println("\n---------------------------");

        // 1. Cari Nilai Tertinggi 
        tertinggi = kumpulanAngka[0];
        for (int i = 1; i < kumpulanAngka.length; i++) {
            if (kumpulanAngka[i] > tertinggi) {
                tertinggi = kumpulanAngka[i];
            } // Tutup if
        } // Tutup loop mencari nilai tertinggi
        System.out.println("1. Nilai Tertinggi: " + tertinggi);

        // 2. Pencarian (Searching) 
        System.out.print("2. Masukkan angka yang dicari: ");
        cari = input.nextInt();
        ditemukan = false;

        for (int angka : kumpulanAngka) {
            if (angka == cari) {
                ditemukan = true;
                break;
            } // Tutup if
        } // Tutup loop pencarian

        if (ditemukan) {
            System.out.println("   Hasil: Angka " + cari + " ditemukan dalam array.");
        } else {
            System.out.println("   Hasil: Angka " + cari + " TIDAK ada dalam array.");
        }

        // 3. Membalik Array 
        System.out.print("3. Array dibalik: ");
        for (int i = kumpulanAngka.length - 1; i >= 0; i--) {
            System.out.print(kumpulanAngka[i] + " ");
        } // Tutup loop membalik array
        
        System.out.println();
        input.close(); // Tutup scanner
    } // Tutup main
} // Tutup class