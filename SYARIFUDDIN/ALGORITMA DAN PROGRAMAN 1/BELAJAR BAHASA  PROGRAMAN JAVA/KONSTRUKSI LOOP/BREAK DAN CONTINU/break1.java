public class break1 {
    public static void main(String[] args) {
        
        //MENGGUNAKAN BREAK
        //BREAK DIGUNAKAN PADA SAAT INGIN KELUAR DARI PERULANGAN SEPERTI (FOR, WHILE DAN DO WHILE)
        //SAAT KONDISI TERTENTU TERPENUHI

        //FOR LOOP
        System.out.println("ini adalah break for loop : ");
        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
        System.out.println(i);
        }

        //WHILE LOOP
        System.out.println("ini adalah break while loop : ");
        int a = 0;
        while (a < 10) {
            if (a == 5) {
                break;
            }
        a++;
        System.out.println(a);
        }

        //DO WHILE LOOP
        System.out.println("ini adalah break do while loop : ");
        int b = 0;
        do {
            if (b == 5) {
                break;
            }
            System.out.println(b);
            b++;
        }while (b <= 10);
    }
}
