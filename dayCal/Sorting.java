package dayCal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j , temp);
                    count++;
                }
            }
        }
      
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + arr.get(0) );
        System.out.println("Last Element: " + arr.get(arr.size()-1));
    }
}