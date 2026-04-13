package Modul_4.Praktikum_2.Dengan_srp;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Masukkan nama pengguna: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan email pengguna: ");
        String email = scanner.nextLine();

        User user = new User(name, email);
        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();

        userRepository.save(user);
        emailService.sendWelcomeEmail(user);
    }
}
