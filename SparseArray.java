

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SparseArray {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<String> nnn = new ArrayList<>();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            nnn.add(scan.nextLine());
        }
        

        int q = scan.nextInt();
        ArrayList<String> qqq = new ArrayList<>();
        scan.nextLine();
        for (int i = 0; i < q; i++) {
            qqq.add(scan.nextLine());
        }
        matchingStrings(nnn, qqq);

    }
    public static void matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        ArrayList<Integer> hitung = new ArrayList<>();
      
        for (int j = 0; j < queries.size(); j++) {
            int count = 0;
            for (int i = 0; i < strings.size(); i++) {
                if(strings.get(i).equalsIgnoreCase(queries.get(j))){
                    count++;
                }
            }
            hitung.add(count);
        }
        for (Integer integer : hitung) {
            System.out.print(integer + " ");
        }
        //return null;

    }
}
