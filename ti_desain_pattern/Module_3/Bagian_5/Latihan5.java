package Bagian_5;


interface Berenang {
    void Berenang();
}
abstract class HewanAir{
    String nama;
    abstract void makan();
}
class Ikan extends HewanAir implements Berenang{

    @Override
    void makan() {
        System.out.println("makan daging");
    }

    @Override
    public void Berenang() {
        System.out.println( nama +" berenang di pendalaman laut");
    }
}
public class Latihan5 {
public static void main(String[] args){
    Ikan hiu = new Ikan();
    hiu.nama = "Hiu Martil";
    hiu.Berenang();
    hiu.makan();
}
}
