package dayCal;

import java.io.*;
public class javaLoops1 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for (int i = 1; i < 10; i++) {
            //System.out.println(N + " x " + i + " = " + (i*N) );
            System.out.printf("%d x %d = %d\n" , N , i , (i*N) );
        }
    }
}
