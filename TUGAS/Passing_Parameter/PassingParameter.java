public class PassingParameter {
    static class Mahasiswa {
        String nama;
        Mahasiswa(String nama) {
            this.nama = nama;
        }
    }

    public static void ubah(int x) {
        x = 10;
    }

    public static void ubahNama(Mahasiswa m) {
        m.nama = "Andi";
    }

    public static void main(String[] args) {
        int a = 5;
        ubah(a);
        System.out.println("a setelah ubah: " + a); // tetap 5

        Mahasiswa m = new Mahasiswa("Budi");
        ubahNama(m);
        System.out.println("Nama setelah ubahNama: " + m.nama); // Andi
    }
}
