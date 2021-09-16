import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class TimeConversion1 {
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
    public static String timeConversion(String value){

        String timee = null;
        char[] val = { '0','1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'};
        String getTimeFirst = value.substring(0,2);
       
        int cgetTimeFirst = Integer.parseInt(getTimeFirst);
        String str = String.format("%02d", cgetTimeFirst);
        
        if(value.charAt(8) == 'P'){
            if(str.charAt(0) == 0){
                for (int i = 0; i < val.length; i++) {
                    if(str.charAt(1) == val[i]){
                        
                    }
                }
            }
           for (int i = 1 ; i < 12 ; i++) {
               
           }
        }
        return str;
    }
    

}
