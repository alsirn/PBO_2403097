import java.io.*;

public class ContohThrows {
    public static void bacaFile() throws IOException {  // ← deklarasi throws
        throw new IOException("File tidak ditemukan");   // ← lempar throw
    }

    public static void main(String[] args) {
        try {
            bacaFile();
        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
