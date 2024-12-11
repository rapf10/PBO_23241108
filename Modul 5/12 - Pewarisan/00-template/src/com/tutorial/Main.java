package com.tutorial;

public class Main {

    public static void main(String[] args) {
        //membuat objek baru
        Hero hero1 = new Hero();
        hero1.nama = "Goku";
        hero1.cetak();

        //membuat objek dari subsclass hero tank
        System.out.println("\nini object turunan dari kelas Hero Tank!!!");
        HeroTank hero2 = new HeroTank();
        hero2.nama = "Gundala";
        hero2.cetak();

        //membuat objek dari subsclass hero mage
        System.out.println("\nini object turunan dari kelas Hero Mage!!!");
        HeroMage hero3 = new HeroMage();
        hero3.nama = "Saitama";
        hero3.cetak();
    }
}
