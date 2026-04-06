package Modul_2.Bagian_6;

public class Buku {

    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(){
        this.judul = "Unlnown";
        this.pengarang = "unknown";
        this.tahunTerbit = 0;
    }

    public Buku ( String judul,String pengarang, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    // setter dan getter
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }

    public void setPengarang(String pengarang) {
            this.pengarang = pengarang;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public void tampilkanInfo(){
        System.out.println("Judul buku :"+ judul);
        System.out.println("Nama pengarang :"+pengarang);
        System.out.println("Tahun Terbit buku :"+ tahunTerbit);
    }
}
