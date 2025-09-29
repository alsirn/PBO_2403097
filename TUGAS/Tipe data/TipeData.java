public class TipeData {
    public static void main(String[] args) {
        // Primitive
        int a = 10;
        double b = 20.5;

        // Wrapper
        Integer c = Integer.valueOf(a);
        Double d = Double.valueOf(b);

        // Casting
        int e = (int) b; // double ke int

        // Parsing
        String angkaStr = "123";
        int angka = Integer.parseInt(angkaStr);

        System.out.println("a: " + a + ", b: " + b);
        System.out.println("c: " + c + ", d: " + d);
        System.out.println("e (casting): " + e);
        System.out.println("angka (parsing): " + angka);
    }
}
