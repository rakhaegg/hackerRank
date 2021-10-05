import java.util.Scanner;

public class JavaStringToke {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();

        scan.close();

        String[] split = n.trim().split("[!, ?.@']+");

        System.out.println(split.length);

        for(int i = 0 ; i < split.length ; i++){
            System.out.println(split[i]);
        }
        
        

    }
}
