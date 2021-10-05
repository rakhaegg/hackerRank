import java.util.ArrayList;
import java.util.Scanner;

public class GradingStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        for (int i = 0; i < n; i++) {
            if(arr.get(i) < 38){
                continue;
            }else{
                boolean check = false;
                int j = 5 ;
                int x = 0;
                while (!check) {
                    if(arr.get(i) >= x && arr.get(i) <=j ){
                        System.out.println("IF" + arr.get(i));
                        if((j-arr.get(i) < 3)){
                            arr.set(i, j);
                            check = true;
                            break;
                        }else{
                            check = true;
                            break;
                        }
                    }
                    j = j + 5;
                    x = x +5;
                }   
            }
        }
       
    }
}
