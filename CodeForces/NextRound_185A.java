package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class NextRound_185A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[10000];

        for (int i = 1; i <= n; i++) {
            int thidr = scan.nextInt();
            arr[i] = thidr;
        }
        
        int count = 0;

        
        for (int i = 1; i <= n; i++) {
            

            if((arr[i] >= arr[k] )){
                if(arr[i] > 0){
                    count++;
                }
                
            }
        }
        System.out.println(count);
   
     
    }
}
