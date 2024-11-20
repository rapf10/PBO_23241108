class Player{
    //data member atau variabel instan
    String nama; // default, bisa diakses dari luar kelas
    public int exp; // pubic, bisa diakses dari luar class
    private int health; // private,tida bisa diakses dari luar class

    //construktor modifier default
    Player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }
    //membuat method, deafult membaca
    void cetak(){
        kurangiExp();
        System.out.println("player : " + this.nama);
        System.out.println("Exp : "+ this.exp);
        System.out.println("Helath : " + this.health);
    }
    //method menulis modifire public
    public void ubahHealth(int value){
        this.health = value;
    }

    //method private
    void kurangiExp(){
        this.exp -= 10; // ini saama dengan exp = exp-10 (operator assigment)
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // inisialisasi objek
        Player player1 = new Player("saitaa", 50, 100);

        //default
        //membaca
        System.out.println(player1.nama);
        //menulis
        player1.nama = "Conan";
        System.out.println(player1.nama);

        //public
        //membaca
        System.out.println(player1.exp);
        //menulis
        player1.exp = 75;

        //private
        //membaca
        //System.out.println(player1.health);
        //menulis
       // player1.health = 34;

        // memanggil method default
        //membaca method
        player1.cetak();

        //method public
        //menulis private
        player1.ubahHealth(129);
        player1.cetak();

        //methid private kurangi exp
        player1.cetak();
    }
}
