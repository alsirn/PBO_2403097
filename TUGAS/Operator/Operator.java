public class Operator {
    public static void main(String[] args) {
        int x = 10, y = 5;

        // Aritmatika
        System.out.println("x + y = " + (x + y));

        // Relasional
        System.out.println("x > y? " + (x > y));

        // Logika
        System.out.println("(x > 5) && (y < 10)? " + ((x > 5) && (y < 10)));

        // Penugasan
        x += 5; // x = x + 5
        System.out.println("x setelah += 5: " + x);

        // Kondisional/Ternary
        String hasil = (x > y) ? "x lebih besar" : "y lebih besar";
        System.out.println(hasil);
    }
}
