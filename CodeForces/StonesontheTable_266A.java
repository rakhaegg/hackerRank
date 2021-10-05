package CodeForces;

import java.util.Scanner;

public class StonesontheTable_266A {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        input.nextLine();
        String test = input.nextLine();

        char[] testChar = test.toCharArray();
    
        
        int count = 0;
        int testFirst = 0;
        int testSecond = 1;
        int hitung = 0;
        while (testSecond != testChar.length) {
            if(testChar[testFirst] == testChar[testSecond]){
                hitung++;
            }
            testFirst++;
            testSecond++;
            
            
        }

        System.out.println(hitung);
        
    }
}
