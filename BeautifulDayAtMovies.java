import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulDayAtMovies{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(beautifulDays(i, j, k));
        //beautifulDays(i, j, k);
    }
    
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here

        int count = 0;
        for (int l = i; l <= j; l++) {
            //arr.add(l);
            String yy = String.valueOf(l);
            String input = new StringBuilder(yy).reverse().toString();
            int test = Integer.parseInt(input);
            int result = l - test;
            if(result % k == 0){
                count++;
            }
        }
      
    
        return count;
    }
}