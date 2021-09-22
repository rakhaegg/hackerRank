package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class johnAndNuts {
    
    public static void main(String[] args) {
        InputStreamReader r =new InputStreamReader(System.in);    
        BufferedReader br =new BufferedReader(r);  
        
        //----------------------
        String firstLine  = null;
        try {
            firstLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitFirstLine = firstLine.split(" ");
        int firstLine_1 = Integer.parseInt(splitFirstLine[0]);
        int firstLine_2 = Integer.parseInt(splitFirstLine[1]);
        //----------------------------------------------
        String secondLine = null;
        try {
            secondLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitSecondLine = secondLine.split(" ");
        int[] secondLineArr = new int[splitSecondLine.length]; 
        for (int i = 0; i < secondLineArr.length; i++) {
            secondLineArr[i] = Integer.parseInt(splitSecondLine[i]);
        }
        //-----------------------------------------
        String thirdLine = null;
        try {
            thirdLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int thirdLineInteger = Integer.parseInt(thirdLine);
        //------------------------------------------
        String fourthLine = null;
        try {
            fourthLine = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitFourthLine = fourthLine.split(" ");
        int[] fourthLineArr = new int[splitFourthLine.length];
        for (int i = 0; i < fourthLineArr.length; i++) {
            fourthLineArr[i] = Integer.parseInt(splitFourthLine[i]);
        }
        //----------------------------------
        dosSolve(firstLine_1, firstLine_2, secondLineArr, thirdLineInteger, fourthLineArr);

        //firstLine is jumlah nut dan tipe nut 
        //secondLine is array tipe nut
        //thirdline is jumlah nut yang akan dimakan
        //fourthLineArr adalah variable nut that john want to eat that / tipe nut

    }
    public static void dosSolve(int firstLineLeft , int firstLineRight , int[] secondLine , 
            int thirdLineInteger , int[] fourthLineArr ){
        
         for (int i = 1; i <= 19; i++) {
             if(i == 9){
                
             }
         }
    }


}
