package Bagian_4.Overloading;

public class Main {
    public static void main(String[] args){
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Hasil 1: "+ kalkulator.tambah(5,10));
        System.out.println("Hasil 2: "+kalkulator.tambah(5,10,9));
        System.out.println("Hasil 3: "+ kalkulator.tambah(3.5,2.5));
    }
}
