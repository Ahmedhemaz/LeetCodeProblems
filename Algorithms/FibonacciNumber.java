class Solution {
    HashMap map ;
    public Solution() {
        this.map = new HashMap<Integer,Integer>();
    }
    public int fib(int N) {
        if(N <= 1) {
            return N;
        }
        if(this.map.get(N) != null) {
            return (Integer) this.map.get(N);
        }else {
            this.map.put(N, fib(N-1)+fib(N-2));
        }
        return fib(N-1)+fib(N-2);
    }
}