package Modul_2.Bagian_3;

public class AksesModifier {
    public int publicVar = 1;
    private int privateVar = 2;
    protected  int protectedVar = 3;
    int defaultVar = 4;

    public void tampilkan(){
        System.out.println("public :" + publicVar);
        System.out.println("Private :"+ privateVar);
        System.out.println("Protec :" + protectedVar);
        System.out.println("Default :"+ defaultVar);
    }
}
