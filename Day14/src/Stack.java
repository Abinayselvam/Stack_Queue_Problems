public class Stack<T> {
    LinkedList<T> linkedList =
            new LinkedList<>();

    // Push
    public void push(T data) {

        linkedList.add(data);
    }

    // Peek
    public T peek() {

        return linkedList.peek();
    }

    // Pop
    public T pop() {

        return linkedList.pop();
    }

    // Empty check
    public boolean isEmpty() {

        return linkedList.isEmpty();
    }

    // Display
    public void display() {

        linkedList.display();
    }
}
