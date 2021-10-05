package dayCal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MoreExceptions {
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        
        for (int i = 0; i < t; i++) {
            try {
                int n = scan.nextInt();
                int p = scan.nextInt();

                if (n < 0 || p < 0){
                    example();
                }else{
                    int hasil =  (int) Math.pow(n, p);
                    System.out.println(hasil);
                }
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();

            }
        }
     
    }
    static void example() throws Exception{
        System.out.println("n and p should be non-negative");
    }
}
