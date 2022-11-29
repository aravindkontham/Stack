//public class Practice {
//    public static void main(String[] args) {
//        Tree tree=new Tree();
//        tree.root=new Node(1);
//
//        tree.root.left=new Node(2);
//        tree.root.right=new Node(3);
//
//        tree.root.left.left=new Node(4);
//        tree.root.left.right=new Node(5);
//
//        tree.root.right.left = new Node(6);
//        tree.root.right.right = new Node(7);
//        tree.PreOrder(tree.root);
//        System.out.println();
//        System.out.println("height:"+tree.height(tree.root));
//        System.out.println();
//        tree.bfs();
//        System.out.println();
//        tree.spiral();
//
//    }
//}
//    class Node{
//        int data;
//        Node left,right;
//        Node(int value){
//            data=value;
//            left=right=null;
//        }
//    }
//    class Tree {
//
//    Node root;
//
//    Tree() {
//        root = null;
//    }
//    void PreOrder(Node node){
//        if(node==null)
//            return;
//        System.out.print(node.data+" ");
//        PreOrder(node.left);
//        PreOrder(node.right);
//    }
//    int height(Node node){
//        if(node==null)
//            return 0;
//        return Math.max(height(node.left), height(node.right)) + 1;
//    }
//    void bfs(){
//        int h=height(root);
//        for(int i=1;i<=h;i++)
//            pnl(root,i,1);
//    }
//    void pnl(Node root,int lev, int cl){
//        if(root==null)
//            return;
//        if(lev==cl)
//            System.out.print(root.data+" ");
//        else
//            pnl(root.left,lev,cl+1);
//            pnl(root.right,lev,cl+1);
//    }
//    void spiral(){
//        int h=height(root);
//        boolean ltr=false;
//        for(int i=1;i<=h;i++)
//            pnlr(root,i,1,ltr);
//    }
//    void pnlr(Node root,int lev,int cl,boolean ltr){
//        if(root==null)
//            return;
//        if(lev==cl)
//            System.out.print(root.data+" ");
//        if(ltr==true) {
//            pnlr(root.left, lev, cl + 1, ltr);
//            pnlr(root.right, lev, cl + 1, ltr);
//        }
//        else{
//            pnlr(root.right, lev, cl + 1, ltr);
//            pnlr(root.left, lev, cl + 1, ltr);
//        }
//    }
//    void Mirror(Node node){
//        if(node==null)
//            return;
//        Mirror(node.left);
//        Mirror(node.right);
//
//        Node temp=node.left;
//        node.left=node.right;
//        node.right=temp;
//    }
//}
