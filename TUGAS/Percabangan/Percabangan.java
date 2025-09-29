public class Percabangan {
    public static void main(String[] args) {
        int nilai = 75;
        if (nilai >= 80) {
            System.out.println("Nilai A");
        } else if (nilai >= 70) {
            System.out.println("Nilai B");
        } else {
            System.out.println("Nilai C");
        }
        switch (nilai) {
            case 100:
                System.out.println("Sempurna");
                break;
            case 75:
                System.out.println("Bagus");
                break;
            default:
                System.out.println("Perbaiki lagi");
        }
    }
}