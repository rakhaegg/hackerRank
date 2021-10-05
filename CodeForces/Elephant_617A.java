package CodeForces;

import java.util.Scanner;

public class Elephant_617A {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        boolean check = false;
        int lipatan = 0;
        int start = 1;
        int count = 0;
        do {
            
            if(n >= start  && n <= lipatan){
                check =true;
                
                break;
            }
            count++;
            start = 1 + lipatan;
            lipatan = 5 * count;
           
           
        } while (!check );
        System.out.println(count);

    }
}
