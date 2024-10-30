class Bangun_Datar {
    double panjang;
    double lebar;

    Bangun_Datar(double Panjang, double Lebar) {
        this.panjang = Panjang;
        this.lebar = Lebar;
    }

    void HitungLuas() {
        double luas =  panjang * lebar;
        System.out.println("Luas = " + luas);
       
    }

    void HitungKeliling() {
        double keliling =  2 * (this.panjang + this.lebar);
        System.out.println("Keliling = " + keliling);
    }

    void cetakHasil() {
        HitungKeliling();
        HitungLuas();
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Bangun_Datar bangun = new Bangun_Datar(3, 6);
        bangun.cetakHasil();
    }
}