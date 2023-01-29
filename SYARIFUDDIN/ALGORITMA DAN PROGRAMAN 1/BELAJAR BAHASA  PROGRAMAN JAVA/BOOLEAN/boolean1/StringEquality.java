import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String a, b;
        System.out.print("nama anda = ");
        a = input.next();

        b = "mou";

        if (a.equalsIgnoreCase(b)) {
            System.out.println("kamu sangat ganteng");
        }else {
            System.out.println("kamu jelek");
        }
        
    }
   
    
}

