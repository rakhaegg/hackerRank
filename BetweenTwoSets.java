import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BetweenTwoSets{
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        ArrayList<Integer> twoLineArr = new ArrayList<>();
        ArrayList<Integer> thirLineArr = new ArrayList<>();


        String firstLine =null , twoLine = null, thirLine = null;
        try {
            firstLine = br.readLine();
            twoLine = br.readLine();
            thirLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
        }
        String[] splitFirstLine = firstLine.split(" ");
        String[] splitSecondLine = twoLine.split(" ");
        String[] splitThirdLine = thirLine.split(" ");

        for (int i = 0; i < Integer.parseInt(splitFirstLine[0]); i++) {
            twoLineArr.add(Integer.parseInt(splitSecondLine[i]));
        }
      
        for (int i = 0; i < Integer.parseInt(splitFirstLine[1]); i++) {
            thirLineArr.add(Integer.parseInt(splitThirdLine[i]));
        }        

       
        getTotalX(twoLineArr, thirLineArr);
    }
    //1. find the LCM of all the integers of array A.
    //2. find the GCD of all the integers of array B.
    //3. Count the number of multiples of LCM that evenly divides the GCD.

    public static void getTotalX(List<Integer> a  , List<Integer> b){

        int[][] twoDem = new int[a.size()][100];
        int[] num = new int[a.size()];

        for (int i = 0; i < num.length; i++) {
            num[i] = a.get(i);
        }
        
        for (int i = 0; i < twoDem.length; i++) {
            for (int j = 1; j <= twoDem[i].length; j++) {
                int p = j * num[i]; 
                twoDem[i][j-1] = p;
            }
        }
        for (int i = 0; i < num.length; i++) {
            
        }
        for (int i = 0; i < twoDem.length; i++) {
            for (int j = 0; j < twoDem[i].length; j++) {
                if(twoDem[i][j] == twoDem[i+1][j]){
                 
                }
                 
            }
        }
    
        
     
        
        
        
        
        //return 0;
    }
}