package CodeForces;

import java.util.Scanner;

public class WrongSubtraction_977A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int k = input.nextInt();

        int count = 1;
        while (count != k+1 ) {
            String temp = Integer.toString(n);
            char test = temp.charAt(temp.length()-1);
            //System.out.println("asd");
            if(test == '0'){
                n = n/ 10;
               // System.out.println( "Last Digiti  " + n);
                count++;
                continue;   
            } 
            if(n %2 == 0 || n %2 == 1){
                n = n -1;
                //System.out.println( " Nilai " + n);
            }
            count++;
        }
        System.out.println(n);
        
    }
}