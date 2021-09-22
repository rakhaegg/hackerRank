package dayCal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class loops {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String line = null;
        try {
            line = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] split = line.split(" ");
        int n = Integer.parseInt(split[0]);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i)); 
        }

    }

}
