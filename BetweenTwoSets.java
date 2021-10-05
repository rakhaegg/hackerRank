import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
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

    public static int getTotalX(List<Integer> a  , List<Integer> b){

        ArrayList<Integer> arrA  = new ArrayList<>();

 
        
        for (int i = 1; i <= 100 ; i++) {
            boolean check  = false;
            for (int j = 0; j < a.size(); j++) {
                if(i % a.get(j) == 0 ){
                   // System.out.print(i + " ");
                    check = true;
                }else{
                    check = false;
                    break;
                }
            }
            boolean cheKedua = false;
            //System.out.println("----------------- ");
            for (int j = 0; j < b.size(); j++) {
                if( b.get(j) % i == 0 ){
                   
                    cheKedua = true;
                }else{
                    cheKedua = false;
                    break;
                }  
            }
            //System.out.println("----------------- ");
            if(cheKedua && check){
                arrA.add(i);
               
            }
        }
       
        
        return arrA.size();
    }
}