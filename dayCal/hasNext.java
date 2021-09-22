package dayCal;

import java.util.Scanner;

public class hasNext{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s=" ";
        s= scan.nextLine();
        s+=scan.nextLine();
       
        scan.close();
        // Write your code here.
        /*
        while (scan.hasNext()) {
            s =  s + scan.next() + " ";
       }
       */
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}