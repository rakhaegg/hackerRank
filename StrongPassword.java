import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println(minimumNumber(n , s));        
       // minimumNumber(n, s);
    }    
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String specilChar = "!@#$%^&*()-+";
      
        int result = 0;
        char[] arr = password.toCharArray();
        int[] arrrr = { 0 , 0 , 0 , 0};
        int asd  = 0;
        boolean check = false;
        if(password.length() < 6){
            asd = 6 - password.length() ;
            check = true;
        } 
            for (int i = 0; i < arr.length; i++) {

                if(Character.isDigit(arr[i])){
                    arrrr[0] = arrrr[0] + 1;
                }else if(Character.isLowerCase(arr[i])){
                    arrrr[1] = arrrr[1] + 1;
                }else if(Character.isUpperCase(arr[i])){
                    arrrr[2] = arrrr[2] + 1;
                }else if(specilChar.contains(Character.toString(arr[i]))){
                    arrrr[3] = arrrr[3] + 1;
                }
            }
            for (int i = 0; i < arrrr.length; i++) {
               if(arrrr[i] == 0){
                   result++;
               }
            }
            int total = 0;
            for (int i = 0; i < arrrr.length; i++) {
                total = total + arrrr[i];
            }
            
       
            
            if((total + result) >= 6){
                return result;
            }else{
                int count = 0 ;
                while (total != 6) {
                    total = total + 1;
                    count++;
                }
                return count;
            }
            

       
        
    }
}
