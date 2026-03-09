package Bagian_5.antarmuka;

public interface Bergerak {
    void bergerak();

    default void berhenti(){
        System.out.println("Berhenti bergerak.");
    }

        static void info(){
            System.out.println("ini adalah interface bergerak");
        }
    }
class Mobil implements Bergerak{
    @Override
    public void bergerak() {
        System.out.println("Mobil sedang melaju");
    }
}

class Pesawat implements Bergerak{
    @Override
    public void bergerak() {
        System.out.println(" Pesawat sedang terbang");
    }
}
