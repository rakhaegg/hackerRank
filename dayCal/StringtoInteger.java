package dayCal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringtoInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        
        String S = bufferedReader.readLine();
            
        try {
            int xx = Integer.parseInt(S);
            System.out.println(xx);
        } catch (Exception e) {
            //TODO: handle exception

            System.out.println("Bad String");

        }

        /*
        char[] xx = S.toCharArray();

        Boolean check = false;
        for (int i = 0; i < xx.length; i++) {
            if(xx[i] >= '0' && xx[i] <= '9'  ){
                check = true;
            }else{
                check = false;
                break;
            }
        }
        String test = new String(xx);
        if(check){
            System.out.println(test);
        }else{
            System.out.println("Bad Stirng");
        }

    
        */
        bufferedReader.close();

    }
}
