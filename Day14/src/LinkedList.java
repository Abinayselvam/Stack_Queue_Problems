public class LinkedList<T> {
    Node<T> head;

    //add
    public void add(T data)
    {
         Node<T> newNode= new Node<>(data);
        newNode.next=head;
        head=newNode;

    }
    //peek element
    public T peek()
    {
        if(head==null)
        {
            System.out.println("Stack is empty");
            return null;
        }
        return head.data;
    }
    //pop element
    public T pop()
    {
        if(head==null)
        {
            System.out.println("Stack is empty");
            return null;
        }
        T data=head.data;
        head=head.next;
        return data;
    }
    //check is this is empty
    public boolean isEmpty()
    {
        return  head==null;
    }
    //display
    public void display()
    {
        Node<T> temp=head;
        if(temp!=null)
        {
            System.out.println(temp.data);
            if(temp.next!=null)
            {
                System.out.println("->");
            }
            temp=temp.next;
        }
        System.out.println();
    }
}
