package DataStruct.LinkedList;

import java.util.Scanner;

import DataStruct.LinkedList.printLinkedList.SinglyLinkedList;

public class insertNodeAtHead {
    

    //Making Node 
    static class SinglyLinkedListNode{
        public int data;
        public SinglyLinkedListNode next;

        //Making Cons for insert data
        public SinglyLinkedListNode(int data){
            this.data = data;
            this.next = null;
        }

    }
    static class SinglyLinkedList{
        //making head
        public SinglyLinkedListNode head;
        //making tail
        public SinglyLinkedListNode tail;

        //making cons
        SinglyLinkedList(){
            this.head = null;
            this.tail = null;
        }
        //making method for insert data
        public void insertNode(int nodeData ){
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if(this.head == null){
                this.head = node;
            }else{
                this.head.next = node;
            }
            this.tail = node;
        }


    }


    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        //int temp = data;
        //llist.data = temp;
        SinglyLinkedList ns = new SinglyLinkedList();
         
        if(llist == null){
            llist = ns.head; 
        }
        llist.data =data;        

        return llist;
        

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

        SinglyLinkedList node = new SinglyLinkedList();

        for (int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            SinglyLinkedListNode listHead = insertNodeAtHead(node.head , temp);
            node.head = listHead;
        }
        printLinkedList(node.head);
    }
}
