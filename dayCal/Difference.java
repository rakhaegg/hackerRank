package dayCal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Difference {
    int[] __elements;
    int maximumDifference = 0;

    Difference(int[] __elements){
        this.__elements = __elements;
        maximumDifference = computeDifference();
    }
    int computeDifference(){
        int temp = 0;
        ArrayList<Integer> arr  = new ArrayList<>();

        //System.out.println(__elements.length);
        for (int i = 0; i < __elements.length; i++) {
            for (int j = i; j < __elements.length; j++) {
                if(__elements[i] > __elements[j]){
                    arr.add(__elements[i] - __elements[j]);
                }else{
                    arr.add(__elements[j] - __elements[i]);
                }
            }
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }

public class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();
    
            Difference difference = new Difference(a);
    
            difference.computeDifference();
    
            System.out.print(difference.maximumDifference);
        }
    }
}