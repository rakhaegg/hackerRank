package CodeForces;

import java.util.Scanner;

public class BeautifulMatrix_263A {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLine();
        }

        int[][] arrS = new int[5][5];

        for (int i = 0; i < 5; i++) {
            String[] xx = arr[i].split(" ");
            for (int j = 0; j < xx.length; j++) {
                arrS[i][j] = Integer.parseInt(xx[j]); 
            }
        }
        int count = 0;
        boolean ketemu = false;
        for (int i = 0; i < arrS.length; i++) {
            for (int j = 0; j < arrS[i].length; j++) {
                if(arrS[i][j] == 1){
                    if(i == 2 && j == 2){count = 0;}else{
                        int x = i;
                        while ( x != 2) {
                            if(x < 2){
                                x = x+1;
                                count++; 
                            } 
                            if(x >  2){
                                x  = x -1 ;
                                count++; 
                            }
                          
                        }
                        int y = j;
                        while (y != 2){
                            if(y < 2){
                                y = y+1;
                                count++;
                            } 
                            if (y > 2){
                                y = y-1;
                                count++;
                            }
                          
                        }
                        ketemu = true;
                    } 
                   break;    
                }
                if(ketemu){break;}
            }  
            if(ketemu){break;}  
        }     
        System.out.println(count);
    }
}
