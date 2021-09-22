import java.util.Scanner;

public class test {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int n = 0;

    boolean ketemu = false;
    do {
      n = scan.nextInt();
       if(n== 1){
            ketemu = true;
       } 
    } while (!ketemu);
   } 
}
