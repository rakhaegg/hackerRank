import java.util.Scanner;

public class ViralAdvesting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(viralAdvertising(n));


    }   
    
    public static int viralAdvertising(int n) {
        // Write your code here
        int day = 0;
        int shared = 5;
      
        int cumml = 0;
        int xx = 0;
        int liked = 2;
        
        while ( day != n) {
            if(day == 0){
                shared = 5;
                liked = shared / 2;
                cumml = cumml + liked;
            }else{
                xx = (int) Math.floor(shared/2) * 3 ;
                shared = (int) xx;
                liked = xx /2;
                cumml = cumml + liked;
            }
            day++;
        }
        return cumml;
    } 
}
