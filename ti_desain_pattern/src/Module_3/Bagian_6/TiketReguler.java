package Module_3.Bagian_6;

public class TiketReguler extends Tiket {
    public TiketReguler(){
        super("Reguler",1000000);
    }

    @Override
    public double hitungDiskon() {
        return 0;
    }
}
