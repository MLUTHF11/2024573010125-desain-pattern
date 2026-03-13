package Bagian_4.Overriding.latihan;

public class Main {
    public static void main(String[] args){
BangunDatar persegi1 = new Persegi(7);
BangunDatar segitiga1 = new Segitiga(9,8);

        System.out.println("Luas Persegi= "+ persegi1.hitungLuas());
        System.out.println("Luas Segitiga= " + segitiga1.hitungLuas());
    }
}
