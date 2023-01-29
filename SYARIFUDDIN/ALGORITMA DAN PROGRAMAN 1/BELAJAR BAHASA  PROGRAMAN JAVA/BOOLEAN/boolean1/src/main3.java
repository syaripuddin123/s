import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        
        // int a;
        Scanner input = new Scanner(System.in);

        // System.out.print("masukan nilai anda : ");
        // a = input.nextInt();

        // if (a >= 90) {
        //     System.out.println("selamat nilai anda A");
        // }else if (a >= 85) {
        //     System.out.println("selamat nilai anda A-");
        // }else if (a >= 80) {
        //     System.out.println("selamat nilai anda B+");
        // }else if (a >= 75) {
        //     System.out.println("selamat nilai anda B");
        // }else if (a >= 70) {
        //     System.out.println("selamat nilai anda B-");
        // }else if (a >= 60) {
        //     System.out.println("selamat nilai anda C+");
        // }else if (a >= 50) {
        //     System.out.println("selamat nilai anda C");
        // }else {
        //     System.out.println("selamat nilai anda E");
        // }

        // int hadir;
        // System.out.print("masukan kehadiran anda : ");
        // hadir = input.nextInt();

        // if (hadir >= 14) {
        //     System.out.println("anda siswa yang rajin");
        // }else if (hadir <= 10) {
        //     System.out.println("anda siswa yang malas");
        // }

        System.out.print("masukan tugas 1 : ");
        int tugas1 = input.nextInt();
        System.out.print("masukan tugas 2 : ");
        int tugas2 = input.nextInt();
        System.out.print("masukan tugas 3 : ");
        int tugas3 = input.nextInt();

        int terbesar;
        if (tugas1 > tugas2) {
            terbesar = tugas1;
        }else if (tugas2 > tugas3) {
            terbesar = tugas3;
        }else if (tugas3 > tugas1) {
            terbesar = tugas3;
        }

        System.out.println("nilai : " + terbesar);
        // int nilai =
    }   


}