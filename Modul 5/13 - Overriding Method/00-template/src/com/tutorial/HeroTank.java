package com.tutorial;

public class HeroTank extends Hero {
    // atribut (hanya dimiliki oleh turunan atau subsclass saja)
    double defensePower;

    // overriding terhadap method cetak (superclass)
    void cetak(){
        System.out.println("\nHero Tank");
        System.out.println("Hero Name : " + this.nama);
        System.out.println("Defense Power : " + this.defensePower);
    }

    
}
