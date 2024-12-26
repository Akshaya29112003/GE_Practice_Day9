public class MyStack {
    private final MyLinkedList myLinkedList;
    public MyStack(){
        this.myLinkedList = new MyLinkedList<>();
    }
    public void push(INode new_node) {
        myLinkedList.add(new_node);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode peek() {
        return myLinkedList.head;
    }

    public INode pop() {
       return myLinkedList.popFirst();
    }
}
