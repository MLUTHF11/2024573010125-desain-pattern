package Modul_2.Bagian_2;

public class Main {
    public static void main(String[] args){
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.angka1 = 10;
        kalkulator.angka2 = 20;

        System.out.println("Hasil penjumlahan : "+ kalkulator.tambah());
    }
}
