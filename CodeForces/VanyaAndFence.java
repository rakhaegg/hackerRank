package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

import dayCal.Array;
import dayCal.Arraylist;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int n = scan.nextInt();
        int h = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());    
        }
        int count =0;
        for (int i = 0; i < arr.size(); i++) {
            if(h < arr.get(i)){
                count = count + 2;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}