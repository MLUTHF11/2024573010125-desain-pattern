package Modul_2.Bagian_5;

public class Person {
    private String nama;
    private  int umur;

    // default constructor
    public Person(){
        nama = "Unknown";
        umur = 0;
    }

    public Person(String nama,int umur){
        this.umur = umur;
        this.nama = nama;
    }

    public void tampilkanInfo(){
        System.out.println("Nama: "+ nama);
        System.out.println("Umur: "+ umur);
    }

}
