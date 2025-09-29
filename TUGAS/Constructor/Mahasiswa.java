public class Mahasiswa {
    String nama;
    int umur;

    // Default constructor
    public Mahasiswa() {
        nama = "kosong";
        umur = 0;
    }

    // Parameterized constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
}
