

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class TimeConversion {
    static InputStreamReader is = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(is);
    public static void main(String[] args) {
         
        try {
            String valInput = br.readLine();
            System.out.println(timeConversion(valInput));
        } catch (Exception e) {
            //TODO: handle exception
        }
      
    }
    public static String timeConversion(String s){
        
        

        char[] group1 = new char[2];
        char[] group2 = new char[2];
        char[] group3 = new char[2];

        String[] timeFormat = {"AM" , "PM"};
        String timee = null;
    

        for (int i = 0; i < s.length(); i++) {
            if(i == 0 && i == 1){
                group1[i] = s.charAt(i);
            }else if (i == 3 && i == 4){
                group2[i] = s.charAt(i);
            }else if (i == 6 && i == 7){
                group3[i] = s.charAt(i);
            }else if (i == 8 ){
                if((s.charAt(8) == 'P') && (s.charAt(9) == 'M')){
                    timee = "PM"; 
                }else{
                    timee = "AM";
                }
            }
        }
        if(timee == "PM"){
            for (int i = 0; i < group1.length; i++) {
             
            }
        }else if(timee == "AM"){

        }else{

        }
        


        return null ;
    }    
}
