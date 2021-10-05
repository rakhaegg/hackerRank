package dayCal;

public class staticInitBlock {
    static int B , H ;

    static boolean flag;

    static boolean flag(int B, int H ){
        if(B <= 0 || H <= 0){
            return false;
        }else {
            return true;
        }
        
    }

    
    public static void main(String[] args) {
        B  = 3 ; H = -3;
        if(flag(B,H)){
			int area=B*H;
			System.out.print(area);
		}else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        
        
    }
}
