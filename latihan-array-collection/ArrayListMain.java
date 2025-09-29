import java.util.ArrayList;

public class ArrayListMain {
    
    public static void main(String[] args) {
        
        ArrayList <String> dafterNama = new ArrayList <String> ();
        dafterNama.add("Zahran");
        dafterNama.add("Ravli");
        dafterNama.add("Eva");
        dafterNama.add("Bunga");

        for (String nama : dafterNama) {
            System.out.println(nama);
        }
    }
}
