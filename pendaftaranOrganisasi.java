import java.util.Scanner;
public class pendaftaranOrganisasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        int jumlahAnggota = 0;
        String pilihan;
        String namaAnggota;

        System.out.println("=== Sistem Pendaftaran Anggota Organisasi ===");

        // Memulai perulangan do-while
        do {
            // 1. Memasukkan data anggota
            System.out.print("\nMasukkan nama anggota baru: ");
            namaAnggota = input.nextLine();
            
            // 2. Menambah hitungan anggota
            jumlahAnggota++;
            System.out.println("Berhasil mendaftarkan anggota organisasi: " + namaAnggota);

            // 3. Menanyakan apakah ingin menambah lagi
            System.out.print("Apakah ingin menambahkan anggota lain? (Y/T): ");
            pilihan = input.nextLine();

            // Loop akan terus berjalan jika pilihan adalah 'Y' atau 'y'
        } while (pilihan.equalsIgnoreCase("Y"));

            // 4. Menampilkan hasil akhir setelah diinput data namanya
        System.out.println("-------------------------------------------");
        System.out.println("Proses pendaftaran selesai.");
        System.out.println("Total anggota yang berhasil didaftarkan: " + jumlahAnggota);
        System.out.println("-------------------------------------------");

        input.close();
    }   
}