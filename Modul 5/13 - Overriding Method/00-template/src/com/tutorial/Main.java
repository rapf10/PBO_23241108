package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // buat objek dari superclass
        Hero hero1 = new Hero();
        System.out.println("Hero dari superclass");
        hero1.nama = "Saitama";
        hero1.cetak();

        //membuat object dari subsclass (hero tank)
        HeroTank hero2 = new HeroTank();
        hero2.nama = "belerick";
        hero2.defensePower = 100;
        hero2.cetak();
    }
}
