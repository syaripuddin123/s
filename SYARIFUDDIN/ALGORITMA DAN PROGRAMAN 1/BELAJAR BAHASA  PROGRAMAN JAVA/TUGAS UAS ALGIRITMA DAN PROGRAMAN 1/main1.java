public class main1 {

    public static void main(String[] args) {
        
        int nilai = 80;

        if (nilai >= 90) {
            System.out.println("A");
        }else if (nilai >= 85) {
            System.out.println("A-");
        }else if (nilai >= 80) {
            System.out.println("B+");
        }else if (nilai >= 75) {
            System.out.println("B");
        }else if (nilai >= 70) {
            System.out.println("B-");
        }else if (nilai >= 60) {
            System.out.println("C+");
        }else if (nilai >= 50) {
            System.out.println("C");
        }else if (nilai <= 50) {
            System.out.println("E");
        }

        int hadir = 5;
        if (hadir >= 18) {
            System.out.println("anda siswa yang sangat rajin");
        }else if (hadir >= 10) {
            System.out.println("anda siswa yang rajin");
        }else if (hadir <= 10) {
            System.out.println("anda siswa yang nakal");
        }
        
    }
}