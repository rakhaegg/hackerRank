package dayCal;
import java.io.*;
import java.util.*;

public class dataType {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
    

        String s1 = "HackerRank " ;
        int i = 4  ;
        double d =  4.0;
        
        int i2 = scan.nextInt(); 
        double d2 = scan.nextDouble();
        scan.nextLine();
        String s2 = scan.nextLine();
        
        System.out.println( i + i2); 
        System.out.println(d + d2);    
        System.out.println(s1 + s2);
     

    }
}
