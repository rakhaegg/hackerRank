package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class ProBending{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();

        ArrayList<Integer> level =  new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            level.add(scan.nextInt());
        }
        String result = " ";

        for (int i = 0; i < level.size(); i++) {
            if(level.get(i) > k){
                
                result = "Difficult Loss";
                break;
            }
            if(level.get(i) < k){
                result = "Easy Win!";
            }
        }
        System.out.println(result);
    }
}