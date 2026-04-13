package Modul_4.Latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama prodek: ");
        String product = scanner.nextLine();

        System.out.println("Masukkan jumlah: ");
        int quantity = scanner.nextInt();

        System.out.println("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        OrderManager order = new OrderManager(product,quantity,price);
        order.saveOrder();
        order.printReceipt();
    }
}
