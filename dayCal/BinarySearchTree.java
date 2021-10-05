package dayCal;

import java.util.Scanner;

public class BinarySearchTree {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static int getHeight(Node root){
        //Write your code here
        if (root == null) {
            return 0;
        }else{
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            if(left>right){
                return left+1;
            }else{
                return right+1;
            }
            //return 1 + getHeight(root.left) + getHeight(root.right);
        }
    }
    
    
    static int numEdgesIn(Node root) {
        if(root == null){
            return 0;
        }else{
            return getHeight(root) -1;
        }
        
    }
 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=numEdgesIn(root);
        System.out.println(height);
    }
}
