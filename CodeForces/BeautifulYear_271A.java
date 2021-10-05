package CodeForces;

import java.util.Scanner;

public class BeautifulYear_271A {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int y = scan.nextInt();
  
        while (true) {
            y = y + 1;
            String ss = String.valueOf(y);
            char[] arr = ss.toCharArray();
            boolean check  = true;
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                   // System.out.println(arr[j2] + " " + arr[j]);
                    if(arr[j] == arr[j2]){
                        check = false;                        
                        break;
                    }
                }
            }   
            if(check){   
                System.out.println(y);
                break;
            }
        }
    

        
        /*
        int y = scan.nextInt();
        while (true) {
            y += 1;
            int a = y / 1000;
            int b = y / 100 % 10;
            int c = y / 10 % 10;
            int d = y % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d)
            {

                break;
            }
        }
        System.out.println(y);
        */
    }
}
