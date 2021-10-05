import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }
        permutationEquation(arr);
    }    
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        ArrayList<Integer> arr = new ArrayList<>();
        int x =1;
        while (x != p.size()+1) {
            for (int i = 1; i <= p.size(); i++) {
             
                if(x == p.get(i-1)){
                    System.out.println(i);
                    int cari = i;
                    for (int j = 1; j <= p.size(); j++) {
                        if(cari == p.get(j-1)){
                        
                            arr.add(j);
                            break;
                        }
                    }
                    break;
                }
            }
            x++;   
            
        }
        return arr;
    }
}
