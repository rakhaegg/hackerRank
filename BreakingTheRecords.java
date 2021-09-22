import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        ArrayList<Integer> val = new ArrayList<>();

        String firstLine = null;
        String secondLine = null;
        try {
            firstLine = br.readLine();
            secondLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int n = Integer.parseInt(firstLine);
        String[] splittingSecondLine = secondLine.split(" ");
        for (int i = 0; i < n; i++) {
            val.add(Integer.parseInt(splittingSecondLine[i]));
        }
        

        for (Integer string : breakingRecords(val)) {
            System.out.println(string);
        }
    }   
    
    public static List<Integer> breakingRecords(List<Integer> scores){
        ArrayList<Integer> hg = new ArrayList<>();
        int countHG = 0;
        int countLG = 0;
        int tmp = 0;
        int record = 0;
        int kecil = 0;
        
        for (int i = 0; i < scores.size(); i++) {
            
            if(i != 0){
                
                if(scores.get(i) > record && record != scores.get(i) ){
                    countHG++;
                    //tmp = scores.get(i);
                    record = scores.get(i);
              
                }else if(scores.get(i) < kecil && scores.get(i) != kecil){
                    countLG++;
                    //tmp = scores.get(i);
                    kecil = scores.get(i);
                   
                }
                
            }else{
                tmp = scores.get(i);
                kecil = scores.get(i);
                record = scores.get(i);
            }
        }
        ArrayList<Integer> backk = new ArrayList<>();
        backk.add(countHG);
        backk.add(countLG);

        return backk;
    } 
}
