package Bagian_3;

class Processor{
    void jalankan(){
        System.out.println("Menjalankan Intruksi");
    }
}

class RAM{
    void baca(){
        System.out.println("Sedang membaca data dari memori.");
    }
    void tulis(){
        System.out.println("Sedang menulis data ke memori.");
    }
}

class Laptop{
    private String model;
    private Processor processor;
    private RAM ram;

    public Laptop(String model){
        this.model=model;
        this.ram=new RAM();//composition RAM
        this.processor=new Processor();//Composition Prosesor
    }


    public void nyalakan(){
        System.out.println("Menyalakan laptop: "+ model);
        processor.jalankan();
        ram.baca();
        ram.tulis();
        System.out.println(model+" siap digunakan.");
    }
}
public class LatihanB3 {
    public static void main(String[] args){
        Laptop laptop1 = new Laptop("Lenovo LOQ");
        laptop1.nyalakan();
    }
}
