package com.company;

import java.util.ArrayList;

public class BinarySearchTree {
    // build bst
    static class Node{
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data= data ;
        }
    }
    public static Node Build(Node root ,int val){
        if(root==null){
            root = new Node(val);
            return root ;
        }
        if(root.data>val){   // left subtree
            root.left = Build(root.left,val);
        }else{
            root.right = Build(root.right,val) ;
        }
        return root ;
    }

    // INORDER TRAVERSAL
    public static void Inorder(Node root){
        if(root == null){
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    // SEARCH IN BST WHETHER NO PRESENT IS OR NOT
    public static boolean search(Node root,int val){
        if(root == null){
            return false ;
        }
        if(root.data>val){
            return search(root.left,val);
        }else if (root.data == val ) {
           return true ;
        }else{
           return search(root.right,val);
        }

    }

    // *** DELETE A NODE ***
    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left = delete(root.left,val) ;
        }
        else if(root.data < val){
            root.right = delete(root.right,val) ;
        }
        else{   // root.data == val
            // 1 case
            if(root.left==null && root.right==null){
                return null ;
            }
            //case 2
            if(root.left==null){
                return root.right ;
            }else if(root.right ==null){
                return root.left ;
            }
            // case 3
            Node Is = inorderSuccessor(root.right);
            root.data = Is.data ;
            root.right = delete(root.right,Is.data) ;
        }
        return root ;
    }
    public static Node inorderSuccessor(Node root) {
        while(root.left!=null){
            root = root.left ;
        }
        return root ;
    }

    // *** PRINT IN RANGE ***
    public static void printInRange(Node root , int x, int y){
        if(root==null){
            return ;
        }
        if(root.data>=x && root.data <= y){
            printInRange(root.left,x,y);
            System.out.print(root.data + " ");
            printInRange(root.right,x,y);
        }
        else if(root.data>y){
            printInRange(root.left,x,y);
        }else{
            printInRange(root.right,x,y) ;
        }
    }

    // *** PRINT PATH ***
    public static void printpath(Node root , ArrayList<Integer>path){
        if(root==null){
            return ;
        }
        path.add(root.data);
        // at leaf node
        if(root.left==null && root.right==null){
            print(path);
        }else{
            printpath(root.left,path);
            printpath(root.right,path);
        }
        path.remove(path.size()-1);
    }

    public static void print(ArrayList<Integer> path) {
        for(int i =0 ;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7} ;
        Node root = null ;
        for(int i= 0 ;i<values.length ;i++){
            root = Build(root,values[i]);
        }
        System.out.println(root.data);
        Inorder(root) ;
        System.out.println();

        //System.out.println(search(root,7));
//        delete(root,4);
//        Inorder(root) ;
//        System.out.println();
        //printInRange(root,5,7);
        printpath(root,new ArrayList<>());
        Node news= new Node(3) ;
        printpath(root.left,new ArrayList<>());
        System.out.println(root.data);

    }
}
