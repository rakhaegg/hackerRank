package dayCal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class DictionariesAndMap {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        int n = scan.nextInt();
        
        HashMap<String , String> phoneNumber = new HashMap<>();
        String line =null ;
        for (int i = 0; i < n; i++) {
            try {
                line = br.readLine();
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            String[] splitint = line.split(" ");
            phoneNumber.put(splitint[0], splitint[1]);
        }
        String[] testCase = new String[n];
        
        for (int i = 0; i < testCase.length; i++) {
            testCase[i] = scan.next();
        }
        for (int z = 0; z < testCase.length; z++){
            if(phoneNumber.containsKey(testCase[z])){
                String val2=phoneNumber.get(testCase[z]);
                System.out.println(testCase[z] + "=" +val2 );
           
            }else{
                System.out.println("Not found");
            }
        }
    
    }
}
