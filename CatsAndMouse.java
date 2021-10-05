import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int q = scan.nextInt();

        
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            System.out.println(catAndMouse(x, y, z));
        }
       
       


        
    }   
    static String catAndMouse(int x, int y, int z) {

        boolean checkFirst = false;
        if(x > z ){
            //System.out.println("Y lebih besar");
            checkFirst = true;
        }
        boolean checkSecond = false;
        if(y > z){
           // System.out.println("X lebih besar");
            checkSecond = true;
        }
        
        int catA = 0;
        while ( x !=z) {
            if(checkFirst){
               // System.out.println(x + " " + catA);
                x--;
                catA = catA + 1;
            }else{
                x++;
                catA = catA + 1;
            }
        }
        int catB = 0;
        while (y != z) {
            if(checkSecond){
                y--;
                catB = catB + 1;
            }else{
                //System.out.println(y + " " + catB);
                catB = catB + 1;
                y++;
            }
        }
        //System.out.println(catB + "  " + catA);

        String test = null;
        if(catB == catA){
           // System.out.println("Mouse C");
           test = ("Mouse C");
        }
        if(catA < catB){
            test = ("Cat A");
            //System.out.println("Cat A");
        }else if (catA> catB){
            test = ("Cat B");
            //System.out.println("Cat B");
        }
        return test;

    } 
}
