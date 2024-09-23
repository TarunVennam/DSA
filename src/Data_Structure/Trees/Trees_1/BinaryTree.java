package Data_Structure.Trees.Trees_1;

import java.util.Scanner;
class Binaytree {
    public class BinaryTree {

    }
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

    }
    private Node root;
    // inserts Elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of "+ node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of the left of " +node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter right to "+node.value);
        boolean right = scanner.nextBoolean();
        if(right) {
            System.out.println("Enter the value of the right of "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);

        }

    }
    public void display(){
        display(root," ");
    }
    private void display(Node node, String indent){
        if (node==null){
            return;
        }
        System.out.println(indent+ node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binaytree binaytree = new Binaytree();
        binaytree.populate(scanner);
        binaytree.prettydisplay();
    }
    public void prettydisplay(){
        prettydisplay(root,0);
    }
    private void prettydisplay(Node node, int level){
        if(node==null){
            return;
        }
        prettydisplay(node.right,level+1);
        if (level!=0){
            for (int i = 0; i <level-1 ; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---------> "+node.value);
        }
        else {
            System.out.println(node.value);
        }
        prettydisplay(node.left,level + 1);
    }
}
