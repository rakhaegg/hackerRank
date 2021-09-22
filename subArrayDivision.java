import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class subArrayDivision {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        ArrayList<Integer> arr = new ArrayList<>();


        String firstLine = null , secondLine = null , thirdLine = null;

        try {
            firstLine = br.readLine();
            secondLine = br.readLine();
            thirdLine = br.readLine() ;
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitLine = firstLine.split(" ");
        String[] splitSecondLine = secondLine.split(" ");
        String[] splitThirdLine =  thirdLine.split(" ");

        int n = Integer.parseInt(splitLine[0]);

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(splitSecondLine[i]));
        }
        int d = Integer.parseInt(splitThirdLine[0]);
        int m = Integer.parseInt(splitThirdLine[1]);

        //System.out.println(birthday(arr , d , m));
        birthday(arr , d , m);
    } 
    public static void birthday(List<Integer> s, int d, int m) {
   
        
        int count = 0;
        if(s.size() == 1){
            count++;
        }else{
            for (int i = 0; i < s.size(); i++) {
                if(i == s.size()-1){break;}
                if(s.get(i) + s.get(i) == d){
                    //if()
                    if(count != m){
                        System.out.println("*");
                        count++;
                    }
                }
                
            }
        }
          
            //return count;
        } 
      
}
