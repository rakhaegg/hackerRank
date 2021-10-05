import java.util.ArrayList;
import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n  = scan.nextInt();

        //int number; // = some int
        //System.out.println(findDigits(n));
        //System.out.println(n);
        findDigits(n);
                    
    }   
    public static int findDigits(long n) {
        // Write your code here
        ArrayList<Long> arr = new ArrayList<>();
        int count =0;
        long val = n;
        while (n > 0) {
            arr.add(n % 10);
            System.out.println(n % 10);
            n = n / 10;
        }
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 0){continue;}

            if(val % arr.get(i) == 0){
                count++;
            }
        }
        return count;
    
    } 
}
