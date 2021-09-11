import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class simpleSumArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
    
        List<Integer> intarr = new ArrayList<>();
       
        int size = scanner.nextInt();
        int sszie = 0;
        while (sszie != size) {
            intarr.add(input = scanner.nextInt());
            sszie++;
        }


        System.out.println( simpleArraySum(intarr));
    }
    public static int simpleArraySum(List<Integer> ar){
  
        int i ;
        int result = 0 ;
        for (i = 0 ; i < ar.size(); i++) {
            
            result = result + ar.get(i);
        }
                
        return result;
        
    }
}