package dayCal;

import java.util.*;
public class operators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meal_cost  = input.nextDouble();
        double tip_percent = input.nextInt();
        double tax_percent = input.nextInt();

        input.close();
        tip_percent = ((meal_cost/100.0) * tip_percent);
        tax_percent = ((tax_percent / 100.0) * meal_cost);
        
        System.out.println(Math.round(meal_cost + tip_percent + tax_percent));
    }
       
}
