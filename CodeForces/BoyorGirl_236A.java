package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class BoyorGirl_236A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        char[] arrS = s.toCharArray();

        int count = 0;
        ArrayList<Character> sample = new ArrayList<Character>();
        
        for (int i = 0; i < arrS.length; i++) {
           
            int zxc = 0;
            boolean check = true;
            if(sample.isEmpty()){sample.add(arrS[i]);}
            while (zxc != sample.size()) {
                if(sample.get(zxc) == arrS[i]){
                    check = false;
                    break;
                }
                zxc++;
            }
            if(check){sample.add(arrS[i]);}
            if(check){
                for (int j = i+1; j < arrS.length; j++) {
                    if(arrS[i] == arrS[j] ){

                        count++;
                    }
                }
            }            
        }
        int selesai = sample.size();
        /*
        System.out.println(count);
        System.out.println(selesai);
        for (Character character : sample) {
            System.out.print(character + " ");
        }
        */
        if(selesai % 2 ==0){
            System.out.println("CHAT WITH HER!");
        }
        if(selesai % 2 ==1){
            System.out.println("IGNORE HIM!");
        }
        
        
    }
}
