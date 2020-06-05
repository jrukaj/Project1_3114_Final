
class BinaryNode<T> {

    private student element;
    private BinaryNode<T> left;
    private BinaryNode<T> right;


    BinaryNode(student theElement) {
        element = theElement;
        left = null;
        right = null;
    }

   
    public student getElement() {
        return element;
    }


    public void setElement(student value) {
        element = value;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }


    public void setLeft(BinaryNode<T> value) {
        left = value;
    }

    public BinaryNode<T> getRight() {
        return right;
    }


    public void setRight(BinaryNode<T> value) { 
        right = value;
    }
}
