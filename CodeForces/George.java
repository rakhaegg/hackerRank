package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class George {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> q = new ArrayList<>();



        for (int i = 0; i < n; i++) {
            p.add(scan.nextInt());
            q.add(scan.nextInt());    
           
        }
        System.out.println(doSolve(p , q));
        
    }
    static int doSolve(ArrayList<Integer> arr1  , ArrayList<Integer> arr2){
        int count = 0;
        int xx = 0;

        for (int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) == arr2.get(i)){
                continue;
            }
            if(arr1.get(i) < arr2.get(i) -1){
                count++;
                
            }
        }
    
        return count;
        


    }
}
