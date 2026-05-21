public class Queue<T> {
    LinkedList<T> linkedList =
            new LinkedList<>();

    // Enqueue
    public void enqueue(T data) {

        linkedList.append(data);
    }
    public T dequeue()
    {
       return linkedList.pop();
    }
    public boolean isEmpty()
    {
        return linkedList.isEmpty();
    }

    // Display queue
    public void display() {

        linkedList.display();
    }
}
