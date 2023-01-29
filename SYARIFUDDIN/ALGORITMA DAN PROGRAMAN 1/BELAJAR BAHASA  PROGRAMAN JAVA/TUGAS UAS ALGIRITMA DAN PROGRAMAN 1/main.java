import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


       //NILAI TUGAS
        int tugas1, tugas2, tugas3;

        System.out.print("masukan nilai 1 : ");
        tugas1 = input.nextInt();

        System.out.print("masukan nilai 2 : ");
        tugas2 = input.nextInt();

        System.out.print("masukan nilai 3 : ");
        tugas3 = input.nextInt();

        int terbesar;
        if (tugas1 >= tugas2 && tugas1 >= tugas3) {
            terbesar = tugas1;
        }else if (tugas2 >= tugas3 && tugas2 >= tugas1) {
            terbesar = tugas2;
        }else {
            terbesar = tugas3;
        }
        System.out.println("nilai tugas terbesar : " + terbesar);

        //NILAI KEHADIRAN
        int hadir, uts, uas;
        System.out.print("masukan hadir : ");
        hadir = input.nextInt();
        Double hadir1 = hadir/18.0*100;
        System.out.println("kehadiran : " + hadir1);

        System.out.print("masukan nilai uts : ");
        uts = input.nextInt();
        System.out.print("masukan nilai UAS : ");
        uas = input.nextInt();
        
        Double nilai = (terbesar/30*100) + (hadir1*10/100) + (uts/30*100) + (uas/30*100);
        System.out.println("nilai keseluruhan : " + nilai);

        
    }
}