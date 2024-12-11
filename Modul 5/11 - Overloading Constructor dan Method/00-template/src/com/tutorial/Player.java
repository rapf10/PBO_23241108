package com.tutorial;

public class Player {
    // atribut
    private static int jumlahplayer;
    private String nama;
    

    //opsi 1
    //constructor 1
    Player(String nama){
        Player.jumlahplayer++;
        this.nama = nama;
    }

    //opsi 2
    //constructor 2
    //overloading yang membuat constructor 1
    Player(){
        Player.jumlahplayer++;
        this.nama = "player" + Player.jumlahplayer;
    }

    //method (karena bersifat private)
    void cetak(){
        System.out.println("Nama : " + this.nama);
    }

}
