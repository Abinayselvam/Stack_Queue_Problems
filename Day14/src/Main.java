public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to tje Stack and Queue Problem");
        Stack<Integer> stack= new Stack<>();

        //push elements
        stack.push(40);
        stack.push(30);
        stack.push(10);
        System.out.println("The Stack elements:");
        stack.display();
    }
}