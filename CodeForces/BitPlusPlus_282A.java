package CodeForces;

import java.util.Scanner;

public class BitPlusPlus_282A {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int n = scan.nextInt();
        

        for (int i = 0; i < n; i++) {
            String stat = scan.next();
            if(stat.equalsIgnoreCase("++X")){
                ++x;
            }       
            if(stat.equalsIgnoreCase("X++")){
                x++;
            } 
            if(stat.equalsIgnoreCase("X--")){
                x--;
            } if(stat.equalsIgnoreCase("--X")){
                --x;
            }       
             
        }
        System.out.println(x);
        
        
    }
}
