public class Karyawan{

    // property
    public String nama;
    public double gaji;

    // method
    public Karyawan(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public void showKaryawan(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Gaji: $" + this.gaji);
    }
        
}