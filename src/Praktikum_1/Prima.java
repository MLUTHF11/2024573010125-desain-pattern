package Praktikum_1;

public class Prima {
    public static void main(String[] args){
        int n =7;
        boolean isprima = true;
        for( int i =2; i<=n/2;i ++){
            if(n%i==0){
                isprima=false;
                break;
            }
        }
        System.out.println(n+(isprima ?" adalah bilangan prima" : "bukan bilangan prima."));
    }
}
