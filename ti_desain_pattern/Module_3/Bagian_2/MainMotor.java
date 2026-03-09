package Bagian_2;

public class MainMotor {
    public static void main(String[] args) {
        Motor mtr1 = new Motor();
        mtr1.setMerk("Honda");
        mtr1.setTahun(2027);

        System.out.println("Merk: " + mtr1.getMerk());
        System.out.println("Tahun: " + mtr1.getTahun());
    }
}
