public class test {
   public static void main(String[] args) {
    int val = 5;
    int x = 1  ;
    for (int i = 1; i < 100; i++) {
        if(val == i){
            break;
        }else{
            x++;
        }
    }
   
    
    String as = "%1.";
    
    String zxc = as.concat(String.valueOf(x));
    String sad = zxc.concat("f");
    System.out.print(sad);
    
    /*
    System.out.printf(sad, Double.valueOf(zero) / val);
    System.out.println();
    System.out.printf(sad, Double.valueOf(positive) / val);
    System.out.println();
    System.out.printf(sad, Double.valueOf(negative) / val);
    */
   } 
}
