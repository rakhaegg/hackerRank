import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String firstLine = null;
        String secondLine = null;
        String thirdLine = null;

        ArrayList<Integer> third = new ArrayList<>();

        try {
            firstLine = br.readLine();
            secondLine = br.readLine();
            thirdLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitFirst = firstLine.split(" ");
        int n = Integer.parseInt(splitFirst[0]);
        int k = Integer.parseInt(splitFirst[1]);

        String[] splitSecond = secondLine.split(" ");

        for (int i = 0; i < n ; i++) {
            third.add(Integer.parseInt(splitSecond[i]));
        }
        
        String[] splitThir = thirdLine.split(" ");
        int b = Integer.parseInt(splitThir[0]);

        bonAppetit(third, k, b);
        
        
    }    
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here


    
        }
}
