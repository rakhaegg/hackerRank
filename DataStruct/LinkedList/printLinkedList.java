package DataStruct.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class printLinkedList {
    
    //Making node 
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    //---------------------------------------------

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
        
    }
    public static void printLinkedList(SinglyLinkedListNode head) {
       

        while (head != null) {
            System.out.println( head.data);
            head = head.next;
        }
       
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        SinglyLinkedList list = new SinglyLinkedList();

        for (int i = 0; i < n; i++) {
            int input = scan.nextInt();
            list.insertNode(input);
        }
        printLinkedList(list.head);

        scan.close();
    }
    
}
