public class Stack {
    int top;
    int[] stack;
    int size;
    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public int getTop() {
        return stack[top];
    }
    public int[] getStack() {
        return stack;
    }
    public String toString() {
        String result = "";
        for (int i = 0; i < stack.length; i++) {
            result += stack[i] + " ";
        }
        return result;
    }
    public void push(int value) {
        if (top == size-1) {
            System.out.println("Stack is full");
        }
        else {
            top++;
            stack[top] = value;
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            int[] newArray = new int[size-1];
            int value = stack[top];
            for (int i = 0; i<stack.length-1; i++) {
                if (i == top) {
                    continue;
                }
                newArray[i] = stack[i];
            }
            stack = newArray;
            top--;
            return value;
        }
    }
    
}
