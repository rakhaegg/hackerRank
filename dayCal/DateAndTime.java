package dayCal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class DateAndTime {
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
        String monthS = split[0] ;
        String dayS = split[1];
        String yearS = split[2];

      
        int month = Integer.parseInt(monthS);
        int day = Integer.parseInt(dayS);
        int year = Integer.parseInt(yearS);

        
         System.out.println(findDay(month, day, year));
       
     

        //System.out.println("The Current Date is:" + c.getTime());
        

    }
    public static String findDay(int month , int day , int year){
        LocalDate nw = LocalDate.of(year, month ,day);
        //Calendar c  = Calendar.getInstance();
        //c.set(month, day , year);
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E");  
        String strDate = nw.format(format);  

        String  asd = null;
            if(strDate.equalsIgnoreCase("Mon")){
                asd="MONDAY";
            }
            if(strDate.equalsIgnoreCase("Tue")){
                asd="TUESDAY";
            }
            if(strDate.equalsIgnoreCase("Wed")){
                asd="WEDNESDAY";
            }
            if(strDate.equalsIgnoreCase("Thu")){
                asd="THURSDAY";
            }
            if(strDate.equalsIgnoreCase("Fri")){
                asd="FRIDAY";
            }
            if(strDate.equalsIgnoreCase("Sat")){
                asd="SATURDAY";
            }
            if(strDate.equalsIgnoreCase("Sun")){
                asd="SUNDAY";
            }
        

        return asd;
    }
}
