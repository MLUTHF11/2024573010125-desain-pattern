package Bagian_6;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class KonferensiApp {
    private static final ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while(true){
            System.out.println("\n=== Aplikasi Pemesanan Tiket Konferensi ===");
            System.out.println("1. Lihat Dafter Tiket");
            System.out.println("2. Pesan tiket");
            System.out.println("3. Lihat Detail Pesanan");
            System.out.println("4. Batalkan Pesanan");
            System.out.println("5. Keluar");
            System.out.println("Pilih menu");
            int pilihan = scanner.nextInt();
            scanner.nextLine();// membersihkan line baru

            switch (pilihan){
                case 1:
                    lihatDafterTiket();
                    break;
                case 2:
                    pesanTiket();
                    break;
                case 3:
                    lihatDetailPesanan();
                    break;
                case 4:
                    batalkanPesanan();
                    break;
                case 5:
                    System.out.println("Terima Kasih telah menggunkan Aplikasi ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, Silahkan coba lagi");
            }
        }
    }

    private static void lihatDafterTiket(){
        System.out.println("\n Dafter Tiket");
        System.out.println("1. Tiket Reguler - Rp.1.000.000");
        System.out.println("2. Tiket VIP - Rp.2.500.000");
    }
    //method untuk memesan tiket
    private static void pesanTiket(){
        System.out.println("\n Masukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();

        System.out.println("pilih jenis tiket ( 1. Reguler, 2. VIP) : ");
        int jenisTiket = scanner.nextInt();
        System.out.println("Masukkan jumlah tiket: ");
        int jumlah = scanner.nextInt();

        Tiket tiket = null;
        switch (jenisTiket){
            case 1 :
                tiket = new TiketReguler();
            break;
            case 2:
                tiket= new TiketVIP();
                break;
            default:
                System.out.println("Jenis tiket tidak valid.");
                return;
        }
        Pesanan pesanan = new Pesanan(namaPemesan,tiket,jumlah);
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan berhasil dibuat!");
        pesanan.displayDetail();
    }
    // melihat pesanan
    private static void lihatDetailPesanan(){
        if (isNopesanan())return;
        System.out.println("Pilih nomor pesanan untuk melihat detail");
        int nomorPesanan = scanner.nextInt();
        if (nomorPesanan > 0 && nomorPesanan <= daftarPesanan.size()){
            daftarPesanan.get(nomorPesanan - 1).displayDetail();
        }else{
            System.out.println("Nomor pesanan tidaak Valid");
        }
    }
  private static boolean isNopesanan() {
      if (daftarPesanan.isEmpty()) {
          System.out.println("\n Belum ada pesanan.");
          return true;
      }
      System.out.println("\n Daftar Pesanan :");
      for (int i =0;i<daftarPesanan.size(); i++){
          System.out.println((i+1)+ "." + daftarPesanan.get(i).getNamaPemesan());
      }
      return false;
  }

  private static void batalkanPesanan(){
        if (isNopesanan()) return;

      System.out.println("pilih nomor Pesanan yang ingin di batalkan: ");
      int nomorPesanan = scanner.nextInt();
      if(nomorPesanan>0&& nomorPesanan<= daftarPesanan.size()){
          daftarPesanan.remove(nomorPesanan - 1);
          System.out.println("Pesanan berhasil di batalkan.");
      }else{
          System.out.println("Nomor pesanan tidak valid.");
      }
  }

}
