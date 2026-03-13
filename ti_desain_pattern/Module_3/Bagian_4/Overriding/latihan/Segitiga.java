package Bagian_4.Overriding.latihan;

public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;
    private int c ;
    public Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return  0.5 * alas * tinggi  ;
    }
}
