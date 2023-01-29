import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int angka, total = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("masukan angka ke- "+ i + " menjadi : ");
            angka = input.nextInt();

            if (angka == 0){
                break;
            }else {
                total += angka;
            }
        }
        System.out.println("jumlah angka yang dimasukkan : "+total);

    }
}
