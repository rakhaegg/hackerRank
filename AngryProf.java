import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      //  int t = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt(); 
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());    
        }
        System.out.println(angryProfessor(k , arr));
        //angryProfessor(k, arr);
            
    }  
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int late = 0;
        int ontime = 0;
        String asd = null;
        boolean check = false;
        for (int i = 0; i < a.size(); i++) {
         
            if(k <= ontime){
               // System.out.println("*");
                //System.out.println(ontime);
                check = true;
                break;
            }
            if(a.get(i) <= 0){
                ontime ++;
            }
            if(a.get(i) >0 ){
                late ++;
            }
        }
    
        if(check){
            asd = "NO"; 
        }else{
            asd = "YES";
        }
      
        //System.out.println(asd);
        return asd;
        
    }  
}
