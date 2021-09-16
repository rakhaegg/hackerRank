


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class AppleOrange {
    
    public static void main(String[] args) {
        
        InputStreamReader r =new InputStreamReader(System.in);    
        BufferedReader br =new BufferedReader(r);  


        
        ArrayList<Integer> arrApples =  new ArrayList<Integer>();
        ArrayList<Integer> arrOranges = new ArrayList<Integer>();
        // value s for start and t for end
        // value a for point fall apple  and b point  fall orange
        // 

        //-----------------------------------------------
        String inputST = null;
        try {
             inputST= br.readLine(); 
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitStringInput = inputST.split(" ");
        int s = Integer.parseInt(splitStringInput[0]);
        int t = Integer.parseInt(splitStringInput[1]);
        //-----------------------------------------------
        String inputAB = null;
        try {
            inputAB = br.readLine();
        }catch (Exception e ){
            e.printStackTrace();
        }
        String[] splitStringInputAB = inputAB.split(" ");
        int a = Integer.parseInt(splitStringInputAB[0]);
        int b = Integer.parseInt(splitStringInputAB[1]);
        //-------------------------------------------------
        String inputValueAppleOrange = null;
        try {
            inputValueAppleOrange = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
        }
        String[] splitValueOrangeApple = inputValueAppleOrange.split(" ");
        int m = Integer.parseInt(splitValueOrangeApple[0]);
        int n = Integer.parseInt(splitValueOrangeApple[1]);
        //--------------------------------------------------
        String inputApples = null;
        try {
            inputApples = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
        }
        String[] splitStronginputApple = inputApples.split(" ");
        for (int i = 0; i < splitStronginputApple.length; i++) {
            arrApples.add(Integer.parseInt(splitStronginputApple[i]));
        }
        //--------------------------------------------------
        String inputOrange = null;
        try {
            inputOrange = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
        }
        String[] splitStronginputOrange = inputOrange.split(" ");
        for (int i = 0; i < splitStronginputOrange.length; i++) {
            arrOranges.add(Integer.parseInt(splitStronginputOrange[i]));
        }
        //---------------------------------------------------
        countApplesAndOranges(s, t, a, b, arrApples, arrOranges);

        
    } 
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, 
        List<Integer> oranges ) {
            int[] applesFinal = new int[apples.size()];
            int[] orangeFinal = new int[oranges.size()];
            
            for (int i = 0; i < applesFinal.length; i++) {
                int val = apples.get(i);
                applesFinal[i] = val + a;
            }
            for (int i = 0; i < orangeFinal.length; i++) {
                int val = oranges.get(i);
                orangeFinal[i] = val + b;
            }
            int countApples = 0;
            for (int i = 0; i < applesFinal.length; i++) {
                if(applesFinal[i] >= s && applesFinal[i]  <=t){
                    countApples++;
                }
            }
            int countOrange = 0;
            for (int i = 0; i < orangeFinal.length; i++) {
                if(orangeFinal[i] >= s && orangeFinal[i]  <=t){
                    countOrange++;
                }
            }
            System.out.println(countApples);
            System.out.println(countOrange);
            
        }
}