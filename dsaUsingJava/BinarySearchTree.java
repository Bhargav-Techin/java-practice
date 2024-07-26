package dsaUsingJava;

import java.util.*;

public class BinarySearchTree {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private TreeNode root = null;

    public TreeNode addTreeNode(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data) {
            root.left = addTreeNode(root.left, data);
        } else if (data > root.data) {
            root.right = addTreeNode(root.right, data);
        }
        return root;
    }


    public TreeNode findMin(TreeNode root) {
        if (root == null){
            return null;
        }
        if (root.left != null){
            return findMin(root.left);
        }
        return root;
    }

    public TreeNode deleteTreeNode(TreeNode root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = deleteTreeNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteTreeNode(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode minNode = findMin(root.right);
                root.data = minNode.data;
                deleteTreeNode(root.right, minNode.data);
            }
        }

        return root;
    }


    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }

        public static void printTree(TreeNode root) {
            if (root == null) {
                return;
            }

            // Initialize the current level with the root node
            Queue<TreeNode> currentLevel = new LinkedList<>();
            currentLevel.add(root);

            // While there are nodes to process
            while (!currentLevel.isEmpty()) {
                Queue<TreeNode> nextLevel = new LinkedList<>();

                // Iterate over the current level nodes
                for (TreeNode node : currentLevel) {
                    if (node != null) {
                        // Print the node's data
                        System.out.print(node.data + " ");
                        // Add the left and right children to the next level queue
                        nextLevel.add(node.left);
                        nextLevel.add(node.right);
                    } else {
                        // Print a placeholder for null nodes
                        System.out.print(". ");
                        nextLevel.add(null);
                        nextLevel.add(null);
                    }
                }
                System.out.println();

                // Move to the next level
                currentLevel = nextLevel;

                // Check if the next level is entirely null nodes
                boolean allNull = true;
                for (TreeNode node : currentLevel) {
                    if (node != null) {
                        allNull = false;
                        break;
                    }
                }

                if (allNull) {
                    break;
                }
            }
        }




    public void displayTree(String s){
        switch (s){
            case "inorder" :
                inorder(root);
                break;
            case "preorder" :
                preorder(root);
                break;
            case "postorder" :
                postorder(root);
                break;
            default:
                System.out.println("Entered wrong");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.root = bst.addTreeNode(bst.root, 50);
        bst.root = bst.addTreeNode(bst.root, 90);
        bst.root = bst.addTreeNode(bst.root, 110);
        bst.root = bst.addTreeNode(bst.root, 40);
        bst.root = bst.addTreeNode(bst.root, 70);
        bst.root = bst.addTreeNode(bst.root, 10);
        bst.root = bst.addTreeNode(bst.root, 30);
        bst.root = bst.addTreeNode(bst.root, 80);
//        bst.root = bst.addTreeNode(bst.root, 10);

        bst.displayTree("inorder");

        bst.deleteTreeNode(bst.root, 40);

        System.out.println("after deletion");

        bst.printTree(bst.root);
    }
}
