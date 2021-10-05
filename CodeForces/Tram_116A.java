package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tram_116A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n  = scan.nextInt();

        int[] a = new int[1000];
        int[] b = new int[1000];

        for (int i = 0; i < n ; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int temp = 0;
        ArrayList<Integer> hasil = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if(i == 0){
                temp = a[i] + b[i];
                //System.out.println("*");
                 
            }else{
               // System.out.println("#");
                temp = temp- a[i];
                temp = temp + b[i];
            }
            
          // System.out.print(temp + " "); 
          hasil.add(temp);
        }
        Collections.sort(hasil);
        System.out.println(hasil.get(hasil.size()-1));       
        
    }
    
}
