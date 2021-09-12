import java.util.*;
public class MiniMaxSum {
    static long[] result = new long[2];
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        //int[] arr = { 1 , 2 ,3 ,4 , 5};
        long[] show = new long[2];
        
        //List<Integer> list = new ArrayList<Integer>();
        
        //int val = input.nextInt();
        
        List<Long> list1 = new ArrayList<Long>();
        for (int i = 0; i < 5; i++) {
            long value = 0;
            list1.add(value = input.nextInt());
        }
        /*
        for (int i = 0; i < val; i++) {
            list.add(input.nextInt());            
        }
        */
       
        miniMaxSum(list1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }  
    public static  void miniMaxSum(List<Long> arr){
        int except = 0;
        long sum = 0;
        List<Long> asd = new ArrayList<>();
       
        
        for (int i = 0; i < arr.size(); i++) {
            boolean xxx = true;
            for (int j = 0; j < arr.size(); j++) {
                if((arr.get(i) == arr.get(j) && xxx) ){
                    xxx = false;
                    continue;
                }else{
                    sum = sum + arr.get(j);
                }
            }
            asd.add(sum);;
            sum = 0;   
        }
   
        Collections.sort(asd);  
        result[0] = asd.get(0);
        result[1] = asd.get(asd.size()-1);
    }  
}
