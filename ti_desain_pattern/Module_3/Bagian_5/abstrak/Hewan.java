package Bagian_5.abstrak;

abstract class Hewan {
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan");
    }

    //method abstract
    abstract void bersuara();
}
    class Kucing extends Hewan{
        @Override
        void bersuara(){
            System.out.println("Meong!!!");
        }
    }
    class Anjing extends Hewan{
        @Override
        void bersuara(){
            System.out.println("Guk guk !!!");
        }
    }

