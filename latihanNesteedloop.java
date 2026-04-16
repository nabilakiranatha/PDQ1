import java.util.Scanner;
public class latihanNesteedloop { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    // Meminta satu kali input untuk semua pola
        System.out.print("Masukkan input kolom : ");
        int n = input.nextInt();

        // 1. Pola Kotak (Square)
        System.out.println("\n1. Pola Kotak:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2. Pola Segitiga Siku-Siku (Siku Kiri Bawah)
        System.out.println("\n2. Pola Segitiga Siku-Siku:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. Pola Segitiga Terbalik (Siku Kiri Atas)
        System.out.println("\n3. Pola Segitiga Terbalik:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4. Pola Segitiga Siku-Siku dengan Spasi (Siku Kanan Bawah)
        System.out.println("\n4. Pola Segitiga Siku Kanan:");
        for (int i = 1; i <= n; i++) {
            // Mencetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}