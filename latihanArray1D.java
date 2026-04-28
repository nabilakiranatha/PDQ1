import java.util.Scanner;

public class latihanArray1D {
    public static void main(String[] args) {
        /*
         * Buatlah progam seperti dibawah ini:
         * Pemesanan Tiket Surabaya Zoo
         * 1. Input kategori dan Harga
         * 2. Input jumlah beli tiket
         * 3. Lihat total bayar
         * 4. Keluar progam
         * 
         * Pada menu 1. input data, terdiri atas kategori dan harga dengan isian bebas
         * dari admin.
         * Kemudian pada menu 2 mengisi jumlah tiket yang dibeli.
         * pada menu 3, dilakukan menghitung total bayar dari jumlah tiket yang dibeli
         * (sekaligus print total bayar)
         */

        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        // kategori dan harga isian bebas, total, jumlah beli,
        String[] kategori = null;
        int[] harga = null;
        int[] jumlahBeli = null;
        int pilihMenu = 0;
        int jmlKategori = 0;

        // loop menu
        do {
            System.out.println("\nPemesanan Tiket Surabaya Zoo");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli Tiket");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu: ");

            pilihMenu = sc.nextInt();
            sc.nextLine();

            switch (pilihMenu) {
                case 1:
                    // input jumlah kategori dan harga menggunakan array 1D
                    System.out.print("Jumlah kategori yang diisi: ");
                    jmlKategori = sc.nextInt();
                    sc.nextLine();

                    // Deklarasi ulang array untuk menambahkan element array
                    kategori = new String[jmlKategori];
                    harga = new int[jmlKategori];
                    jumlahBeli = new int[jmlKategori];

                    // loop input data array
                    for (int i = 0; i < kategori.length; i++) {
                        System.out.print("Nama kategori : ");
                        kategori[i] = sc.nextLine();
                        System.out.print("Harga : Rp ");
                        harga[i] = sc.nextInt();
                        sc.nextLine();
                    }

                    // Loop output konfirmasi
                    System.out.println("\nData Berhasil Diinput!");
                    for (int i = 0; i < kategori.length; i++) {
                        System.out.println("Kategori ke-" + (i + 1) + ": " + kategori[i]);
                        System.out.println("Harga ke-" + (i + 1) + ": " + harga[i]);
                    }

                case 2:
                    // input jumlah beli
                    if (kategori == null) {
                        System.out.println("(!) Input kategori di Menu 1 dulu.");
                    } else {
                        System.out.println("\n=== Input Jumlah Tiket ===");
                        for (int i = 0; i < kategori.length; i++) {

                            // cetak pilihan kategori dan harga apa saja
                            System.out.println("Kategori: " + kategori[i] + " | Harga: Rp "  + harga[i]);
                            System.out.print("Jumlah tiket yang ingin dibeli: ");
                            jumlahBeli[i] = sc.nextInt();
                        }
                        System.out.println("---------------------------");
                        System.out.println("Data jumlah tiket berhasil disimpan.");
                    }
                    break;

                case 3:
                    // tampilkan total bayar
                    if (kategori == null) {
                        System.out.println("(!) Data masih kosong.");
                    } else {
                        int totalBayar = 0;
                        System.out.println("\n --- Rincian Pembayaran --- ");
                        for (int i = 0; i < kategori.length; i++) {
                            int subTotal = harga[i] * jumlahBeli[i];
                            System.out.println(kategori[i] + " (" + jumlahBeli[i] + " tiket) : Rp " + subTotal);
                            totalBayar += subTotal;
                        }
                        System.out.println("------------------------------");
                        System.out.println("TOTAL BAYAR: Rp " + totalBayar);
                    }
                    break;

                case 4:
                    // exit
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihMenu != 4);
        sc.close();
    }
}