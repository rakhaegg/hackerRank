package CodeForces;

import java.util.Scanner;

public class QueueattheSchool_266B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        char[] ss = s.toCharArray();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < ss.length-1; j++) {
                
                if(ss[j] == 'B' && ss[j+1] == 'G'){
                    ss[j] = 'G';
                    ss[j+1] = 'B';
                    j++;
                }
            }
        }
        System.out.println(String.valueOf(ss));

    }
}
