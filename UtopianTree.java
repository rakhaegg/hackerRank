import java.util.Scanner;

public class UtopianTree {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int t = scan.nextInt();

      for (int i = 0; i < t; i++) {

      }
      System.out.println(utopianTree(4));
  }
  public static int utopianTree(int n){
    int h = 0;
    int period = 0;
    while( period != n+1  ){
        if(period % 2 == 1){
            h = h * 2;
        }else{
            h = h  + 1;
        }
        period++;
    }
    return h;
  }  
}
