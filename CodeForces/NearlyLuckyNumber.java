package CodeForces;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();

        String nn = String.valueOf(n);

        char[] data = nn.toCharArray();
     
        /*
        for (int i = 0; i < lengthData.length; i++) {
            if(lengthData[i] == '7' || lengthData[i] == '4'){
                checker = true;
            }else{
                checker = false;
                break;
            }
        }
        */
    
        int count = 0;
        for (int i = 0; i < data.length; i++) {

                if(data[i]== '4' || data[i] == '7'){
                    count++;
                }
           
        }
        if(count== 4 || count == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
