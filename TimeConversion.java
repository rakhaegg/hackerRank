

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;


public class TimeConversion {
    static InputStreamReader is = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(is);
    public static void main(String[] args) {
        
        String valInput = null;
        try {
            valInput = br.readLine();
            System.out.println(timeConversion(valInput));
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
    public static String timeConversion(String s){
        String typeTime = null;
        String cnvv = null;
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("01", "13");
        capitalCities.put("02", "14");
        capitalCities.put("03", "15");
        capitalCities.put("04", "16");
        capitalCities.put("05", "17");
        capitalCities.put("06", "18");
        capitalCities.put("07", "19");
        capitalCities.put("08", "20");
        capitalCities.put("09", "21");
        capitalCities.put("10", "22");
        capitalCities.put("11", "23");
        capitalCities.put("12", "12");
        String nnn = null;
        if(s.charAt(8) == 'P' ){
            typeTime = "PM";
            String[] first = s.split(":");
            nnn = first[0];
            String gantinya= null;
            for (Map.Entry<String, String> set :capitalCities.entrySet()) {
                if(nnn.equalsIgnoreCase(set.getKey())){
                    gantinya =  set.getValue();
                    break;
                }else{
                    continue;
                }
              }
            String acnvv = s.substring(0, s.length()-1  );
            String aacnvv = acnvv.substring(0, s.length()-2);
            cnvv = aacnvv.replaceFirst(nnn, gantinya);
        }else{
            String[] first = s.split(":");
            nnn = first[0];
            if(nnn.equalsIgnoreCase("12")){
                String zcnvv = s.replaceFirst("12", "00");
                cnvv = zcnvv.replaceAll("([A-M])", "");
            }else{
                cnvv = s.replaceAll("([A-M])", ""); 
            }   
        }
        return cnvv;
    }    
}
