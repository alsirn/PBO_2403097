import java.util.Scanner;
public class InputUser  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        System.out.println("Nama: " + nama + ", Umur: " + umur);
        scanner.close();
    }
}