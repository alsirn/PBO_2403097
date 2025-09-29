public class ContohThrow {
    public static void main(String[] args) {
        int usia = 15;
        if (usia < 18) {
            throw new IllegalArgumentException("Umur harus >= 18");
        }
        System.out.println("Akses diizinkan");
    }
}
