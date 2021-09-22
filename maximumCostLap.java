import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class maximumCostLap {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> cost= new ArrayList();
        ArrayList<String> labels= new ArrayList();
        
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int input=scan.nextInt();
            cost.add(input);
        }
        String line = null;
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            //String input=scan.nextLine();
            labels.add(line);
        }
        int dailyCount = scan.nextInt();
        //System.out.println(maxCost(cost, labels , dailyCount));
         maxCost(cost, labels , dailyCount);
    }   
    public static void maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
        
        

        int legal = 0;
        int illegal = 0;
        int selesai = 0;
        for (int i = 0; i < cost.size(); i++) {
                if(labels.get(i).equalsIgnoreCase("legal")){
                    legal = legal + cost.get(i); 
                    System.out.println("*");     
            }else{
                illegal = illegal + cost.get(i);
                System.out.println("#");    
            }
        }
        System.out.println(illegal);
        if(illegal < legal){
             selesai = legal - illegal;
        }else if(illegal > legal){
             selesai = illegal - legal;
        }else{
            
        }
      
        

        //return selesai;
    } 
}
