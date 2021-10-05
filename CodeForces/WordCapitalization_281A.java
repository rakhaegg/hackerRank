package CodeForces;

import java.util.Scanner;

public class WordCapitalization_281A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String test = scan.nextLine();

        char[] arr = test.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if(Character.isLowerCase(arr[0])){
                arr[i] = Character.toUpperCase(arr[i]);
                break;
            }
        }
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        String selesai =  sb.toString();

        System.out.println(selesai);
        

        
    }
}
