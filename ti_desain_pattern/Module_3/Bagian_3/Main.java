package Bagian_3;


    class Mesin{
        void hidupkan(){
            System.out.println("Mesin menyala");
        }
        void matikan(){
            System.out.println("Mesin dimatikan");
        }
    }
    //Superclass utk inherintance
    class Kendaraan{
        void bergerak(){
            System.out.println("Kendaran sedang bergerak");
        }
    }
    //Subclass yang menggunakan Composition dan Inherintance
    class Mobil extends Kendaraan{
        private Mesin mesin; // composition

        public Mobil(){
            this.mesin = new Mesin(); // objek mesin
        }
        void mulai(){
            mesin.hidupkan();
            System.out.println("Mobil siap digunakan");
        }
        void berhenti(){
            mesin.matikan();
            System.out.println("Mobil berhenti");
        }
    }
public class Main {
        public static void main(String[] args){
            Mobil mobil1 = new Mobil();
            mobil1.mulai();
            mobil1.bergerak();
            mobil1.berhenti();

        }
    }

