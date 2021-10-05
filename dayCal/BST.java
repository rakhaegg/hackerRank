package dayCal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
        
    }
  
   
        
        static Node insert(Node root , int val){
            
            if(root == null){
                root = new Node(val);
                return root;
            }
            if(root.data > val){
                root.left = insert(root.left , val);
            }else if(root.data < val){
                root.right =   insert(root.right , val); 
            }
            return root;
        }
        static void traverseInOrder(Node node){
            if(node != null){
                traverseInOrder(node.left);
                System.out.print(node.data + " ");
                traverseInOrder(node.right);
            }else{
               
            }
        }
        static void traverseLevel(Node root){
            if(root == null){
                return;
            }
            Queue<Node> nodes = new LinkedList<>();
            nodes.add(root);

            while (!nodes.isEmpty()) {
                Node temp = nodes.remove();
                System.out.print(temp.data + " ");

                if(temp.left != null){
                    nodes.add(temp.left);
                }
                if(temp.right != null){
                    nodes.add(temp.right);
                }

            }
        }

    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        Node root = null;

        
       while (T--> 0) {
           int data = scan.nextInt();
           root = insert(root , data);
       }

       // traverseInOrder(root);
        traverseLevel(root);

        
    }


  
}
