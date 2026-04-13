package Modul_4.Praktikum_2.Dengan_srp;


public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("\nMengirim email ke " + user.getEmail() + "...");
        System.out.println("Halo " + user.getName() + ", selamat datang di sistem kami!\n");
    }
}
