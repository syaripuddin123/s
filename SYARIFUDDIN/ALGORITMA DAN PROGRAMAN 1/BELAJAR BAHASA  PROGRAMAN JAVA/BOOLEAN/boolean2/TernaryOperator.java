public class TernaryOperator {

    public static void main(String[] args) {
     


        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        
         // Use a ternary operator to perform the same logic as above.
        int c = 7;
        int d = 8;
        int g;

         g = (c == 9) ? (c * d) : (d + c);
        System.out.println("hasilnya = " + g);
         
    }
}

      
    

