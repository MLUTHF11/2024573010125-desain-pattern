package Modul_4.Latihan;

import java.io.IOException;
import java.io.FileWriter;

public class OrderManager {
    private String product;
    private int quantity;
    private double price;

    public OrderManager(String product,int quantity,double price){
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return quantity*price;
    }

    public void saveOrder(){
        try(FileWriter writer = new FileWriter("Order.txt",true)){
            writer.write(product+" - "+quantity+"- Rp"+ calculateTotal()+"\n");
            System.out.println("pesanan telah disimpan!");
        }catch (IOException e){
            System.out.println("GAgal menyimpann pesanan: "+ e.getMessage());
        }
    }

    public void printReceipt(){
        System.out.println("\n Struk Pesanan");
        System.out.println("produk: "+ product);
        System.out.println("harga: "+ price);
        System.out.println("jumlah: "+ quantity);
        System.out.println("====================================");
    }
}
