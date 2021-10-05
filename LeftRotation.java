

import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int d = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }
        
        
        for (Integer integer : rotateLeft(d, arr)) {
            System.out.print(integer + " ");
        }
    }
    public static ArrayList<Integer> rotateLeft(int d, ArrayList<Integer> arr) {
        
        //Teknik 2
        /*
        int temp = 0;
        for (int i = 0; i < d; i++) {
            temp = arr.get(arr.size()-1);
            arr.set(arr.size()-1, arr.get(0));
           
            for (int j = 1; j <= arr.size()-1; j++) {
                    if(j==arr.size()-1){
                        arr.set(j-1, temp);
                    }else{
                        arr.set(j-1, arr.get(j));
                    }
            }
        }
        */
        /////Teknik 1
        ArrayList<Integer> reverse = new ArrayList<>();
        int mod = d % arr.size();
        for (int i = 0; i < arr.size(); i++) {

            reverse.add(arr.get((i + mod) % arr.size() )  );
        }
        
    
        return reverse;
        }
       
    }

