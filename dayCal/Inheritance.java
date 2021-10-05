package dayCal;

import java.util.ArrayList;
import java.util.Scanner;

public class Inheritance {
    static class Person{
        String firstName ;
        String lastName ;
        int idNumber;
       
        
        Person(String firstName , String lasName , int idNumber){
            this.firstName = firstName;
            this.lastName = lasName;
            this.idNumber = idNumber;
        }
        public void printPerson(){
            System.out.println(
                   "Name: " + lastName + ", " + firstName 
               + 	"\nID: " + idNumber); 
       }
        
       
    }
    static class Student extends Person{
        int[] testScores;
        Student(String firstName, String lasName, int idNumber , int[] testScores) {
            super(firstName, lasName, idNumber);
            //TODO Auto-generated constructor stub
            this.testScores = testScores;
        }
        

        char calculate(){
            //int n = scores.size();
            int tambah = 0;
            int index = 0;
            while(index < testScores.length){
                tambah = tambah + testScores[index];
                index++;
            }
            int average = tambah/ testScores.length;
            if(average >= 90 && average <= 100 ){
                return 'O';
            }
            if(average >= 80 && average <= 90 ){
                return 'E';
            }
            if(average >= 70 && average <= 80 ){
                return 'A';
            }
            if(average >= 55 && average <= 70 ){
                return 'P';
            }
            if(average >= 40 && average <= 55 ){
                return 'D';
            }
            if(average <= 40 ){
                return 'T';
            }
            return 0;
            
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		String firstName = scan.next();
		String lastName = scan.next();

		int id = scan.nextInt();
		int numScores = scan.nextInt();
		
        int[] testScores = new int[numScores];
		
        for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );

    }
}
