
public class MyBinaryTreeNode<T> {
    public T data;
    public MyBinaryTreeNode<T> left;
    public MyBinaryTreeNode<T> right;

    public MyBinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static void insertBinarySearchTreeNode(MyBinaryTreeNode<Integer> actual, MyBinaryTreeNode<Integer> node) {
        if (node.data < actual.data || node.data == actual.data) {
            if (actual.left != null) {
                insertBinarySearchTreeNode(actual.left, node);
            } else {
                actual.left = node;
            }
        } else if (actual.right != null) {
            insertBinarySearchTreeNode(actual.right, node);
        } else {
            actual.right = node;
        }
    }

    public void PrintInOrder(MyBinaryTreeNode<T> node) {
        if (node != null) {
            PrintInOrder(node.left);
            System.out.println("Node " + node.data);
            PrintInOrder(node.right);
        }
    }

    public void PrintPreOrder(MyBinaryTreeNode<T> node) {
        if(node != null) {
            System.out.println("Node " + node.data);
            PrintPreOrder(node.left);
            PrintPreOrder(node.right);
        }
    }

    public void PrintPostOrder(MyBinaryTreeNode<T> node) {
        if(node != null) {
            PrintPostOrder(node.left);
            PrintPostOrder(node.right);
            System.out.println("Node " + node.data);
        }
    }

    public static MyBinaryTreeNode<Integer> generateBinarySearchTree() {
        MyBinaryTreeNode<Integer> root = new MyBinaryTreeNode<>(8);
        insertBinarySearchTreeNode(root, new MyBinaryTreeNode<>(4));
        insertBinarySearchTreeNode(root, new MyBinaryTreeNode<>(10));
        insertBinarySearchTreeNode(root, new MyBinaryTreeNode<>(2));
        insertBinarySearchTreeNode(root, new MyBinaryTreeNode<>(6));
        insertBinarySearchTreeNode(root, new MyBinaryTreeNode<>(20));

        return root;
    }
}
