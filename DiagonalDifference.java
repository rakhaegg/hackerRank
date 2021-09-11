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
        di(arrN);
    }
    public static void di(int[][] arr){
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        int i  = 0 ;
        int j  = 0;
        int xx = 0;
        int yy = 0;
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
            System.out.println("baris" + j2);
            for (int k = 0; k <= j2; k++) {
                System.out.println("Nilai yy" + yy + " Nilai K " + k + "Nilai j2 = " + j2);

                if(k == yy){
                    second.add(arr[j2][yy]);
                    yy++;
                    break;
                }
                
            }
        }
        for (Integer integer : second) {
            System.out.print(integer);
        }

        
    }
    public static int DiagonalDifference(List<List<Integer>> arr){
        
        
        return 0;
        
    }
}
