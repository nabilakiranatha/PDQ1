//1. import class 
import java.util.Scanner;
public class latihan {
    public static void main (String [] args ) {
        // 2. deklarasi scanner 
        Scanner scanner = new Scanner(System.in);
        
        //3. input (deklarasi variabel) 
        //value dlm variabel harus diberikan nilai default
        String namaBarang = "";
        int harga = 0, jumlahBeli = 0, total = 0;
        
        //teks input
        System.out.print("Nama barang : ");
        namaBarang = scanner.nextLine(); //nextLine utk String
        System.out.print("Harga : ");
        harga = scanner.nextInt(); //nextInt utk integer
        System.out.print("jumlah bpensil 33eli : ");
        jumlahBeli = scanner.nextInt();
        
        System.out.println(); //utk jarak baris baru kosong
        
        //4. output
        total = harga * jumlahBeli; 
        System.out.print("Total : " + total);
        
        //5. close scanner
        scanner.close();
    }

}