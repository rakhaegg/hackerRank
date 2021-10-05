package CodeForces;

import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        char[] conve = s.toCharArray();

        int countUppercase = 0;
        int countLowerCae = 0;

        for (int i = 0; i < conve.length; i++) {
            if(Character.isUpperCase(conve[i])){
               countUppercase++;
               //System.out.println("BIG");
            }
            if(Character.isLowerCase(conve[i])){
                countLowerCae++;
             //   System.out.println("KECIL");
            }
        }
       // System.out.println(countLowerCae + " " + countUppercase);
        if(countLowerCae> countUppercase || countLowerCae == countUppercase){
          
            for (int i = 0; i < conve.length; i++) {
                if(Character.isUpperCase(conve[i])){
                   char c = Character.toLowerCase(conve[i]);
                   conve[i] = c;
                }
                
            }
        }
        if(countLowerCae < countUppercase){
            //System.out.println("HERE");
            for (int i = 0; i < conve.length; i++) {
                if(Character.isLowerCase(conve[i])){
                   char c = Character.toUpperCase(conve[i]);
                   conve[i] = c;
                }
                
            }
        }

        System.out.println(String.valueOf(conve));

        
    }
}
