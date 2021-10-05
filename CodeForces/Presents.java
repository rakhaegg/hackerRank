package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());

        }
     
        for (Integer integer : doSolve(arr)) {
            System.out.print(integer + " ");
        }

    }
    static ArrayList<Integer> doSolve(ArrayList<Integer> arr){
        int xx = 0;
        ArrayList<Integer>solve = new ArrayList<>();
        for (int i = 1; i <= arr.size(); i++) {
            while (xx != arr.size() ) {
                //System.out.println(i  + " " + xx);
                if(i == arr.get(xx)){
                    //System.out.print("xx");
                    solve.add(xx+1);
                    xx=0;
                    break;
                }
                xx++;
            }
        }
        return solve;
       
    }
}
