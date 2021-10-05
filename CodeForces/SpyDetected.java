package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        

    
        ArrayList<Integer> hasil = new ArrayList<>();
        
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(scan.nextInt());
            }
            //System.out.println(resultt(arr));
            hasil.add(resultt(arr));
            
        }
        
        for (Integer integer : hasil) {
            System.out.println(integer);
        }
        
     
    }
    public static int resultt(List<Integer> arr ){
        
        int index = 0;
        int getVal = 0;
        int temp = 0;
     

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {  
                if(arr.get(i) == arr.get(j)){
                    temp = arr.get(i);
                    break;
                }
            }
            
        }
        for (int i = 0; i < arr.size(); i++) {
            if(temp != arr.get(i)){
                //System.out.println(temp + " " + arr.get(i));
                index = i +1;
                break;
            }
        }
       // System.out.println(index);
        return index;


      
    }
}
