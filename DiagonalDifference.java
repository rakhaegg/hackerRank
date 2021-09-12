import java.util.*;
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arrN = new int[n][n];
        int input ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrN[i][j] = scan.nextInt();
            }
        }
        System.out.println(di(arrN));
    }
    public static int di(int[][] arr){
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        int i  = 0 ;
        int j  = 0;
        int xx = 0;
        
        for (int j2 = 0; j2 < arr.length; j2++) {
            for (int k = 0; k <= j2; k++) {
                if(k == xx){
                    first.add(arr[j2][xx]);
                    xx++;
                    break;
                }
            }
        }
        
        for (int j2 = arr.length-1; j2 >= 0; j2--) {
            int yy = arr.length-1;
            for (int k = 0; k <= j2; k++) {
                if(k != j2){
                    yy = yy - 1;
                }else{
                    second.add(arr[j2][yy]);
                }
                
            }
        }
   
        int sumFirst = 0;
        int sumSecond = 0;
        int end = 0;
        for (int k = 0; k < first.size(); k++) {
            sumFirst = sumFirst + first.get(k);
        }
        for (int k = 0; k < arr.length; k++) {
            sumSecond = sumSecond + second.get(k);
        }
        if(sumSecond < sumFirst){
            end = sumFirst - sumSecond;
        }else if(sumSecond > sumFirst){
            end = sumSecond - sumFirst;
        }else{
            end = sumSecond - sumFirst;
        } 
        return end;
    }
}
