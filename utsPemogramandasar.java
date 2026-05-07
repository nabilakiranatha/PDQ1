import java.util.Scanner;

public class utsPemogramandasar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        buatlah sebuah progam untuk mengevaluasi Waktu belajar selama 1 minggu. 
        Pertama, user harus mengisi jumlah mahasiswa terlebih dahulu disimpan dalam array 1 dimensi. 
        Kemudian, nama mahasiswa dan lama belajar (dalam satuan jam) masing-masing mahasiswa diisi dan disimpan dalam array 1 dimensi. 
        Progam harus menghitung dan menampilkan rata-rata Waktu belajar mahasiswa dalam satuan jam, 
        apabila rata-rata Waktu belajar per hari adalah 2-4 jam, maka dianggap aktif. 
        Namun apabila sebaliknya maka dianggap perlu motivasi
        */

        // 1. Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = input.nextInt();
        input.nextLine(); 

        // 2. Deklarasi Array 1 Dimensi
        String[] namaMhs = new String[jmlMahasiswa];
        double[] jamBelajar = new double[jmlMahasiswa];
        double totalJam = 0;

        // 3. Looping untuk input data mahasiswa
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama Mahasiswa: ");
            namaMhs[i] = input.nextLine();
            System.out.print("Lama belajar 1 minggu (jam) : ");
            jamBelajar[i] = input.nextDouble();
            input.nextLine(); // Membersihkan buffer

            // Menjumlahkan total jam untuk menghitung rata-rata nanti
            totalJam += jamBelajar[i];
        }

        // 4. Menghitung rata-rata belajar per mahasiswa dalam 1 minggu
        double rataRataMingguan = totalJam / jmlMahasiswa;
        // Menghitung rata-rata per hari (1 minggu = 7 hari)
        double rataRataPerHari = rataRataMingguan / 7;

        // 5. Menampilkan Hasil dan Evaluasi
        System.out.println("\n========== HASIL EVALUASI ==========");
        System.out.println("Total Mahasiswa: " + jmlMahasiswa);
        System.out.println("Rata-rata belajar per hari: " + rataRataPerHari + " jam");

        // 6. Percabangan IF-ELSE untuk menentukan status
        if (rataRataPerHari >= 2 && rataRataPerHari <= 4) {
            System.out.println("Status: Mahasiswa Aktif");
        } else {
            System.out.println("Status: Perlu Motivasi");
        }

        input.close();
    }
}