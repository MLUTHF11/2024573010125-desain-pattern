package Bagian_6;

public class Pesanan {
    private final String namaPemesan;
    private final Tiket tiket;
    private final int jumlah;

    public Pesanan(String namaPemesan, Tiket tiket, int jumlah){
        this.namaPemesan = namaPemesan;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public int getJumlah() {
        return jumlah;
    }
    public double hitungTotal(){
        double total = tiket.getHarga() * jumlah;
        double diskon = tiket.hitungDiskon() * jumlah;
        return total - diskon;
    }
    public void displayDetail(){
        System.out.println("\nDetail Pesanan");
        System.out.println("Nama Pemesan: "+ namaPemesan);
        System.out.println("Jenis tiket: "+ tiket.getJenis());
        System.out.println("Jumlah: "+ jumlah);
        System.out.println("Total Harga: RP"+ hitungTotal());
    }
}
