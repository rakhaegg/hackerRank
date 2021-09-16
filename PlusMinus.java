import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        
        int[] arr = new int[val];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int zero = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i] > 0){
                positive++;
            }
            if(arr[i] < 0){
                negative++;
            }
            
        }
        int x = 1  ;
        for (int i = 1; i < 100; i++) {
            if(val == i){
                break;
            }else{
                x++;
            }
        }
        x = x + 1; 
        String as = "%.";
        String zxc = as.concat(String.valueOf(x));
        String sad = zxc.concat("f");
  
        
        String strZero = String.format(sad, Double.valueOf(zero) / val); 
        System.out.println(strZero);
        String strPositive = String.format(sad, Double.valueOf(positive) / val); 
        System.out.println(strPositive);
        String strNegative = String.format(sad, Double.valueOf(negative) / val); 
        System.out.println(strNegative);


       
    }    
}
