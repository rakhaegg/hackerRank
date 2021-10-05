import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesignerPDF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            arr.add(scan.nextInt());
        }
        scan.nextLine();
        String word = scan.nextLine();
        System.out.println(designerPdfViewer(arr , word));
        //designerPdfViewer(arr, word);

    }    
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        ArrayList<Integer> num = new ArrayList<>();
    
        char[] toCharr = word.toCharArray();
        for (int i = 0; i < toCharr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == toCharr[i] ){
                    j = j+1;
                    num.add(j);
                }
            }
        }
        int result = 1;
    
        
        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < h.size(); j++) { 
                 if(num.get(i) == j+1){
                     num.set(i, h.get(j));
                     break;
                 }
            }
        }
        //System.out.println(num.get(0));
        Collections.sort(num);
        return toCharr.length * num.get(num.size()-1) ;
    }



}
