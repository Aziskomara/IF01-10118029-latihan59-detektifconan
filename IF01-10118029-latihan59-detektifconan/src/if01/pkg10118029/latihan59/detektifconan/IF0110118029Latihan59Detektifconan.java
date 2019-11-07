/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan59.detektifconan;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Detektif Conan
 */
public class IF0110118029Latihan59Detektifconan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        maincaracter ConanEdogawa = new maincaracter("Investigator","Menyelesaikan Kasus" ,"Conan Edogawa", "Tokyo", true);
        maincaracter RanMouri = new maincaracter("Karate", "Sama Seperti Shinichi", "Ran Mouri", "Osaka", false);
        suportcaracter EisukeHondo = new suportcaracter("Temen Sekelas Ran Mouri", "Eisuke Hondo", "Osaka", false);
        ConanEdogawa.displayCharacter();
        RanMouri.displayCharacter();
        EisukeHondo.displayCharacter();
    }
    
}
