class MyStack {
    private int[] stack;
    private int top;
    public MyStack() {
        stack = new int[1000];
        top = -1;
    }
    
    public void push(int x) {
        stack[++top] = x;
    }
    
    public int pop() {
        return stack[top--];
        
    }
    
    public int top() {
        return stack[top];
    }
    
    public boolean empty() {
        
        return top == -1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */