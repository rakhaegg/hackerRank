package CodeForces;

import java.util.Scanner;

public class WayTooLongWords_71A{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] arr = new String[n];
        int i = 0;

        while (i != n) {
            arr[i] = input.next(); 
            i++;
        }
    
        doSolve(arr, n);

    
    }
    static void doSolve(String[] arr , int n) {
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length() > 10){
                String baru = arr[i].substring(0,1) + String.valueOf(arr[i].length()-2) + arr[i].substring(arr[i].length()-1 ,arr[i].length() );
                arr[i] = baru;
            }
        }

        for (String string : arr) {
            System.out.println(string);
        }
    }

}