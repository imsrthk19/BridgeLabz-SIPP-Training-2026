package BST;
public class BSTree {
    public class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data= data;
        left= right= null;
    }
}
    // Insert Method
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } 
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Inorder Traversal
    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " -> ");
        inorder(root.right);
    }


    // Search
    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }


    // Find kth smallest
    int count = 0;
    public int kthSmallest(Node root, int k) {
        if (root == null) {
            return -1;
        }
        int left = kthSmallest(root.left, k);
        if(left != -1)
            return left;
        count++;
        if(count == k)
            return root.data;
        return kthSmallest(root.right, k);
    }

    // Delete Node
    public Node delete(Node root, int key) {
        if(root == null) {
            return null;
        }
        if(key < root.data) {
            root.left = delete(root.left,key);
        }
        else if(key > root.data) {
            root.right = delete(root.right,key);
        }
        else {
            // Case 1: No child
            if(root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            if(root.left == null) {
                return root.right;
            }
            if(root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            Node successor = findMinimum(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    // Find Minimum
    public Node findMinimum(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        BSTree tree = new BSTree();
        Node root = null;
        root = tree.insert(root,50);
        tree.insert(root,30);
        tree.insert(root,70);
        tree.insert(root,20);
        tree.insert(root,40);
        tree.insert(root,60);
        tree.insert(root,80);
        System.out.println("Inorder:");
        tree.inorder(root);
        System.out.println("\nSearch 40:");
        System.out.println(tree.search(root,40));
        root = tree.delete(root,70);
        System.out.println("After deletion:");
        tree.inorder(root);
    }
}