package dayCal;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;



public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale currentUS = Locale.US;
        Locale currentIndia = new Locale("en", "IN");
        Locale currentFrance = Locale.FRANCE;
        Locale currentChina = Locale.CHINA;


        //Currency formatt = Currency.getInstance(current);

        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(currentUS);
        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(currentIndia);
        NumberFormat formatterFrance = NumberFormat.getCurrencyInstance(currentFrance);
        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(currentChina);
        
        // Write your code here.
        
        System.out.println("US: " + formatterUS.format(payment));
        System.out.println("India: " + formatterIndia.format(payment));
        System.out.println("China: " + formatterChina.format(payment));
        System.out.println("France: " + formatterFrance.format(payment));
    }
}
