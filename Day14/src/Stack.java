public class Stack<T> {
    LinkedList<T> linkedList=new LinkedList<>();
    //Push operation
    public void push(T data)
    {
        linkedList.add(data);
    }
    //display operation
    public void display()
    {
        linkedList.display();
    }

}
