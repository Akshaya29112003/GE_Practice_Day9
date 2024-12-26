public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue(){
        this.myLinkedList = new MyLinkedList<>();
    }

    public void Enqueue(INode new_node){
        myLinkedList.append(new_node);
    }

    public INode Dequeue(){
        return myLinkedList.popFirst();
    }

    public INode Peek(){
        return myLinkedList.head;
    }

    public void printStack(){
        myLinkedList.printMyNodes();
    }
}
