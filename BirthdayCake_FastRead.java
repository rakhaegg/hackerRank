import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BirthdayCake_FastRead {
    public static void main(String[] args) {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
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
        int[] valArr = new int[val];
        String nilai  = null;
        if(checkVal){
                try {
                    nilai = br.readLine();
                }  catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            String[] hehe = nilai.split(" ");
            for (int i = 0; i < valArr.length; i++) {
                valArr[i]  = Integer.parseInt(hehe[i]);
            }
            int temp;
            for (int i = 0; i < valArr.length; i++) {
                for (int j = i+1 ; j < valArr.length; j++) {
                        if(valArr[i] > valArr[j]){
                            temp = valArr[i];
                            valArr[i] = valArr[j];
                            valArr[j] = temp;
                        }
                    }
                }
            
            int count = 0 ;
            
            int lasindex = valArr[valArr.length-1];
            for (int i = 0; i < valArr.length; i++) {
                if(lasindex == valArr[i]){
                    count++;
                }
            }
     
        System.out.println(count);
   
    
        
    }    
}
