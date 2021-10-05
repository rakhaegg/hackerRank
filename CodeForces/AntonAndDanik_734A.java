package CodeForces;

import java.util.Scanner;

public class AntonAndDanik_734A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();

        char[] arr = s.toCharArray();
        int countDani = 0;
        int countAnton = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]  == 'D'){
                countDani++;
            }
            if(arr[i] == 'A'){
                countAnton++;
            }
        }
        if(countDani > countAnton){
            System.out.println("Danik");
        }
        if(countAnton > countDani){
            System.out.println("Anton");
        }
        if(countAnton == countDani){
            System.out.println("Friendship");
        }
    }
}
