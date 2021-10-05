package CodeForces;

import java.util.Scanner;

public class Translataion_41A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
       // scan.nextLine();
        String t = scan.nextLine();

        int nilaitengah = s.length() /2;
        int asd = s.length()-1;

        char[] arr= s.toCharArray();

        for (int i = 0; i < nilaitengah; i++) {
            char temp = arr[i];
            arr[i] = arr[i+asd];
            arr[i+asd] = temp;
            asd = asd -2;
        }
        String ss = new String(arr);
        if(ss.equalsIgnoreCase(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
