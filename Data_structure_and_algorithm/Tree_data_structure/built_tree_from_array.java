package Data_structure_and_algorithm.Tree_data_structure;
// implementation of built preorder tree by given array
public class built_tree_from_array {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binarytree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }
    static void preorder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);;
        preorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        System.out.println("root value of tree: "+root.data);
        System.out.println("preorder traversal");
        preorder(root);

    }
}