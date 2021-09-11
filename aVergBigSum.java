import java.util.*;
public class aVergBigSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Long>  a = new ArrayList<>();
        long input ;
        for (int i = 0; i < n; i++) {
            a.add(input = scan.nextLong());
        }
        System.out.println(aVergBigSum(a));


    }
    public static long aVergBigSum(List<Long> ar){
        long result = 0;

        for (int i = 0; i < ar.size(); i++) {
            result = result + ar.get(i);
        }

        return result;
        
    }
}
