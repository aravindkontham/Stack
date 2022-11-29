public class BST {
    public static void main(String[] args) {
        Tree1 tree=new Tree1();
        tree.root=new Node(4);

        tree.root.left=new Node(2);
        tree.root.right=new Node(6);

        tree.root.left.left=new Node(1);
        tree.root.left.right=new Node(3);

        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println();
        int key=10;
        if(tree.search(tree.root,key))
        System.out.println("Found ");
        else
            System.out.println("not found::");
    }
}
class Node1{
    int data;
    Node left,right;
    Node1(int value){
        data=value;
        left=right=null;
    }
}
class Tree1{
    Node root;
    Tree1(){
        root=null;
    }
    void inorder(Node node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    boolean search(Node node, int key){
        if(node==null)
            return false;
        if(node.data==key)
            return true;
        if(key>node.data)
             return search(node.right,key);
        else
           return search(node.left,key);
    }

}
