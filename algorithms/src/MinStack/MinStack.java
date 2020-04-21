package algorithms.src.MinStack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();

    private Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
