package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class PetyaAndString_112A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String second = scan.nextLine();

        
        char[] sea = first.toCharArray();
        char[] fire = second.toCharArray();
        
        for (int i = 0; i < sea.length; i++) {
            sea[i] = Character.toLowerCase(sea[i]);
        }
        for (int i = 0; i < fire.length; i++) {
            fire[i] = Character.toLowerCase(fire[i]);
        }
        
        int count = 0;
        
        String selesai = "";
        while (count != sea.length) {
            if(sea[count] < fire[count]){
                selesai = "-1";
                break;
            }
            if(sea[count] > fire[count]){
                selesai = "1";
                break;
            }
            if(sea[count] == fire[count] && sea.length-1 == count){
                selesai = "0";
                break;
            }
            count++;
        }
        
    

        System.out.println(selesai);
       
    }
}
