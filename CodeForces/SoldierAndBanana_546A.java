package CodeForces;

import java.util.Scanner;

public class SoldierAndBanana_546A {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int k = input.nextInt();
        int n  = input.nextInt();
        int w = input.nextInt();
        
        int total = 0;
        for (int i = 1; i <= w; i++) {
            total = total + (i*k);
        }
        if(n == total && n>total){
            System.out.print(total);
        }else{
            total = total -n;
            System.out.println(total);
        }
    
    }
}
