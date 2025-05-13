package linkedlist;

public class LinkedListClass<T> {
    private Node<T> first;
    private Node<T> last;
    private Integer size;

    public LinkedListClass() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }
    public void setFirst(Node<T> first) {
        this.first = first;
    }
    public Node<T> getLast() {
        return last;
    }
    public void setLast(Node<T> last) {
        this.last = last;
    }
    
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public void add(T node) {
        //TODO
    }

    public Node<T> get(int index) {
       return null;
    }

    public void remove(T node) {
        //TODO
    }

    public void print() {
        //TODO
    }
}
