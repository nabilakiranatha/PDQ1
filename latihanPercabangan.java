import java.util.Scanner;
public class latihanPercabangan {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //daftar member (nama, alamat, no hp)
        String namaMember="", alamatMember="", noHpmember="";
        String jawab ="";
        //tranksaksi belanja
        String namaBarang="";
        int harga=0.0, jumlah=0.0, total=0.0, diskon=0.0, grandTotal=0;

        //ditanyakan dulu mau daftar member atau tdk
        //berikan data teks input
        System.out.print ("Apakah ingin mendaftar member? (Y/T)");
        jawab = scanner.nextLine();

        //cek jawaban user, jawabannya Y atau T menggunakan IF
        //equals = case sensitive (perhatikan kapital/tdknya)
        //equalsIgnoreCase = case non sensitive
        if (jawab.equalsIgnoreCase(anotherString: "y")) {
            //alternatif: if (jawab.equals (anObject: "Y" || jawab.equals))
            //true / jwb Y
            System.out.print("Nama anda");
            namaMember = scanner.nextLine();
            System.out.print("Alamat anda");
            alamatMember = scanner.nextLine();
            System.out.print("No HP anda :");
            noHpmember = scanner.nextLine();

            System.out.print("Ingin lanjut berbelanja? (Y/T");
            jawab = scanner.nextLine();
            if (jawab.equalsIgnoreCase(anotherString :"y")) {
            System.out.print("Nama barang : ");
            namaBarang = scanner.nextLine();
            System.out.print("harga : ");
            Harga = scanner.nextDouble();
            System.out.print("Jumlah :");
            Jumlah = scanner.nextDouble();

            System.out.println();

            Total= Harga * Jumlah;
            System.out.printl ("total:" + Total);
            //hitung diskon
            if (Total > 100000.0) {
                Diskon = Total + 0.05 * 0.01;
            } else if (total > 300000.0) {
                Diskon = Total * 0.1 * 0.02;
            }
        // komen = blok + ctrl + garing
        // if (jawab. equals ("y") || jawab.equals ("y")) (
            //contoh: jwb = Y/y
            //jwb Y

        } else {
            //jwb T
        }
    }  
}
}
