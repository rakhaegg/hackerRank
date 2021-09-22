import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BirthdayCake {
    public static void main(String[] args) {

        InputStreamReader r =new InputStreamReader(System.in);    
        BufferedReader br =new BufferedReader(r);  
        ArrayList<Integer> arr = new ArrayList<>();

        String firsLine = null , secondLine = null;

        try {
            firsLine = br.readLine();
            secondLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitFirstLine = firsLine.split(" ");
        String[] spltsecondlIne = secondLine.split(" ");
        
        for (int i = 0; i < Integer.parseInt(splitFirstLine[0]); i++) {
            arr.add(Integer.parseInt(spltsecondlIne[i]));
        }
 
        System.out.println(birthdatCakeCandles(arr));

    }   
    public static int birthdatCakeCandles(List<Integer> canles){
       
        Collections.sort(canles);
        int temp = canles.get(canles.size()-1);
        int count = 0;
        for (int i =  canles.size() -1; i >= 0; i--) {
            if(canles.get(i) == temp ){
                count++;
            }else{break;}
        }
        return count;
    } 

}
