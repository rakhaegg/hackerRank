package dayCal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Recursion {
    
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
        String line = null;
        try {
            line = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] split = line.split(" ");
        int n = Integer.parseInt(split[0]);

        System.out.println(factorial(n));
    }
    public static int factorial(int n){

        if(n ==1 ){
            return n;
        }else{
            return n * factorial(n-1);
        }
       

    }
}
