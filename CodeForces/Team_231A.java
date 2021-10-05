package CodeForces;

import java.util.Scanner;



public class Team_231A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        int n = scan.nextInt();
        String[] problem = new String[n];
        scan.nextLine(); 
  
        for (int i = 0; i < problem.length; i++) {
            problem[i] = scan.nextLine();
        }
        
        int line = 0;
        for (int i = 0; i < problem.length; i++) {
            
            String[] test = problem[i].split(" ");
            int count = 0;
            int zxc = 0;
            while (count != test.length) {
                if(test[count].equalsIgnoreCase("1")){zxc++;}
                count++;
            }
            if(zxc > 1){
                line++;
            }  
        }
        System.out.println(line);
        
       
       
    }
    
}
