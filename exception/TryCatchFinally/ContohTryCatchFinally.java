package TryCatchFinally;
public class ContohTryCatchFinally {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; // menimbulkan ArithmeticException
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Program selesai (blok finally selalu dijalankan).");
        }
    }
}
