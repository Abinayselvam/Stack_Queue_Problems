public class LinkedList<T> {
    Node<T> head;

    public void add(T data)
    {
        Node<T> newNode=new Node<>(data);
        newNode.next=head;
        head=newNode;
    }

    public void  display()
    {
        Node<T> temp = head;
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
