public class ArrayMain{


    public static void main(String[] args){
        // String nama1 ="Zahran";
        // String nama2 ="Fadhlan";
        // String nama3 ="Rizky";
        // String nama4 ="Alif";

        // cara 1
        double[] nilai = new double[4];
        nilai[0] = 78.5;
        nilai[1] = 77.0;
        nilai[2] = 89.3;
        nilai[3] = 24.84;
        System.out.println(nilai[2]);

        // cara 2
        String [] dafternama = new String[4];
        dafternama[0] = "Zahran";
        dafternama[1] = "Fadhlan";
        dafternama[2] = "Rizky";
        dafternama[3] = "Alif";
        System.out.println(dafternama[0]);
        System.out.println(dafternama.length);
    }
}