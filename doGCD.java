import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class doGCD {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
        ArrayList<Integer> arr = new ArrayList<>();


        String fistLine = null , secondLIne = null;

        try {
            fistLine = br.readLine();
            secondLIne = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitLine = fistLine.split(" ");
        String[] splitSecondLIne = secondLIne.split(" ");
        
        int n = Integer.parseInt(splitLine[0]);
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(splitSecondLIne[i]));
        }
        System.out.println(doGCD(arr));

    }  
    public static int doGCD(List<Integer> arr){
        int n = arr.size();

        int firstValue = arr.get(0);
        int secondValue = arr.get(1);
        int a = firstValue, b = secondValue  , q = 0 , r = 0;

        while (!(a % b == 0)) {
             for (int i = 1; i < 100 ; i++) {
                 r = a - (b * i);
                 if( r < b){
                     q = i;
                     break;
                 }
             }
             a = b;
             b =r;
        }
        return b;
        
    }
    
}
