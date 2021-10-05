package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class GamerHouse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int H = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(scan.nextInt());

            }
            doSolve(arr, H);


        }
    }

    static void doSolve(ArrayList<Integer> arr , int H){
        int count = 0;
        /*
        for (int i = 1; i < arr.size()+1; i++) {
            ArrayList<Integer> arrx = new ArrayList<>();
            int mod = i % arr.size();
            for (int j = 0; j < arr.size(); j++) {
                arrx.add(arr.get((i + mod) % arr.size() )  );
            }
            int temp = 0;
            for (int x = 0; x < arrx.size(); x++) {
                if(x == 0){
                    temp = H - arr.get(x) ;
                }else{
                    temp = temp - arr.get(x);
                }
               
            }
            System.out.println(temp);
            if(temp <= 0){
                count++;
            }
            
        }
        */
        for (int i = 0; i < arr.size(); i++) {
            if( (H - arr.get(i) - arr.get(i+1) ) <= 0 ){
                count++;
                i++;
            }
            if( ( H - arr.get(i)) <= 0 ){
                count++;
            }
        }
        System.out.println(count);

    }
}


