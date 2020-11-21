/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menampilkan titik koordinat
 * ke layar berbasis OOP dan implementasi pewarisan.
 */

public class Main {
    public static void main(String[] args) {
        WarnaKoordinat koordinat = new WarnaKoordinat(10, 4, "Jingga");

        System.out.println("Warna Koordinat : " + koordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + koordinat.getX() + ", y : " + koordinat.getY());
    }
}
