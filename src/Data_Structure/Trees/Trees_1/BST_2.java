package Data_Structure.Trees.Trees_1;

import java.util.Scanner;

public class BST_2 {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }

    public boolean IsEmpty(){
        return root==null;
    }
    // Inserting Value in Tree
    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if (node==null){
            node = new Node(value);
            return node;
        }
        if (value<node.value){
            node.left = insert(value,node.left);
        }
        if (value>node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;
    }
    // CHecking Tree is balanced or not
    public boolean balance(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    // Displaying Tree
    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node, String details){
        if (node==null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"Left child of "+node.value +" : ");
        display(node.right,"Right child of "+node.value+ " : ");
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            this.insert(nums[i]);
        }
    }
    // populate sorted
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if (start>=end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }

    //Preorder Traversal in Tree
    public void preorder(){
        preorder(root);
    }

    private void preorder(Node node){
        if (node==null){
            return;
        }
        System.out.print(node.value +" ");
        preorder(node.left);
        preorder(node.right);
    }
    // Inorder Tarversal in Tree
    public void Inorder(){
        Inorder(root);
    }
    private void Inorder(Node node){
        if (node==null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.value+" ");
        Inorder(node.right);
    }
    // PostOrder Traversal in Tree
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if (node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST_2 bst = new BST_2();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        bst.populate(nums);
          bst.populateSorted(arr);
        bst.display();
        bst.preorder();
        System.out.println();
        bst.Inorder();
        System.out.println();
        bst.postorder();
//        bst.insert(scanner);
    }
}
