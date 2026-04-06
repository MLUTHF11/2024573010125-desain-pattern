package Modul_2.Bagian_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int pilihan;

        do {
            // Menu
            System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Keluar");
            System.out.println("4. Pillih menu");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan){
                case 1:
                    //Tambah buku
                    System.out.println("Masukkan judul buku");
                    String judul = scanner.nextLine();
                    System.out.println("Masukkan nama pengarang");
                    String pengarang = scanner.nextLine();
                    System.out.println("Masukkan tahun terbit");
                    int tahunTerbit = scanner.nextInt();
                    scanner.nextLine();

                    Buku bukuBaru = new Buku(judul,pengarang,tahunTerbit);
                    perpustakaan.tambahBuku(bukuBaru);
                    break;

                case 2:
                    //tampilkan semua buku
                    perpustakaan.tampilkanSemuaBuku();
                    break;

                case 3 :
                    System.out.println("Masukkan judul buku yang ingin di cari: ");
                    String judulCari = scanner.nextLine();
                    perpustakaan.cariBuku(judulCari);
                    break;

                default:
                    System.out.println("Pilihan tidak ada, coba lagi");
            }
        } while (pilihan!=4);
        scanner.close();
    }
}
