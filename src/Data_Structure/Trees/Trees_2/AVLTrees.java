package Data_Structure.Trees.Trees_2;

import Data_Structure.Trees.Trees_1.BST_2;

public class AVLTrees {

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
    // height
    public int height() {
        return height(root);
    }
    public int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }
    // Inserting
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
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
        node.height = Math.max(height(node.left),height(node.right))+1;

        return rotate(node);
    }
    public Node rotate(Node node){
        if (height(node.left) - height(node.right) > 1){
            // left Heavy
            if (height(node.left.left) - height(node.left.right) > 0){
                // Left left case
                return rightrotate(node);
                }
            if (height(node.left.left) - height(node.left.right) < 0){
                // Left right case
                node.left = leftrotate(node.left);
                return rightrotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1){
            // right heavy
            if ( height(node.right.left) - height(node.right.right) < 0){
                // right right case
                return leftrotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // left right case
                node.right = rightrotate( node.right);
                return leftrotate(node);
            }
        }
        return node;
    }
    // Rotate right
    public Node rightrotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left  = t;
        p.height = Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right) +1);
        return c;
    }
    // Rotate left
    public Node leftrotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right) +1);
        return p ;
    }

    // Balanced or not
    private boolean balance(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    // Display
    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node, String details){
        if (node==null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"Left child of "+node.value+" : ");
        display(node.right,"Right child of "+node.value+ " : ");
    }
    public void populate(int [] nums){
        for (int i = 0; i <nums.length ; i++) {
            this.insert(nums[i]);
        }
    }

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
        AVLTrees tree = new AVLTrees();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}
