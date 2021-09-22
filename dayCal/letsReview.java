package dayCal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class letsReview {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String line = null;
        try {
            line=br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
        }
        String[] split = line.split(" ");
        int n = Integer.parseInt(split[0]);

        
    }
}
