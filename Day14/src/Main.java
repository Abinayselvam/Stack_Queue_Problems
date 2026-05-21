public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to tje Stack and Queue Problem");
        Stack<Integer> stack=new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Initial Stack:");

        stack.display();

        // Peek top
        System.out.println("\nPeek Element: "
                + stack.peek());

        // Pop until empty
        System.out.println("\nPopping Elements:");

        while (!stack.isEmpty()) {

            System.out.println("Popped: "
                    + stack.pop());

            System.out.print("Current Stack: ");

            stack.display();
        }
    }

}