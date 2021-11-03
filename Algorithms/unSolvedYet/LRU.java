class LRUCache {

    public LRUCache(int capacity) {
        
    }
    
    public int get(int key) {
        
    }
    
    public void put(int key, int value) {
        
    }
}

class Node{
    public int value;
    public Node next;    
    public Node prev;
    public Node(int value){
        this.value = value;
    }
}

class MLinkedList {
    public Node head;
    public Node tails;
    public int size;
    public int capacity;
    public HashMap<Integer, Node> hmap;
    
    public MLinkedList(int capacity){
        this.capacity = capacity;
        this.size = 0;
        hmap = new HashMap<>();
    }
    
    public void put(int key, int value) {
        if(this.isEmpty()) {
            this.addWhileEmpty(key, value);
        }else if ( this.isFull()) {
            
        }else {
            
        }
        this.size++;
    }
    
    private void addWhileEmpty(int key, int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        hmap.put(key, node);
    }
    
    private void addWhileNotFull(int key, int value) {
        Node node = new Node(value);
        this.moveNodeToTail(node);
        this.hmap.put(key,node);
        
    }
    
    private void addWhileFull(int key, int value) {
        Node node = new Node(value);
        this.head = this.head.next;
        this.head.prev = null;
        this.hmap.delete(key);
        this.moveNodeToTail(node);
        this.hmap.put(key, node);
    }
    
    public void moveNodeToTail(Node node) {
        this.tail.next = node;
        node.prev = tail;
        this.tail = node;
    }
    
    
    private boolean isFull() {
        return this.size == this.capacity;
    }
    
    private boolean isEmpty() {
        return this.size == 0;
    }
    
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */