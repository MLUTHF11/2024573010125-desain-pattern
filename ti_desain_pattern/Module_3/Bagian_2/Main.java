package Bagian_2;

public class Main {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Budiono");
        mhs1.setUmur(20);

        System.out.println("Nama: "+ mhs1.getNama());
        System.out.println("Umur: "+ mhs1.getUmur());
    }
}
