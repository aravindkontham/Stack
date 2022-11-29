public class Insertion_BST {
    public static void main(String[] args) {
        Tree2 tree=new Tree2();
        tree.root=new Node(4);

        tree.root.left=new Node(2);
        tree.root.right=new Node(6);

        tree.root.left.left=new Node(1);
        tree.root.left.right=new Node(3);

//        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        System.out.println("\n BST before insertion:");
        tree.inorder(tree.root);
//        System.out.println();

        int key=5;
        tree.insert(tree.root,key);
        System.out.println("\n BST after insertion:");
        tree.inorder(tree.root);

    }
}
class Node2{
    int data;
    Node left,right;
    Node2(int value){
        data=value;
        left=right=null;
    }
}
class Tree2{
    Node root;
    Tree2(){
        root=null;
    }
    Node insert(Node node, int key){
        if(node==null){
            node=new Node(key);
            return node;
        }
        if(key>node.data)
          node.right=insert(node.right,key);
        else if(key<node.data)
           node.left= insert(node.left,key);
        return node;
    }
    void inorder(Node node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
}
