class Mahasiswa {
    String nama;
    int nim;
    String prodi;
    int umur;
    double ipk;

    // cpnstruktor
    // nama sama dengan nama class
    //tidak punya return value
    // method tang pertama kali diciptakan dipanggil saat object diciptakan
    Mahasiswa(String inputnama, int inputnim, String inputprodi, int inputumur, double inputipk) {
     // isi data 
        nama = inputnama;
        nim = inputnim;
        prodi = inputprodi;
        umur = inputumur;
        ipk = inputipk;

    // cetak
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("umur : " + umur);
        System.out.println(" IPK : " + ipk);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Mahasiswa mhs_1 = new Mahasiswa("Rasya", 23241108, "PTI", 35, 10.5);
        
       
    }
}