
public class dvd {
    public static void main(String[] args) {
        int arr[] = { 10 , 20 ,30 , 43 , 65 , 78, 90 , 111};

        System.out.println(doDVD(arr, 0, arr.length-1 , 30));
      // doDVD(arr, 0, arr.length-1 , 65);
    }   
    public static int doDVD(int[] arr , int awal , int akhir , int cari){
        
        int n = (awal +  akhir)/2;
        
        if(arr[n] == cari){
            //return n;
            //System.out.println("ketemu");
        }else if (arr[n] < cari){
            //System.out.println("*");
            //System.out.print(n + " " + akhir);
            return doDVD(arr , n+1 , akhir , cari);
            
        }else if (arr[n] > cari){
            //System.out.println("#");
            //System.out.print(n + " " + awal);
            return doDVD(arr , awal , n-1, cari);
        }
         return n;
        
        //return asd;
        
    } 
}
