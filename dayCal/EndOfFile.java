package dayCal;

import java.util.Scanner;

public class EndOfFile {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = null;
        int i = 1;
        while (scan.hasNext()) {
            line  = scan.nextLine();
            System.out.printf("%d %s\n" , i , line );
            i++;
        }

    }
}
