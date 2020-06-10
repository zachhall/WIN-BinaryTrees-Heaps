public class Node {

    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        right = null;
        left = null;
    }

    Node() {
        right = null;
        left = null;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value); // recursively continuing down the tree
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    private static Node createBinaryTree() {
        Node bt = new Node();

        bt.insert(50);
        bt.insert(84);
        bt.insert(24);
        bt.insert(52);
        bt.insert(12);
        bt.insert(64);
        bt.insert(99);
        bt.insert(1);

        return bt;
    }

    public static void main(String[] args) {
        Node bt = createBinaryTree();

        bt.printInOrder();

    }
}