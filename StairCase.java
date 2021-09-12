import java.util.*;

public class StairCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valStar = input.nextInt();
        staircase(valStar);
    }   
    public static void staircase(int n ){

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("#");
            }
            System.out.println("");
            
            
        }
    } 
}
