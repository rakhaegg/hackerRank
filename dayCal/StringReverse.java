package dayCal;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        //String A = "Java";
        //System.out.println(hasil(A));
        hasil(A);
    }

    public static void hasil(String s){
        int nilaiTengah = s.length() / 2;
        int asd = s.length() -1;
    
        String xxx = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < nilaiTengah ; i++) {
     
            char temp = chars[i];
            chars[i] = chars[i+asd];
            chars[i+asd] = temp; 

            asd = asd - 2 ;
        }
        String xx = new String(chars);
        System.out.println(xx);
        //if(s.equalsIgnoreCase(String.valueOf(chars)) ){return "Yes";}else{return "No";}
    }
}
