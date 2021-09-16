

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BirthCake_arraylList {
    
    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<Integer>();

        InputStreamReader r =new InputStreamReader(System.in);    
        BufferedReader br =new BufferedReader(r);  

        
        int length_of_cake = 0;
        try {
             length_of_cake = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            //TODO: handle exception
        }
        try {
            val.add(Integer.parseInt(br.readLine()));
        } catch (Exception e) {
                //TODO: handle exception
        }
          

    }

}
    

