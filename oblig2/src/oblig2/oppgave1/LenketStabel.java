package oblig2.oppgave1;

public class LenketStabel {
    private Node top;

    public LenketStabel() {
        this.top = null;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        this.top = newNode;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stabelen er tom");
        }
        // saves the data that will be popped
        char popped = top.data;
        this.top = top.next;
        return popped;
    }

    public boolean isEmpty() {
        return top == null;
    }
}