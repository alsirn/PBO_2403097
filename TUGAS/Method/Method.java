public class Method {
    public void cetakPesan() {
        System.out.println("Halo!");
    }

    public int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Method m = new Method();
        m.cetakPesan();
        int hasil = m.tambah(5, 3);
        System.out.println("Hasil: " + hasil);
    }
}
