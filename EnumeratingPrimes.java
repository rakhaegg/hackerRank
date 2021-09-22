import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EnumeratingPrimes {
    public static void main(String[] args) {

        
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
        String line = null;
        try {
            line = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] split = line.split(" ");

        int n = Integer.parseInt(split[0]);
        
        for (Integer string : breakingRecords(n)) {
            System.out.print(string + " ");
        }
        
        //breakingRecords(n);
    }
    public static List<Integer> breakingRecords(int n){
        boolean check = false;
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> P = new ArrayList<>();


        P.add(2);
        for (int i = 3; i < n; i++) {
            if(i % 2 == 1){
                x.add(i);
            }
        }
        do {
            int p = x.get(0);
            
            if(p > Math.sqrt(n)){
                
                P.addAll(x);
                break;
            }else{
                P.add(p);
                
                for (int i = 0; i < x.size(); i++) {
                    if((x.get(i) % p == 0)){
                        x.remove(i);
                    }
                }
            }
        } while (!check);
        
       
        return P;
        
    }
}
