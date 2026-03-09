package Bagian_6;

public class TiketVIP extends Tiket {
    public TiketVIP(){
        super("VIP",2500000);
    }

    @Override
    public double hitungDiskon() {
        return 0.1;
    }
}
