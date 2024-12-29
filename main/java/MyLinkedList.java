public class MyLinkedList<K extends Comparable<K>> {
    public INode tail;
    public INode head;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(this.head == null)
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode newNode){
        if(this.head == null)
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode myNode, INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode popFirst(){
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        INode lastNode = this.tail;
        this.tail = tempNode;
        tempNode.setNext(null);
        return lastNode;
    }

    public INode Search(INode existing_key){
        INode tempKey = this.head;
        while(tempKey != null){
            if(tempKey.equals(existing_key))
                return tempKey;
            tempKey = tempKey.getNext();
        }
        return null;
    }

    public INode Delete(INode existing_key){
        INode currnode = this.head;
        INode prevnode = null;

        while (!currnode.equals(existing_key)){
            prevnode = currnode;
            currnode = currnode.getNext();
        }

        prevnode.setNext(currnode.getNext());
        return currnode;
    }

    public void Sorting() {
        if (head == null || head.getNext() == null) {
            return; // Already sorted or empty
        }

        // Bubble sort implementation for linked list
        boolean swapped;
        do {
            swapped = false;
            INode<K> current = head;
            while (current.getNext() != null) {
                INode<K> nextNode = current.getNext();
                if (current.getKey().compareTo(nextNode.getKey()) > 0) {
                    // Swap the keys
                    K tempKey = current.getKey();
                    current.setKey(nextNode.getKey());
                    nextNode.setKey(tempKey);
                    swapped = true;
                }
                current = current.getNext();
            }
        } while (swapped);
    }
    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))  myNodes.append("->");
            tempNode = tempNode.getNext();
        }

        myNodes.append((tempNode.getKey()));
        System.out.println(myNodes);
    }

    @SuppressWarnings("unchecked")
    public MyMapNode<K, ?> Search_Map(K key) {
        INode<K> tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) { // Compare the keys
                return (MyMapNode<K, ?>) tempNode; // Return the matching node
            }
            tempNode = tempNode.getNext();
        }
        return null; // Return null if no match is found
    }

    @Override
    public String toString(){
        return "MyLinkedListNodes{" + head + "}";
    }
}
