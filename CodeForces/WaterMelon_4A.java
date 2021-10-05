package CodeForces;

import java.util.Scanner;

public class WaterMelon_4A {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String  result = "";
        boolean check = false;
        for (int i = 1; i <= n ; i++) {
            if(i % 2 == 0){
                int nilai = 1;
                while (nilai != n+1 ) {
                    if(nilai+i == n && nilai % 2 == 0){
                        check = true;
                        break;
                    }
                    nilai++;
                }
            }
        }
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
