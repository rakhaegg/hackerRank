package dayCal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class SubStringCompar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        /*
        ArrayList<String> arr = new ArrayList<>();
        int begin = 0;
        while ( k != s.length()+1)  {
            
            arr.add(s.substring(begin,k));
            k = k +1;
            begin = begin +1;
        }
        for (String string : arr) {
            System.out.print(string + " ");
        }
        */
     
        System.out.println(getSmallestAndLargest(s, k));
      
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        ArrayList<String> arr = new ArrayList<>();
        //int hitunga = 0;
        int begin = 0;
        
        while ( k != s.length()+1)  {
            
            arr.add(s.substring(begin,k));
            k = k +1;
            begin = begin +1;
        }
        /*
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i).compareToIgnoreCase(arr.get(j)) > 0){
                    System.out.println("*");
                    String temp = arr.get(i);
                    //String zx = arr.get(j);
                    arr.add(i, arr.get(j));
                    arr.add(j , temp);
                }
            }
        }
        */
        //Arrays.sort(arr , String.CASE_INSENSITIVE_ORDER);
        Collections.sort(arr);
        smallest = arr.get(0);
        largest = arr.get(arr.size()-1);

        return smallest + "\n" + largest;
    }
}
