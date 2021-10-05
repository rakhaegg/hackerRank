import java.util.ArrayList;
import java.util.Scanner;

import dayCal.Array;

public class CountingValleys {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int steps = scan.nextInt();
        scan.nextLine();
        String path = scan.nextLine();

        //System.out.println(countingValleys(steps , path));
        /*
        for (Integer string : countingValleys(steps, path)) {
            System.out.print (string + " ");
        }
        */
        System.out.println(countingValleys(steps , path));

    }
    public static int countingValleys(int steps, String path) {
        // Write your code here
        
        char[] zx = path.toCharArray();
        
        ArrayList<Integer> arr = new ArrayList<>();

        int up = 0; int down = 0 ;
        
        for (int i = 0; i < steps; i++) {
            if(zx[i] == 'U'){
                up++;
                arr.add(up);
            }  
            if(zx[i] == 'D'){
                up--;
                arr.add(up);
            }

        }
        int temp = 0;
        boolean check0 = false;
        
        /*
        for (Integer integer : arr) {
            System.out.print(integer + " ");   
        }
        */
        
        
        boolean negatif = false;
        boolean start = false;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < 0){
                negatif = true;
                //System.out.println(" Negatif " + i + " nilai " + arr.get(i));
            
            }
            if(arr.get(i) == 0){
                start = true;
                //System.out.println(" Nol " + i + " nilai " + arr.get(i));
            }
            if(start && negatif){
                check0 = true;
               // System.out.println(" * " + i);
               // System.out.println(" index start " + i + " nilai " + arr.get(i));
                   
            }   
            if(arr.get(i) == 0 && check0  ){
               
                temp++;
               // System.out.println(" index end " + i + " nilai " + arr.get(i));
                check0=false;
                start = false;
                negatif = false;
                //System.out.println(" # ");
                continue;
            }         
        }
        
        //System.out.println(temp);
        return temp;
    }
    
}
