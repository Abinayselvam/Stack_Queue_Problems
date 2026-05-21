public class Queue<T> {
    LinkedList<T> linkedList =
            new LinkedList<>();

    // Enqueue
    public void enqueue(T data) {

        linkedList.append(data);
    }

    // Display queue
    public void display() {

        linkedList.display();
    }
}
