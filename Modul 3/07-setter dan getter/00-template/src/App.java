class Data{
    public int intPublic;
    private int intPrivate;
    private int doublePrivate;

    //constructor, modifier public
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 100;
    }
    //method untuk membaca / GETTER
    public int getIntPrivate(){
        return this.intPrivate; //untuk mengembalikan nilai
    }

    //method untuk menulis/setter
    public void setDoublePrivate(double hasil){
        this.doublePrivate = hasil;
    }
    //mthod unutk membaca semua variabel
    void cetak(){
        System.out.println("intPublic : "+this.intPublic);
        System.out.println("intPrivate : " + this.intPrivate);
        System.out.println("doublePrivate : " + this.doublePrivate);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //inisialisasi objek
        Data data = new Data();

        //membaca dan menulis public
        data.intPublic = 5; //membaca
        System.out.println("Public : "+ data.intPublic); //menulis
        
        //MEMBACA MENGGUNAKAN GETTER
        int angka = data.getIntPrivate(); 
        System.out.println("private : " + angka);

        //menulis dengan setter
        data.cetak();
    }
}
