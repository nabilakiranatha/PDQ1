public class tipeData  { //blok class (ini komen, tidak dibaca oleh sistem) 
    //blok main --> psvm + tab
    public static void main(String[] args) {
        //coding
    
        /*universitas dinamika membutuhkan aplikasi sederhana 
          untuk mencatat biodata mahasiswa, apa saja variabel dan tipe
          data yang diperlukan?

        NIM --> String
        Nama --> String
        Alamat --> String
        No. HP --> String
        Progam Studi --> String
        Dosen Wali --> String
        Sisa BOP --> int

        int : utk perhitungan/kalkulasi angka
        */

        //1. Deklarasi variabel
        String nim = "25410100053";
        String nama = "Rana";

        //2. Print nilai variabel --> sout +tab
        //cara 1: print tanpa teks tambahan
        System.out.println(nim);

        //cara 2": print dengan teks tambahan
        System.out.println("NIM mahasiswa adalah "+nim+ " dengan nama "+nama);
        
        //dengan operator escape : \n (utk enter ke baris baru saat diprint)
        System.out.println("NIM : " +nim + "\nNama : "+nama); }
    }