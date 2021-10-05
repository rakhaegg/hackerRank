import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntroTutorialCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int V = scan.nextInt();
        int n = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }
        System.out.println(introTutorial(V, arr));
    }
    public static int introTutorial(int V, List<Integer> arr) {
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(V == arr.get(i)){
                result = i;
                break;
            }
        }
        return result;
        // Write your code here
    
    }
}
