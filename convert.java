import java.math.BigDecimal;
import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        
        String re = null;


        if((BigDecimal.valueOf(x).scale() > 2)){
            //BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
            double roundOff = Math.round(x * 100.0) / 100.0;
            //DecimalFormat f = new DecimalFormat("#.##");
            //double newInput =
            re = String.valueOf(roundOff);
        }else {
            re = String.valueOf(x);
         }
         System.out.println(re);
    }
}
