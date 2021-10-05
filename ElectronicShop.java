import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class ElectronicShop {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileReader("fileElector.txt"));
            
        

        int[] arrN  = new int[797];
        int[] arrM = new int[951];
        

        for (int i = 0; i < arrN.length; i++) {
         
            arrN[i] = input.nextInt();
        }
        for (int i = 0; i < arrM.length; i++) {
            arrM[i] = input.nextInt();
        }

        //System.out.println(getMoneySpent(arrN, arrM, 374625 ));
        getMoneySpent(arrN, arrM, 374625);
    }

    static void getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        ArrayList<Integer> selesai = new ArrayList<>();

        for (int i = 0; i < drives.length; i++) {
            for (int j = 0; j < keyboards.length; j++) {
                int asd = drives[i] +keyboards[j];
                selesai.add(asd);
            }
        }
        Collections.sort(selesai);
        int nilaiAkhir = 0;
        for (int i = selesai.size()-1; i >= 0; i--) {
            //System.out.println(selesai.get(i));
            if(b > selesai.get(i)){
                System.out.println(selesai.get(i+1));
                nilaiAkhir = selesai.get(i);
                break;
            }else{
                
                nilaiAkhir = -1;
            }
        }
    
        //return selesai.get(selesai.size()-1);
    }
}
