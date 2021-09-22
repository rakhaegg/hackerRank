package dayCal;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            String s1 ="python" ; int x = 50;
            /*
            for(int i=0;i<3;i++)
            {
                 s1=sc.next();
                 x=sc.nextInt();
                //Complete this line
                
            }
            */
            System.out.println("================================");
            System.out.printf("%-15s%03d%n" , s1 , x);
           
    }
}
