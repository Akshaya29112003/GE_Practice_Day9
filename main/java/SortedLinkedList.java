//public class SortedLinkedList<K> {
//    public INode<K> head;
//    public INode<K> tail;
//
//    public SortedLinkedList() {
//        this.head = null;
//        this.tail = null;
//    }
//
//    // Add method to insert elements in sorted order
//    public void add(INode<K> newNode) {
//        if (this.head == null || head.getKey().compareTo(newNode.getKey()) > 0) {
//            // Insert at the beginning if list is empty or newNode is smaller than head
//            newNode.setNext(this.head);
//            this.head = newNode;
//            if (this.tail == null) {
//                this.tail = newNode;
//            }
//        } else {
//            INode<K> current = this.head;
//            // Traverse and find the correct position for the new node
//            while (current.getNext() != null && current.getNext().getKey().compareTo(newNode.getKey()) <= 0) {
//                current = current.getNext();
//            }
//            newNode.setNext(current.getNext());
//            current.setNext(newNode);
//
//            // Update tail if the new node is added at the end
//            if (current.getNext() == null) {
//                this.tail = newNode;
//            }
//        }
//    }
//
//    public void printMyNodes() {
//        StringBuffer myNodes = new StringBuffer("My Nodes: ");
//        INode<K> tempNode = head;
//        while (tempNode != null) {
//            myNodes.append(tempNode.getKey());
//            if (tempNode.getNext() != null) {
//                myNodes.append("->");
//            }
//            tempNode = tempNode.getNext();
//        }
//        System.out.println(myNodes);
//    }
//}
