package dayCal;

import java.util.Scanner;

public class javaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int zx = 0;
            /*
            for (int j = 1; j <= n ; j++) {
                if(j==1){
                    zx = (int) ( a + (1 * b));
                }else{
                    zx = (int) (zx + ((2*(j-1)) * b));
                }

                System.out.print(zx + " ");
            }
            */
            int j = 1;
            int iterator = 0;
            while( !(iterator==n)){
                if(iterator==0){
                    zx = (int) ( a + (1 * b));
                    //System.out.println(a + " " + b + " " + zx );
                }else{
                    //System.out.print(zx + " ");
                    zx = (int) (zx + Math.pow(2, j) * b);
                    //System.out.println(j + " " + b + " " + zx);
                    j++;
                }
                iterator++;
                System.out.print(zx + " ");
            }
            System.out.println("");
        }
        in.close();
    }
    
}
