import java.util.*;
public class main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("=====KALKULATOR SEDERHANA=====" );
        System.out.print("masukkan angka pertama : ");
        int a = input.nextInt();
        System.out.print("silahkan pilih operator ,+ ,- , * ,/ : ");
        char operator = input.next().charAt(0);
        System.out.print("masukkan angka kedua : ");
        int b = input.nextInt();
        int hasil1, hasil2, hasil3, hasil4;

        switch (operator) {
            case '+':
                hasil1 = a + b;
                System.out.println("hasil dari " + a + " " + operator + " " + b + " = " + hasil1);
                break;
            case '-':
                 hasil2= a - b;
                System.out.println("hasil dari " + a + " " + operator + " " + b + " = " + hasil2);
                break;
            case '*':
                hasil3 = a * b;
                System.out.println("hasil dari " + a + " " + operator + " " + b + " = " + hasil3);
                break;
            case '/':
                hasil4 = a / b;
                System.out.println("hasil dari " + a + " " + operator + " " + b +  " = " + hasil4);
                break;
            default:
                System.out.println("mohon maaf operator yang anda masukkan salah");
        }
    }
}
