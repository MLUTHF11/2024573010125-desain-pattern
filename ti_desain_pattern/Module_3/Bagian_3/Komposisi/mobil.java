package Bagian_3.Komposisi;

public class mobil {
    private final Mesin mesin;

    public mobil(){
        this.mesin = new Mesin();
    }
    void mulai(){
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan");
    }
    void berhenti(){
        mesin.matikan();
        System.out.println(" Mobil berhenti");
    }
}
