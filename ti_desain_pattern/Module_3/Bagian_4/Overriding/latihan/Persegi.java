package Bagian_4.Overriding.latihan;

public class Persegi extends BangunDatar {
   private int sisi;
   public Persegi(int sisi){
       this.sisi=sisi;
   }

    @Override
    public double hitungLuas() {
        return  sisi * sisi;
    }
}
