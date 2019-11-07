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
public class suportcaracter extends character{
     private final String related;

    public suportcaracter(String related, String name, String from, boolean eyeglasses) {
        super(name, from, eyeglasses);
        this.related = related;
    }
    
    public String getRelated() {
        return related;
    }

    public void displayCharacter() {
        System.out.println("-----");
        System.out.println("Nama : " + name);
        System.out.println("-----");
        System.out.println("Dari : " + from);
        if(eyeglasses) {
            System.out.println("Kecamata : Iya");
        } else {
            System.out.println("Kecamata : Tidak");
        }
        System.out.println("Hubungan dengan tokoh utama : " + related);
        System.out.println();
    }
}
