package dayCal;

import java.util.*;
public class contidtional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();
        scan.close();
        if(val % 2  == 0 && (val >= 2 && val <= 5)){
            System.out.println("Not Weird");
        }else if(val % 2  == 0 && (val >= 6 && val <= 20 )){
            System.out.println("Weird");
        }else if(val % 2  == 0 && (val > 20)){
            System.out.println("Not Weird");
        }else if (val % 2 == 1 ){
            System.out.println("Weird");
        }
        

    }
}
