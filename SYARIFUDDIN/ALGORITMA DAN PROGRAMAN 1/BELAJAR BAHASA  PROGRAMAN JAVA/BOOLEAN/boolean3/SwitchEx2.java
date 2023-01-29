import java.util.Scanner;

public class SwitchEx2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan opsi : ");
        char option = input.next().charAt(0);
        int aCount = 0, bCount = 0, cCount = 0;
        switch (option) {
            case 'A':
                aCount++;
                System.out.println("Count of A  " + aCount);
                break;
            case 'B':
                bCount++;
                System.out.println("Count of B  " + bCount);
                break;
            case 'C':
                cCount++;
                System.out.println("Count of B  " + cCount);
                break;
       
        }

    }
}


