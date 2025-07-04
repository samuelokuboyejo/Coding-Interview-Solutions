package leetcode;

public class Stack {

    public static final int MAX = 500;
    int top;
    int a[] = new int[MAX];

    public boolean isEmpty(){
        return (top < 0);
    }

    Stack(){
        top = -1;
    }

    public boolean push(int x){
        if (top >= (MAX -1)){
            System.out.println("leetcode.Stack Overflow");
            return false;
        }else {
            top += 1;
            a[top] = x;

            System.out.println(x + " pushed into the stack");
            return true;

        }
    }

    public int pop(){
        if (top< 0){
            System.out.println("leetcode.Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            top += -1;
            return x;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("leetcode.Stack is empty");
            return;
        }

        System.out.println("Items in the stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {
        Stack myStack = new Stack();

        System.out.println("Is leetcode.Stack empty? " + myStack.isEmpty());

        myStack.push(12);
        myStack.push(22);
        myStack.push(13);
        myStack.push(16);
        myStack.push(15);

        System.out.println("Is leetcode.Stack empty? " + myStack.isEmpty());


        System.out.println("This item was popped: " + myStack.pop());
        System.out.println("This item was popped: " + myStack.pop());

        myStack.push(24);

        myStack.printStack();
    }
}
