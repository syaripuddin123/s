public class continue1 {
    public static void main(String[] args) {
        
        //MENGGUNAKAN CONTINUE PADA PERULANGAN
        //CONTINUE DIGUNAKAN UNTUK MELAJANJUTKAN ITERASI BERIKUTNYA DARI PERULANGAN TANPA MENGEKSEKUSI
        //PERINTAH DIBAWAHNYA

        //FOR LOOP 
        System.out.println("ini adalah continue for loop : ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        // Output: 1 3 5 7 9

        //WHILE LOOP
        System.out.println("ini adalah continue while loop : ");
        int a = 0;
        while (a < 10) {
            if (a % 2 == 0) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
        // Output: 1 3 5 7 9

        //DO WHILE LOOP
        System.out.println("ini adalah cotinue do while loop : ");
        int c = 0;
        do {
            if (c % 2 == 0) {
            c++;
            continue;
            }
            System.out.println(c);
            c++;
        } while (c < 10);
        // Output: 1 3 5 7 9


        

    }
}
