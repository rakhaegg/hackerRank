package DataStruct.LinkedList;

import java.util.Scanner;

public class DeleteNode {
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class LinkedList{
        Node head;
        Node tail;
        LinkedList(){
            this.head = null;
            this.tail = null;
        }
        void insertData(int data){
            Node node = new Node(data);
    
            if(this.head == null){
                this.head = node;
            }else{
                //Node temp = node;
                /*
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(data);
                */
                this.tail.next = node;
            }
            this.tail = node;
    
        }
         void printLinkedList(Node lsx){
            while (lsx != null) {
                System.out.println(lsx.data + " ");
                lsx = lsx.next;
            }
        }
        

        
    }
    static Node deleteNode(Node llist , int position){
        
        if(llist == null){
           
        }
        if(position == 0){
            llist  = llist.next ;
            return llist; 
        }else{
            Node temp = llist;
            int i = 1;
            while (i < position) {
                temp = temp.next;
                i++;
            }
            Node next = temp.next.next;
            temp.next = next;
            return llist; 
        }   
        
        
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); 

        LinkedList ls = new LinkedList();

        for (int i = 0; i < n; i++) {
            ls.insertData(scan.nextInt());
        }
        
        Node lsx = deleteNode(ls.head , 2);
    
        System.out.println(" ");
        ls.printLinkedList(lsx);
    }



}
