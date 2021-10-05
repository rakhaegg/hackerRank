import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class salesMatch {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }
        System.out.println(sockMerchant(n, arr));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
    
        int count = 0;
        int change = -1;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i+1; j < ar.size(); j++) {
                if(ar.get(i) == ar.get(j)){
                   // ar.remove(i);
                    //ar.remove(j);
                    ar.set(i, change);
                    ar.set(j, change);
                    count++;
                    change = change - 1;
                    break;
                }
            }    
        }

        return count;
    
        }
}
