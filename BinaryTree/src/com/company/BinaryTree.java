package com.company;
import java.util.* ;

public class BinaryTree {
    static class Node{
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }
    static class binaryTree{
        static int ind = -1 ;
        public static Node buildtree(int[] nodes){
            ind++;
            if(nodes[ind]== -1){
                return null ;
            }
            Node newNode = new Node(nodes[ind]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode ;  // 1
        }
    }
    // PREORDER TREVERSAL
    public static void preorder(Node root){
        if(root==null){     // base condition
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right) ;
    }

    // INORDER TRAVERSAL
    public static void inorder(Node root){
        if(root==null){     // base condition
            return ;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right) ;
    }

    // POSTORDER TRAVERSAL
    public static void postorder(Node root){
        if(root==null){     // base condition
            return ;
        }
        preorder(root.left);
        preorder(root.right) ;
        System.out.print(root.data + " ");
    }

    // *** LEVEL ORDER TRAVERSAL ***
    public static void levelorder(Node root){
        if(root==null){     // base condition
            return ;
        }
        Queue<Node> q = new LinkedList<>() ;
        q.add(root);
        q.add(null) ;

        while(!q.isEmpty()){
            Node currentNode = q.remove() ;
            if(currentNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break ;
                }else{
                    q.add(null) ;
                }

            }else{
                System.out.print(currentNode.data + " ");
                if(currentNode.left!=null){
                    q.add(currentNode.left) ;
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right) ;
                }
            }
        }
    }

    //  NO OF NODES
    public static int count(Node root){
        if(root==null){
            return 0 ;
        }
        int left = count(root.left);
        int right = count(root.right) ;
        return left + right + 1 ;
    }

    // SUM OF NODES
    public static int sum(Node root){
        if(root==null){
            return 0 ;
        }
        int left = sum(root.left);
        int right = sum(root.right) ;
        return left + right + root.data ;
    }

    // HEIGHT OF TREE
    public static int height(Node root){
        if(root==null){
            return 0 ;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right) ;
        int myheight = Math.max(leftheight,rightheight) + 1 ;
        return myheight ;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree() ;
        Node root = tree.buildtree(nodes) ;
        //System.out.println(root.data);     // 1
        //preorder(root) ;
        //levelorder(root) ;
        //System.out.println(count(root));
        //System.out.println(sum(root));
        System.out.println(height(root));
    }
}
