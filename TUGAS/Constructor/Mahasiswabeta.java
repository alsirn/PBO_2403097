public class Mahasiswabeta {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();                           // Menggunakan Default Constructor
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", 20);       // menggunakan Parameterized Constructor
        
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
    }
}
