import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import dayCal.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufReader = new BufferedReader(new FileReader("file.txt"));
        Scanner s = new Scanner(new FileReader("file2.txt"));
        ArrayList<Integer> listOfLines = new ArrayList<>();

        while (s.hasNext()){
            if(s.hasNextInt()){
                listOfLines.add(s.nextInt());
            } else {
                s.next();
            }
        }
        System.out.println("Sizze " + listOfLines.size());
        System.out.println("Result " + migratoryBirds(listOfLines));
    }
    public static int migratoryBirds(ArrayList<Integer> arr) {
        
        // Write your code here
        int[] type = {1 , 2, 3, 4, 5};
        int[] countin = { 0 , 0 , 0 , 0 , 0};


        for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i) == type[0]){
 
                    int temp = countin[0];
                    countin[0] = temp+1;
                }
                if(arr.get(i) == type[1]){
                   
                    int temp = countin[1];
                    countin[1] = temp+1;
                } 
                if(arr.get(i) == type[2]){
               
                    int temp = countin[2];
                    countin[2] = temp+1;
                } 
                if(arr.get(i) == type[3]){
                
                    int temp = countin[3];
                    countin[3] = temp+1;
                }
                 if(arr.get(i) == type[4]){
                  
                    int temp = countin[4];
                    countin[4] = temp+1;
                }
        }
        int tipe = 0;

        for (int i = 0; i < countin.length; i++) {
            for (int k = 1; k < countin.length; k++) {
                if(countin[i] < countin[k]){
                    tipe = type[k+1];
                    break;
                }else if(countin[i] == countin[k]){
                    tipe = type[k+1];
                    break;
                }
            }
        }
        
        return tipe;
    }   

}
