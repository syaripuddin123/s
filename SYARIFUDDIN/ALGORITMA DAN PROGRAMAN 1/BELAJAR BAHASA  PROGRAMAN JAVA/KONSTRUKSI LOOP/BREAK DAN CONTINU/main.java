import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        //MENGGUNAKAN BREAK, CONTINU DAN RETURN
        //MENGGUNAKAN BREAK
        int i = 1;
        while (i < 10) {
            if (i == 5){
                break;
            }else{
                System.out.println(i);
            }
            i++;
        }

        //MENGGUNAKAN CONTINU
        int a;
        do {
             a = 0;
            a++;
            if (a == 3){
                continue;
            }
        }while (a <= 10);
        System.out.println(a);
        
        
        
    }
}