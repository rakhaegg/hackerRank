import java.util.Scanner;

public class DayOfThePro {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int x = input.nextInt();

     System.out.println(dayOfProgrammer(x));

 }   

 public static String dayOfProgrammer(int year) {
    // Write your code here
        int[] mont = {31 , 28 , 31 , 30 , 31 , 30, 31 , 31 , 30 ,31 , 30 , 31};
        String xx= "";
        int temp =0;
        int backk = 0;
        if(year >= 1700 && year <= 1917){
            xx ="Julian";
        }
        if(year>= 1919 && year <= 2709){
            xx ="Georgian";
        }
        if(year == 1918){
            int ganti = 15;
            for (int i = 0; i < 8; i++) {
                if(i==1){
                    temp = temp + ganti;
                }else{
                    temp = temp + mont[i];
                }
            }
            backk = 256 - temp;
        }
      
        
        if(xx.equalsIgnoreCase("Julian")){
            if(year % 4 == 0){
                //int temp =0;
                int kabisat = 29;
                for (int i = 0; i < 8; i++) {
                    if(i==1){
                        temp = temp + kabisat;
                    }else{
                        temp = temp + mont[i];
                    }
                }
                backk = 256 - temp;

            }else{
               // int temp =0;
                int kabisat = 29;
                for (int i = 0; i < 8; i++) {
                    temp = temp + mont[i];
                    
                }
                backk = 256 - temp;
            }
        }
        
        if(xx.equalsIgnoreCase("Georgian")){
            if(year % 400 == 0 || (year%4 == 0 && !(year % 100 ==0))){
                
                int kabisat = 29;
                for (int i = 0; i < 8; i++) {
                    if(i==1){
                        temp = temp + kabisat;
                    }else{
                        temp = temp + mont[i];
                    }
                }
                backk = 256 - temp;
            }else{
                //int temp =0;
                int kabisat = 29;
                for (int i = 0; i < 8; i++) {
                     temp = temp + mont[i];
                    
                }
                backk = 256 - temp;
            }
            
        }
        
        String selesai = String.valueOf(backk) + "." + "09" +"."+String.valueOf(year);
        
        return selesai;    
    }
}
