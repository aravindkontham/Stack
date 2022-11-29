public class LCA {
    public static void main(String[] args) {
        Tree3 tree=new Tree3();
        tree.root=new Node(4);

        tree.root.left=new Node(2);
        tree.root.right=new Node(6);

        tree.root.left.left=new Node(1);
        tree.root.left.right=new Node(3);

        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        int n1=1;
        int n2=3;

        Node lca=tree.lca(tree.root,n1,n2);
        System.out.println("\nLCA of "+n1+" and "+n2+ " is "+lca.data);

    }
}
class Node3{
    int data;
    Node left,right;
    Node3(int value){
        data=value;
        left=right=null;
    }
}
class Tree3{
    Node root;
    Tree3(){
        root=null;
    }
    Node lca(Node node,int n1, int n2){
        if(node==null)
            return null;

        if(n1>node.data && n2>node.data)
            return lca(node.right,n1,n2);

        if(n1<node.data && n2<node.data)
            return lca(node.left,n1,n2);

        return node;
    }
}
