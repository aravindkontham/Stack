//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.SortedMap;
//
//public class Implemtation {
//
//    public static void main(String[] args) {
//        Tree tree=new Tree();
//        tree.root=new Node(10);
//
//        tree.root.left=new Node(12);
//        tree.root.right=new Node(13);
//
//        tree.root.left.left=new Node(20);
//        tree.root.left.right=new Node(30);
//
//        tree.root.right.left = new Node(6);
//        tree.root.right.right = new Node(7);
//
//        tree.preOrder(tree.root);
//        System.out.println();
//
//        tree.InOrder(tree.root);
//        System.out.println();
//
//        tree.PostOrder(tree.root);
//        System.out.println();
//
//        System.out.println("Max-height:"+ tree.height(tree.root));
//        System.out.println("LevelOrderTraversal:");
//        tree.BFS();
//        System.out.println();
//        tree.bfs();
//        tree.spiral();
//
//    }
//}
//class Node{
//    int data;
//    Node left, right;
//    Node(int value){
//        data=value;
//        left=right=null;
//    }
//}
//class Tree {
//
//    Node root;
//
//    Tree() {
//        root = null;
//    }
//
//    void preOrder(Node node) {
//        if (node == null)
//            return;
//        System.out.print(node.data + " ");
//        preOrder(node.left);
//        preOrder(node.right);
//    }
//
//    void InOrder(Node node) {
//        if (node == null)
//            return;
//        InOrder(node.left);
//        System.out.print(node.data + " ");
//        InOrder(node.right);
//    }
//
//    void PostOrder(Node node) {
//        if (node == null)
//            return;
//        PostOrder(node.left);
//        PostOrder(node.right);
//        System.out.print(node.data + " ");
//    }
//
//    int height(Node node) {
//        if (node == null)
//            return 0;
//        return Math.max(height(node.left), height(node.right)) + 1;
//    }
//
//    void BFS() {
//        int h = height(root);
//        for (int i = 1; i <= h; i++)
//            PrintNodesAtLevel(root, i, 1);
//    }
//
//    void PrintNodesAtLevel(Node root, int level, int currentLevel) {
//        if (root == null)
//            return;
//        if (level == currentLevel)
//            System.out.print(root.data + " ");
//        else
//            PrintNodesAtLevel(root.left, level, currentLevel + 1);
//        PrintNodesAtLevel(root.right, level, currentLevel + 1);
//
//    }
//
//    void bfs() {
//        Queue<Node> q = new LinkedList<Node>();
//        q.add(root);
//        int max = Integer.MIN_VALUE;
//        while (!q.isEmpty()) {
//            Node temp = q.peek();
//            q.poll();
//            if (temp.data > max)
//                max = temp.data;
//            //System.out.print(temp.data+" ");
//            if (temp.left != null)
//                q.add(temp.left);
//            if (temp.right != null)
//                q.add(temp.right);
//        }
//        System.out.println(max);
//    }
////    void Mirror(Node node){
////        if(node==null)
////            return;
////        Mirror(node.left);
////        Mirror(node.right);
////
////        Node temp=node.left;
////        node.left=node.right;
////        node.right=temp;
////}
//     void spiral(){
//        int h=height(root);
//        boolean ltr=false;
//        for(int i=1;i<=h;i++)
//            Printnode(root,i,1,ltr);
//     }
//     void Printnode(Node root,int level, int cl,boolean ltr){
//        if(root==null)
//            return;
//        if(level==cl)
//            System.out.print(root.data+" ");
//        if(ltr==true) {
//            Printnode(root.left, level, cl + 1, ltr);
//            Printnode(root.right, level, cl + 1, ltr);
//        }
//        else {
//            Printnode(root.right, level, cl + 1, ltr);
//            Printnode(root.left, level, cl + 1, ltr);
//        }
//     }
//}
