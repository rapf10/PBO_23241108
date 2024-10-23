class Mahasiswa {
    // atribut dari objek
    String nama;
    String NIM;
    String Prodi;
    int umur;
    Double IPK;
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // pembuatan objek
        Mahasiswa mhs_1 = new Mahasiswa();

        // isi data objek
        mhs_1.nama = "rasya";
        mhs_1.NIM = "1223456789";
        mhs_1.Prodi = "Pendidikan Teknologi Informasi";
        mhs_1.umur = 35;
        mhs_1.IPK = 4.0;

        // mencetak objek
        System.out.println("Nama : " + mhs_1.nama);
        System.out.println("NIM :  " + mhs_1.NIM);
        System.out.println("Prodi : " + mhs_1.Prodi);
        System.out.println("Umur " + mhs_1.umur);
        System.out.println("IPK : " + mhs_1.IPK);
    }
}
