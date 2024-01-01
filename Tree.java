public class Tree {
    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
    
        return current;
    }
    public static Tree createBinaryTree() {
        Tree bt = new Tree();
    
        bt.add(22);
        bt.add(10);
        bt.add(8);
        bt.add(6);
        bt.add(2);
        bt.add(7);
        bt.add(15);
        bt.add(11);
        bt.add(13);
        bt.add(12);
        bt.add(14);
        bt.add(36);
        bt.add(26);
        bt.add(24);
        bt.add(28);
        bt.add(27);
        bt.add(30);
        bt.add(29);
        bt.add(32);
        bt.add(40);
        bt.add(45);
        bt.add(48);
        bt.add(46);
        bt.add(50);
    
        return bt;
    }
    int totalNodes(Node root)
    {
        if (root == null)
            return 0;
     
        int l = totalNodes(root.left);
        int r = totalNodes(root.right);
     
        return 1 + l + r;
    }
    private int leafNodes; 
    private int twigNodes;
    public int numLeafNodes(Node root){ 
        leafNodes = 0; 
        treeTraversal(root); 
        return leafNodes; 
    } 
    public int numTwigNodes(Node root){ 
        twigNodes = 0; 
        treeTraversal(root); 
        return twigNodes; 
    }
     
    //Inorder traversal of the tree. 
    private void treeTraversal(Node root){ 
        if(root == null) return; 
        treeTraversal(root.left); 
        if(root.left == null && root.right == null){ 
            leafNodes += 1; 
        } 
        if(root.left == null || root.right == null){ 
            
            if (root.left != null) {
                if(root.left.left != null && root.left.right != null)  {
                    twigNodes += 1;
                }
            }
            else if (root.right != null) {
                if(root.right.left != null && root.right.right != null)  {
                    twigNodes += 1;
                }
            }
    
        }
        
        treeTraversal(root.right); 
    } 

    public void add(int value) {
        root = addRecursive(root, value);
    }
}
