package stack.minimumstack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> numbersStack;
    private Stack<Integer> minStack;
    public MinStack() {
        numbersStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.isEmpty()) {
            minStack.push(val);
        }
        else {
            minStack.push(Math.min(minStack.peek(), val));
        }

        numbersStack.push(val);
    }

    public void pop() {
        if (!numbersStack.isEmpty()) {
            numbersStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (numbersStack.isEmpty()) {
            return 0;
        }

        return numbersStack.peek();
    }

    public int getMin() {
        if (numbersStack.isEmpty()) {
            return 0;
        }

        return minStack.peek();
    }
}
