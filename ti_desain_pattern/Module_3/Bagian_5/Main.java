package Bagian_5;

    interface Terbang {
    void terbang();
}
    abstract class Hewan{
        String nama;
        abstract void bersauara();
    }
    class Burung extends Hewan implements Terbang{
        @Override
        void bersauara() {
            System.out.println("Berkicau");
        }
        @Override
        public void terbang() {
            System.out.println(nama + " sedang Terbang");
        }

    }

    public class Main {
        public static void main(String[] args){
            Burung burung = new Burung();
            burung.nama = "Merpati";
            burung.bersauara();
            burung.terbang();
        }
}
