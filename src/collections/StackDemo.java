package collections;

public class StackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        // push
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("현재 스택: " + stack);   // [A, B, C]

        // peek
        System.out.println("peek: " + stack.peek()); // C (가장 위)

        // pop
        while (!stack.empty()) {
            System.out.println("pop: " + stack.pop());
        }

        System.out.println("현재 스택: " + stack);   // []
        System.out.println("스택이 비었나요? " + stack.empty()); // true
    }
}