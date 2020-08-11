class MinStack {

    /** initialize your data structure here. */
    List stack;
    public MinStack() {
        this.stack = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        this.stack.add(x);
    }
    
    public void pop() {
        this.stack.remove(this.stack.size() - 1);
    }
    
    public int top() {
        return (int) this.stack.get(this.stack.size() - 1);
    }
    
    public int getMin() {
        return (int) Collections.min(this.stack);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */