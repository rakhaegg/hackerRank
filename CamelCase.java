import java.util.Scanner;

public class CamelCase {
    public static int camelcase(String s) {
        // Write your code here
            int count = 1;
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length ; i++) {
                if(Character.isUpperCase(arr[i])){
                    count++;
                }
            }
            return count;
        }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(camelcase(s));
    }
}
