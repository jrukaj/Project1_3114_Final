
public class Proj1BST<T extends Comparable<? super T>>
implements BinarySearchTree<student> {

    private BinaryNode<T> root;

    public Proj1BST() {
        root = null; 
    }
    
    public void insert(student x) {
        root = (BinaryNode<T>)insert(x, root);
    }
    
    public void remove(student x) {
        if (x != null) {
            root = remove(x, root);
        }
    }
    
    public student findMin() {
        return elementAt(findMin(root));
    }
    
    public student findMax() {
        return elementAt(findMax(root));
    }
    
    public student find(student x) {
        return elementAt(find(x, root));
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private student elementAt(BinaryNode<T> node) {
        if (node == null)
            return null;
        else
            return node.getElement();
    }

    @SuppressWarnings("unchecked")
    private BinaryNode<student> insert(student x, BinaryNode<T> root2) {
        if (root2 == null) {
            return new BinaryNode<student>(x);
        }
        else if (x.compareTo(root2.getElement()) < 0) {
            root2.setLeft((BinaryNode<T>)insert(x, root2.getLeft()));
        }
        else if (x.compareTo(root2.getElement()) > 0) {
            root2.setRight((BinaryNode<T>)insert(x, root2.getRight()));
        }
        return (BinaryNode<student>)root2;
    }

    private BinaryNode<T> remove(student x, BinaryNode<T> node) {
        BinaryNode<T> result = node;

        if (node == null) {
        }

        if (x.compareTo(node.getElement()) < 0) {
            node.setLeft(remove(x, node.getLeft()));
        }
        else if (x.compareTo(node.getElement()) > 0) {
            node.setRight(remove(x, node.getRight()));
        }
        else {
            if (node.getLeft() != null && node.getRight() != null) {
                BinaryNode<T> temp = node.getRight();
                temp.setLeft(node.getLeft());
                result = temp;
            }
            else if (node.getLeft() != null) {
                result = node.getLeft();
            }
            else {
                result = node.getRight();
            }
        }
        return result;
    }

    private BinaryNode<T> findMin(BinaryNode<T> node) {
        if (node == null) {
            return node;
        }
        if (node.getLeft() == null) {
            return node;
        }
        else {
            return findMin(node.getLeft());

        }

    }

    private BinaryNode<T> findMax(BinaryNode<T> node) {
        if (node == null) {
            return node;
        }
        else if (node.getRight() == null) {
            return node;
        }
        else {
            return findMax(node.getRight());
        }
    }


    private BinaryNode<T> find(student x, BinaryNode<T> node) {
        if (node == null) {
            return null; // Not found
        }
        else if (x.compareTo(node.getElement()) < 0) {
            return find(x, node.getLeft());
        }
        else if (x.compareTo(node.getElement()) > 0) {
            return find(x, node.getRight());
        }
        else {
            return node; 
        }
    }


}
