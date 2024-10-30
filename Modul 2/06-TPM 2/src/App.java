class Bangun_Datar {
    //buat atribut
    double panjang;
    double lebar;

    //buat konstruktornya
    Bangun_Datar(double Panjang, double Lebar) {
        this.panjang = Panjang;
        this.lebar = Lebar;
    }

    //buat method
    void hitungluas() { // hitung luas
        double luas =  panjang * lebar;
        System.out.println("Luas = " + luas);
       
    }

    void hitungkeliling() { //hitung keliling
        double keliling =  2 * (this.panjang + this.lebar);
        System.out.println("Keliling = " + keliling);
    }

    void hasil() { // cetak hasil
        hitungkeliling();
        hitungluas();
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //objek
        Bangun_Datar bangun = new Bangun_Datar(3, 6);
        bangun.hasil(); // print hasil
    }
}