package dayCal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

public class QueuesAndStacks {
    Stack<Character> stack = new Stack<>();
    Queue queee = new LinkedList<>();
    //Queue<Character> qu = new PriorityBlockingQueue<>();
    void pushCharacter(char val){
        stack.push(val);
    }
    void enqueueCharacter(char val){
        queee.add(val);
    }
    
    char popCharacter(){
        return stack.pop();
    }
    char dequeueCharacter(){
        return (char) queee.remove();
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();

        char[] arr = s.toCharArray();

        QueuesAndStacks ss = new QueuesAndStacks();

        for (int i = 0; i < arr.length; i++) {
            ss.pushCharacter(arr[i]);
            ss.enqueueCharacter(arr[i]);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length/2; i++) {
            System.out.println(ss.popCharacter() + " " + ss.dequeueCharacter());
            if (ss.popCharacter() != ss.dequeueCharacter()) {
                isPalindrome = false;   
                System.out.println("ketemu");             
                break;
            }
        }
        System.out.println( "The word, " + s + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
