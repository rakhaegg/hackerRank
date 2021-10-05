package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;


public class DominiPilling_50A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();
        
        int[][] arr = new int[m][n];
        ArrayList<Integer> sizee = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i].length % 2 == 1 &&  j == arr[i].length-1 /*&& i != arr.length-1*/){
                    if(arr.length-1 == i &&  m % 2 ==1 ){
                 //       System.out.print("2" + " ");
                        sizee.add(2);
                    }else{
               //         System.out.print("0" + " ");
                        sizee.add(0);
                    }
                
                }else{
                    /*
                    if(arr[i].length % 2 == 1 && i == arr.length-1  && j == arr[i].length-1 ){
                        System.out.print("2" + " ");
                        sizee.add(2);
                    }else{
                        
                    } */  
             //       System.out.print("1" + " ");
                    sizee.add(1);   
                }    
            }
           // System.out.println("Selesai ");
        }
        int count = 0;
        for (int j = 0; j < sizee.size(); j++) {
            if(sizee.get(j) == 1 ||sizee.get(j) == 0 ){
                count++;
            }
        }
        System.out.println(count/2);
      
    }
}
