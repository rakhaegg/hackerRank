import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class migratioBirds {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bs = new BufferedReader(is);
        ArrayList<Integer> arr = new ArrayList<>();


        String firstLine = null;
        String secondLine = null;

        try {
            firstLine = bs.readLine();
            secondLine = bs.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitFirstLine = firstLine.split(" ");
        int n = Integer.parseInt(splitFirstLine[0]);
        String[] spitSecondLine = secondLine.split(" ");

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(spitSecondLine[i]));
        }
       
        System.out.println( migratoryBirds(arr));

    }
    public static int migratoryBirds(List<Integer> arr) {
        
        // Write your code here
        int[] type = {1 , 2, 3, 4, 5};
        int[] countin = { 0 , 0 , 0 , 0 , 0};


        for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i) == type[0]){
 
                    int temp = countin[0];
                    countin[0] = temp+1;
                }else if(arr.get(i) == type[1]){
                   
                    int temp = countin[1];
                    countin[1] = temp+1;
                }else if(arr.get(i) == type[2]){
               
                    int temp = countin[2];
                    countin[2] = temp+1;
                }else if(arr.get(i) == type[3]){
                
                    int temp = countin[3];
                    countin[3] = temp+1;
                }else if(arr.get(i) == type[4]){
                  
                    int temp = countin[4];
                    countin[4] = temp+1;
                }
        }
        int tipe = 0;

        for (int i = 0; i < countin.length; i++) {
            for (int k = 1; k < countin.length; k++) {
                if(countin[i] < countin[k]){
                    tipe = type[k+1];
                    break;
                }else if(countin[i] == countin[k]){
                    tipe = type[k+1];
                    break;
                }
            }
        }
        return tipe;
    }   
}
