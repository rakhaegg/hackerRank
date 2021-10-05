package CodeForces;

import java.util.Scanner;

public class OseyeSort{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        char x = scan.next().charAt(0);

        if(x == 'a'){
            int i = 1;
            while ( i <= n ) {
                System.out.print(i + " ");
                i++;
            }
        }
        if(x == 'd'){
            int i = n;
            while (i >= 1) {
                System.out.print(i + " ");
                i--;
            }
        }
    }
}