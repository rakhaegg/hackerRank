import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class subArrayDivision {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        ArrayList<Integer> arr = new ArrayList<>();


        String firstLine = null , secondLine = null , thirdLine = null;

        try {
            firstLine = br.readLine();
            secondLine = br.readLine();
            thirdLine = br.readLine() ;
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        String[] splitLine = firstLine.split(" ");
        String[] splitSecondLine = secondLine.split(" ");
        String[] splitThirdLine =  thirdLine.split(" ");

        int n = Integer.parseInt(splitLine[0]);

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(splitSecondLine[i]));
        }
        int d = Integer.parseInt(splitThirdLine[0]);
        int m = Integer.parseInt(splitThirdLine[1]);

        System.out.println(birthday(arr , d , m));
        //birthday(arr , d , m);
    } 
    public static int birthday(List<Integer> s, int d, int m) {
        
        int count = 0;
        //int[] test = new int[m];
        int j = 0;
        ArrayList<Integer> zxc = new ArrayList<>();

        ArrayList<Integer> wee = new ArrayList<>();

        if(s.size() == 1){
            if(s.get(0)==d){count++;}
        }else{
            while (m != s.size()+1  ) {
                //wee.clear();
                int temp = 0;
                for (int i = j; i < m; i++) {
                    temp = temp + s.get(i);
                  //  wee.add(s.get(i));
                }
                if(temp == d){
                    /*
                    if(zxc.isEmpty()){
                        for (int i = 0; i < wee.size(); i++) {
                            zxc.add(wee.get(i));
                        }
                    }
                    boolean check = true;
                    for (int i = 0; i < zxc.size(); i++) {  
                        for (int k = 0; k < wee.size(); k++) {
                            if(zxc.get(i) == wee.get(k)){
                                check = false;
                                break;
                            }
                        }
                        if(true){
                            
                        }
                    }
                    */
                    count++;
                }
                j++;
                m++;
            }
        }




            
          
        return count;
    } 
      
}
