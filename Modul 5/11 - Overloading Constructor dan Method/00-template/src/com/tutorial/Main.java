package com.tutorial;

public class Main {
    
    public static void main(String[] args){
        //membuat objek opsi 1
        Player player1 = new Player("Goku");
        //membuat objek opsi 2
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Gundala");

        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
    }
}
