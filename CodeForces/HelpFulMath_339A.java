package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

import dayCal.Arraylist;

public class HelpFulMath_339A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] split = input.split("\\+");
        
        ArrayList<Integer> arrInt = new ArrayList<>();
        
        for (int i = 0; i < split.length; i++) {
            //System.out.print(split[i] + " ");
            arrInt.add(Integer.parseInt(split[i]));
        }
        for (int i = 0; i < split.length; i++) {
            for (int j = i+1; j < split.length; j++) {
                if(arrInt.get(i) > arrInt.get(j)){
                    int temp = arrInt.get(i);
                    arrInt.set(i, arrInt.get(j));
                    arrInt.set(j, temp);
                }
            }
        }
    
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrInt.size(); i++) {
            int num = arrInt.get(i);
            if(i==arrInt.size()-1){sb.append(num);}else{
                sb.append(num + "+");
            }
           

          
          }
        String converfromArr = sb.toString();
        System.out.println(converfromArr);
     
       
        


        
    }
}
