public class LinkedList<T> {
    Node<T> head;
    //Add element
    public void add(T data)
    {
        Node<T> newNode=new Node<>(data);
        newNode.next=head;
        head=newNode;
    }
    // Peek top element
    public T peek() {

        if (head == null) {
            System.out.println("Stack is Empty");
            return null;
        }

        return head.data;
    }

    // Pop top element
    public T pop() {

        if (head == null) {
            System.out.println("Stack is Empty");
            return null;
        }

        T data = head.data;

        head = head.next;

        return data;
    }

    // Check empty
    public boolean isEmpty() {

        return head == null;
    }

    // Display stack
    public void display() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}
