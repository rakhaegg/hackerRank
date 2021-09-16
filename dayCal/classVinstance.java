package dayCal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class classVinstance {
    static InputStreamReader is = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(is);
    public static void main(String[] args) {
        
        int value = 0;
        try {
            value = Integer.parseInt(br.readLine());
            if (!(value >= 1 && value <= 4)){
                throw new ArithmeticException("Kurang 1 dan Lebih dari 4");
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int[] umur = new int[value];
        for (int i = 0; i < umur.length; i++) {
            try {
                umur[i] = Integer.parseInt(br.readLine());
            } catch (NumberFormatException | IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        }
        for (int i = 0; i < umur.length; i++) {
            Person pes = new Person(umur[i]);
            pes.yearPasses();
            
            System.out.println(pes.amIOld());
            if(i == umur.length-1){
                System.out.print(pes.amIOld());
            }else{
                System.out.println(pes.amIOld());
                System.out.println("");
            }
           
        }
       

    }
}
class Person{
    int age;


    Person(int initialAge){
        this.age = initialAge;
    }
    public String amIOld(){
        String backAmIOld = null;
        if(age < 13){
            backAmIOld = "You Are young";
        }else if(age >= 13 && age < 18){
            backAmIOld = "Yout are Teenager";
        }else{
            backAmIOld = "You are old";
        }
        age = age + 3;
        return backAmIOld;


    }
    public void yearPasses(){
        if(age < 0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
}
