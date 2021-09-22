import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberLineJumps {
    public static void main(String[] args) {
        
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(is);

        String inputLine = null;
        try {
            inputLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
        }
        String[] firstLine = inputLine.split(" ");
        int x1 = Integer.parseInt(firstLine[0]);
        int v1 = Integer.parseInt(firstLine[1]);
        int x2 = Integer.parseInt(firstLine[2]);
        int v2 = Integer.parseInt(firstLine[3]);
        
      
        //System.out.println( kangaroo(x1, v1, x2, v2));
         kangaroo(x1, v1, x2, v2);


    }   
    public static void kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

            int a = x1;
            int b = x2;
            String end = null;
            while (x1 <= 100000000 && x2 <= 100000000) {
                
                
                if(x1 == x2){
                    end = "YES";
                    break;
                }else{
                    end = "NO";
                }
                
                System.out.println(x1 + " " + x2);
                System.out.println();
                x1 = x1 + v1;
                x2 = x2 + v2;
                
        } 
        System.out.println(end);
        //return end;
    }
}
