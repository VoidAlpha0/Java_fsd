package test3;


class Stack {
    private int maxSize; // Maximum size of the stack
    private int top; // Index of the top element
    private int[] stackArray; // Array to store the elements of the stack

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }

    public void push(int element) {
        if (top>=maxSize-1) {
            System.out.println("Stack is full. Cannot push element: " + element);
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    public int pop() {
        if (top<0) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }
}

public class practice_project8 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.pop();
        stack.pop();

        stack.push(50);
        stack.push(60);
        stack.push(70);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
