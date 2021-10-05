import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheHurdle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        List<Integer> height = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            height.add(scan.nextInt());
        }

        hurdleRace(k, height);

    }
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        boolean check = false;
        for (int i = 0; i < height.size(); i++) {
            if(height.get(i) > k){check = true;}
            for (int j = i; j < height.size(); j++) {
                if(height.get(i) > height.get(j)){
                    int temp = height.get(i);
                    height.set(i, height.get(j));
                    height.set(j, temp);
                }
            }
        }
        int selesai = 0;
        if(check){
            int val = height.get(height.size()-1);
            selesai = val - k;
            //val = val - k;
        }else{
            selesai = 0;
        }
        return selesai;
        
    }

}
