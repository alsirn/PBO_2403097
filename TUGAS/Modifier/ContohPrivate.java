public class ContohPrivate {
    // Variabel private hanya bisa diakses dalam kelas ini
    private String rahasia = "Ini adalah data rahasia";

    // Method public untuk mengakses variabel private secara aman
    public String getRahasia() {
        return rahasia;
    }

    // Method public untuk mengubah nilai variabel private
    public void setRahasia(String rahasiaBaru) {
        this.rahasia = rahasiaBaru;
    }

    public static void main(String[] args) {
        ContohPrivate obj = new ContohPrivate();

        // Tidak bisa mengakses langsung variabel private:
        // System.out.println(obj.rahasia); // ERROR: rahasia has private access

        // Mengakses variabel private melalui method public
        System.out.println("Rahasia awal: " + obj.getRahasia());

        // Mengubah nilai variabel private melalui method public
        obj.setRahasia("Data rahasia telah diubah");

        System.out.println("Rahasia setelah diubah: " + obj.getRahasia());
    }
}
