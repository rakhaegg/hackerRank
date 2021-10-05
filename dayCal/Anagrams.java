package dayCal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Anagrams {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a.toLowerCase(), b.toLowerCase());
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
      
      
        
    

    }
    static boolean isAnagram(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        
        
        
        
        Arrays.sort(charA);
        Arrays.sort(charB);
       
        
        int condition = 0;
        boolean check = true;
        while (condition != charA.length) {
            if(charA.length != charB.length){check = false; break;}
            if(charA[condition]== charB[condition]){
                check = true;
            }else{
                check = false;
                break;
            }
            condition++;
        }
        return check;
    }

}
