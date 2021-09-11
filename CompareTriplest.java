import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTriplest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int input;
        for (int i = 0; i < 3; i++) {
            a.add(input = scanner.nextInt());
          
        }
        for (int i = 0; i < 3; i++) {
         
            b.add(input = scanner.nextInt());
        }
        
        compareTriplets(a, b);
        String formattedString = compareTriplets(a , b).toString()
            .replace(",", "")  //remove the commas
            .replace("[", "")  //remove the right bracket
            .replace("]", "")  //remo1ve the left bracket
            .trim();   
        System.out.println(formattedString);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        List<Integer> result = new ArrayList<>();
        int scoreAlive= 0;
        int scoreBob = 0;
        
        for (int i = 0; i < 3; i++) {
            if(a.get(i) > b.get(i)){
                scoreAlive = scoreAlive + 1;
                
            }
            if(a.get(i) < b.get(i)){
                scoreBob = scoreBob + 1;
            }
        }
        result.add(0, scoreAlive);
        result.add(1 , scoreBob);
        return result;
        // Write your code here
    
        }  
}
