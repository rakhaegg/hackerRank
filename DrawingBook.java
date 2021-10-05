import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int p = scan.nextInt();

        System.out.println(pageCount(n, p));

    }
    public static int pageCount(int n, int p) {
        // Write your code here
        int countDepan = 0;
        for (int i = 1; i <= n; i++) {
           
            if(i%2 == 0){
                countDepan++;
            }
            if(i == p){
                break;
            }
            
        }
        int countBelakang = 0;

        for (int i = n; i >= 1; i--) {
            if(i%2 == 1 && i != n){
                countBelakang++;
            }
            if(i == p){
                break;
            }

        }
        int selesai = 0;
        if(countBelakang > countDepan){
            selesai = countDepan;
        }else {
            selesai = countBelakang;
        }

        return selesai;

    
    }
}
