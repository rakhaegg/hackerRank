package dayCal;

import java.util.ArrayList;
import java.util.Scanner;

public class letsRevieww {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(scan.next());   
        }
       

        for (int i = 0; i < arr.size(); i++) {
            String odd = "" , even = "";
            String word= arr.get(i);
            for (int j = 0; j < word.length(); j++) {
                if(j % 2 == 0 || j == 0){
                     even = even + word.charAt(j);
                }else{
                     odd = odd + word.charAt(j);    
                }
            }
            System.out.println(even + " " + odd);
            
        }
        
    }   
}
