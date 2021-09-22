package dayCal;

import java.util.*;
import java.io.*;

public class HashMA{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String , String> phoneNumber = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneNumber.put(name, String.valueOf(phone));
        }
        //String[] testCase = new String[n];
        int i = 0;
        ArrayList<String> arrr = new ArrayList<>();
        
        for (int q = 0; q < n; q++) {
            String line = in.next();
            arrr.add(line);
        }
        while (in.hasNext()) {
            String line = in.next();
            arrr.add(line);
        }
        in.close();
        int test = 0;
        boolean check = false;
        for (int z = 0; z < arrr.size(); z++){
            if(phoneNumber.containsKey(arrr.get(z))){
                String val2=phoneNumber.get(arrr.get(z));
                System.out.println(arrr.get(z) + "=" +val2 );
           
            }else{
                System.out.println("Not found");
            }
        }
    }
}