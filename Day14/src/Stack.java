public class Stack<T> {
    LinkedList<T> linkedList=new LinkedList<>();
    //push
    public void add(T data)
    {
        linkedList.add(data);
    }
    //peek
    public T peek()
    {
        return linkedList.peek();
    }
    //pop
    public T pop()
    {
        return linkedList.pop();
    }
    //check is empty
    public boolean isEmpty()
    {
        return linkedList.isEmpty();
    }
    //display
    public void display()
    {
        linkedList.display();
    }
}
