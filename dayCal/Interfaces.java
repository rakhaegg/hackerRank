package dayCal;

import java.util.Scanner;
interface AdvancedAritmetic{
    int divisorSum(int n);
}
public class Interfaces {
    static class Calculator implements AdvancedAritmetic{

        @Override
        public int divisorSum(int n) {
            // TODO Auto-generated method stub
            int xx = 0;
            for (int i = 1; i <= n; i++) {
                if(n % i == 0){
                    xx = xx + i;
                }
            }

            return xx;
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        AdvancedAritmetic cal = new Calculator();
        int sum = cal.divisorSum(n);
        System.out.println("I implemented: " + cal.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);

        
    }
}
