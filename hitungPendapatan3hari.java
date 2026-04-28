public class hitungPendapatan3hari {
    public static void main(String[] args) {

        int jumlahHari = 3;
        int jumlahTransaksi = 3;
        int nominalPerTransaksi = 50000;
        int totalKeseluruhan = 0;

        // Loop luar untuk hari
        for (int i = 1; i <= jumlahHari; i++) {
            System.out.println("hari ke-" + i + " :");
            int totalHarian = 0;

            // Loop Dalam untuk transaksi
            for (int j = 1; j <= jumlahTransaksi; j++) {
                System.out.println("- transaksi " + j + " : Rp " + nominalPerTransaksi);
                totalHarian += nominalPerTransaksi; // Tambahkan nominal ke total harian
            }

            // Output total harian keseluruhan
            System.out.println("total : Rp " + totalHarian);
            System.out.println(); // Memberi jarak antar hari

            totalKeseluruhan += totalHarian; // Tambahkan total harian ke total keseluruhan
        }

        // Tampilkan total keseluruhan SETELAH semua loop selesai
        System.out.println("Total Pendapatan Selama " + jumlahHari + " Hari : Rp " + totalKeseluruhan);
    }
}