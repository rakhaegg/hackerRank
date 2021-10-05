package DataStruct.LinkedList;

import java.util.Scanner;

public class reverseNode {
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
            if(head==null){
                head = node;
            }else{
                Node temp = head;
                
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }
        void printData(Node node){
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        Node reserve(Node node){
            //return null;
            /*
            Node prev = null;

            Node curr = head;

            Node next = null;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            node = prev;
            */
            Node next = null;
            Node prev = null;

            Node temp = node;

            while(temp != null){
                
              //  prev
                    
            }
            //return reserve;
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList ls = new LinkedList();

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            ls.insertData(scan.nextInt());
        }
        ls.head = ls.reserve(ls.head);
        
        ls.printData(ls.head);
        
    
    }
}
