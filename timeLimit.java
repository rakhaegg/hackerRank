import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timeLimit {
    public static void main(String[] args) {
         
 
        BufferedReader br =new BufferedReader((new InputStreamReader(System.in)));  

        boolean checkVal = false;
        int val = 0;
        
        try {
            val = Integer.parseInt(br.readLine());
            if(val >= 1 && val <= Math.pow(10, 5)){
                checkVal = true;
            }else{
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
            checkVal = true;
           
        System.out.println(val);
    }
}
    
