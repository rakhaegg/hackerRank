package DataStruct.LinkedList;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class insertNodeAtHead {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
      
    }

    public static void printLinkedList(SinglyLinkedListNode head) {
       

        while (head != null) {
            System.out.print( head.data + " ");
            head = head.next;
        }
       
    }

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        
        SinglyLinkedListNode ss = new SinglyLinkedListNode(data);
        
        ss.next = llist;

        return ss;
        

        /*
        SinglyLinkedList sa = new SinglyLinkedList();
        
        if(llist == null){
            llist = new SinglyLinkedListNode(data);
            sa.head = llist;
            return sa.head;
        
        }
        //SinglyLinkedListNode current = llist;
        while (llist.next != null) {
            llist = llist.next;
        }
        llist.next = new SinglyLinkedListNode(data);

        return llist;
        */

    
        //Complete this method
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);
          llist.head = llist_head;
        }
        printLinkedList(llist.head);
    }
}
