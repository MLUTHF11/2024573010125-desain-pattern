package Modul_2.Bagian_6;

import java.util.ArrayList;

public class Perpustakaan {
    // atribut private
 private ArrayList<Buku> daftarBuku;
 // constructor
    public Perpustakaan(){
        daftarBuku = new ArrayList<>();
    }
    // method tambah buku
    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
        System.out.println("Buku Berhasil Disimpan");
    }
    public void tampilkanSemuaBuku(){
        if (daftarBuku.isEmpty()){
            System.out.println("Tidak ada buku yang tersimpan");
        }else {
            System.out.println("daftar buku:");
            for (Buku buku : daftarBuku){
                buku.tampilkanInfo();
            }
        }
    }
    // method mencari buku  berdasarkan judul
    public void cariBuku(String judul){
        boolean ditemukan = false;
        for (Buku buku : daftarBuku){
            if (buku.getJudul().equalsIgnoreCase(judul)){
                System.out.println("Buku ditemukan");
                buku.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }
        if(!ditemukan){
            System.out.println("Buku dengan judul \""+ judul + "\" tidak ditemukan. ");
        }
    }
}