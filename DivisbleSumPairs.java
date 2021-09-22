import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class DivisbleSumPairs {
    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
        String firstLine = null;
        String secondLine = null;
        try {
            firstLine = br.readLine();
            secondLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] spliting = firstLine.split(" ");
        int n = Integer.parseInt(spliting[0]);
        int k = Integer.parseInt(spliting[1]);

        String[] spliingSecLine = secondLine.split(" ");

        ArrayList<Integer> secondLineArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            secondLineArr.add(Integer.parseInt(spliingSecLine[i]));
        }
       System.out.println(divisbleSumPairs(n, k, secondLineArr));

        
        
        
    }
    public static int divisbleSumPairs(int n , int k , List<Integer> ar){
        int temp = 0;
        int count = 0;
        
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i; j < ar.size() ; j++) {
                if(i < j ){
                    temp = ar.get(i) + ar.get(j);
                    if(temp%k == 0){
                        count++;
                    }
                }                
            }
        }
        return count;
    }    
}
