package dayCal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class D2Array {
    
    public static void main(String[] args) {
        
        Integer [][] arr = {
            {1, 1, 1, 0, 0, 0},
            {0 ,1 ,0 ,0 ,0 ,0},
            {1 ,1 ,1 ,0 ,0 ,0},
            {0 ,0 ,2 ,4 ,4 ,0},
            {0 ,0 ,0 ,2 ,0 ,0},
            {0 ,0 ,1 ,2 ,4 ,0}
        };
        


       // List<List<Integer>> listOfLists = new ArrayList<List<Integer>>(Arrays.asList(arr));  
        List<List<Integer>> lists = new ArrayList<>();
        for (Integer[] ints : arr) {
            lists.add(Arrays.asList(ints));
        }
        

        int nilai = 0;
        
     
        ArrayList<Integer> arrrrrr = new ArrayList<>();
        for (int k = 0; k < 4; k++) {
            
            int indexTengah = 1;
            int loopingKedua= 0;
            int bagian1234 = 1;
            int loopingPertama = 0;
            int loopingKetiga = 0;
    
            int pembtasLinePertama = 2;
            int pembatasLineKedua = 2;
            int pembatasLineKetiga = 2;
            int  i = 0;  

           
            while ((bagian1234 != 5)) {
                i=k;
                nilai = 0;
                while (loopingPertama  < 6) {
                    if(loopingPertama==pembtasLinePertama){
                        nilai = nilai + lists.get(i).get(loopingPertama);
                        //nilai = nilai + arr[i][loopingPertama];
                        break;
                    }
                    nilai = nilai + lists.get(i).get(loopingPertama);
                    //nilai = nilai + arr[i][loopingPertama];
                    loopingPertama++;
                    
                }
               
                loopingPertama = loopingPertama -1;
                i= i +1;
                while (loopingKedua < 6) {
                    if(loopingKedua==pembatasLineKedua){
                        break;
                    }
                    if(loopingKedua==indexTengah){
                        nilai = nilai + lists.get(i).get(loopingKedua);
                        //nilai = nilai + arr[i][loopingKedua];
                    }
                    loopingKedua++;
                }
                loopingKedua = loopingKedua -1;
                
                i= i+1;
                while(loopingKetiga < 6){
                    if(loopingKetiga==pembatasLineKetiga){
                        nilai = nilai + lists.get(i).get(loopingKetiga);
                       // nilai = nilai + arr[i][loopingKetiga];
                        break;
                    }
                    nilai = nilai + lists.get(i).get(loopingKetiga);
                   // nilai = nilai + arr[i][loopingKetiga];
                    loopingKetiga++;

                }
                loopingKetiga = loopingKetiga-1;
                
                indexTengah = indexTengah + 1;

                pembatasLineKedua = pembatasLineKedua +1;
                pembtasLinePertama = pembtasLinePertama +1;
                pembatasLineKetiga = pembatasLineKetiga +1;

                bagian1234 = bagian1234 + 1;
                arrrrrr.add(nilai);
                

            } 
        }
        Collections.sort(arrrrrr);
        System.out.println(arrrrrr.get(arrrrrr.size()-1));
         
       
        
    }
}
