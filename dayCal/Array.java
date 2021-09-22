package dayCal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        InputStreamReader r =new InputStreamReader(System.in);    
        BufferedReader br =new BufferedReader(r);  

        ArrayList<Integer> al = new ArrayList<>();

        String line = null;
        String line2 = null;
        try {
            line = br.readLine();
            line2 = br.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitLine = line.split(" ");
        int n = Integer.parseInt(splitLine[0]);
        String[] splitSecond = line2.split(" ");

        for (int i = 0; i < n; i++) {
            al.add(Integer.parseInt(splitSecond[i]));
        }
        for (Integer string : reverseArray(al)) {
            System.out.print(string + " ");
        }
    }
    public static List<Integer> reverseArray(List<Integer> a){
        int nilaiTengah = a.size() / 2;
        int asd = a.size()-1;


        Integer[] array = a.toArray(new Integer[0]);
        
            for (int i = 0; i < nilaiTengah ; i++) {
                //if(i==nilaiTengah){continue;}
                int temp = array[i];
                array[i] = array[i+asd];
                array[i+asd] = temp; 
                asd = asd - 2 ;
            }
  
        List<Integer> list = Arrays.asList(array);          
        return list;
    }
}
