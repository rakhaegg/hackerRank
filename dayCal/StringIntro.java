package dayCal;

import java.util.Arrays;
import java.util.Scanner;

public class StringIntro {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String plus = A + B ;
        System.out.println(plus.length());

        int get_val = A.compareTo(B);  


        if (get_val < 0) {  
           System.out.println("Yes");  
        }else {  
           System.out.println("No");  
        }

        String capatilizeA = A.substring(0 , 1).toUpperCase() + A.substring(1);
        String capatilizeB = B.substring(0 , 1).toUpperCase() + B.substring(1);
        
        System.out.printf("%s %s", capatilizeA , capatilizeB);  

    }
}
