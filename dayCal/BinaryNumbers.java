package dayCal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinaryNumbers {
    
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
        //ArrayList<Integer> arr = new ArrayList<>();
        /*
        String conver = "";
        while (!(n==0)) {
           
            if(n % 2 == 0){
                conver = conver + 0;
                n = n / 2;
            }else{
                conver = conver + 1;
                n = n / 2;
                
            }
        }
        */
        
       String nasd = converBinary(n);
       System.out.println(nasd);
       String reverserDone = reverse(nasd);
       System.out.println(reverserDone);
       int count = 0;
       ArrayList<Integer> asdas = new ArrayList<>();
       for (int i = 0; i < reverserDone.length(); i++) {
           if(reverserDone.charAt(i) == '1' && i ==reverserDone.length()-1){  
                count++;
                asdas.add(count);
           }else if(reverserDone.charAt(i) == '1') {
                //System.out.println("Masuk 0");
                count++;
           }else{
                asdas.add(count);
                count =0 ;
           }
       }
       Collections.sort(asdas);  
     
       System.out.println(asdas.get(asdas.size()-1));
    }
    static String converBinary(int n){
        if(!(n==0)){
            if(n % 2 == 0){
                n = n / 2;
                return "0" + converBinary(n) ;
            
            }else{
                n = n / 2;
                return "1" + converBinary(n) ;
            }
        }else{
            return "";
        }
    }
    static String reverse(String s){
        byte[] strAsByteArray = s.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++){
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        }
        return new String(result);
    }
    
    
}
