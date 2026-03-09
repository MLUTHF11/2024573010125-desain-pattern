package Bagian_6;

abstract class Tiket {
    private final String jenis;
    private final double harga;

    public Tiket(String jenis,double harga){
        this.harga = harga;
        this.jenis = jenis;
    }
    public String getJenis(){
        return jenis;
    }

    public double getHarga() {
        return harga;
    }
    public abstract double hitungDiskon();
}
