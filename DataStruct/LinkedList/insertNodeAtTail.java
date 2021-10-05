package DataStruct.LinkedList;

import java.util.Scanner;

public class insertNodeAtTail {
    
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
            Node test = new Node(data);

            if(head ==null){
                head = test;
            }else{
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = test;
            }
        }
        void printLinkedList(Node node){
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        LinkedList ls = new LinkedList();
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            ls.insertData(scan.nextInt());
        }
        System.out.println(" ");
        ls.printLinkedList(ls.head);
    }
}
