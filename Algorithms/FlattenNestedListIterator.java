/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    private List<NestedInteger> nestedList ;
    private Queue<Integer> queue;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.queue = new LinkedList<>();
        this.flatNestedListToStack(nestedList);
    }

    @Override
    public Integer next() {
        return this.queue.poll();
        
    }

    @Override
    public boolean hasNext() {
        Iterator iterator = this.queue.iterator();
        return iterator.hasNext();
    }
    
    private void flatNestedListToStack(List<NestedInteger> nestedList){
        Iterator iterator = nestedList.iterator();
        while(iterator.hasNext()){
            NestedInteger ni =(NestedInteger) iterator.next();
            if(ni.isInteger()){
                this.queue.add(ni.getInteger()); 
            }else{
                this.flatNestedListToStack(ni.getList());
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */