import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

//    @Test
//    public void AddingValuesToTheQueue(){
//        MyNode<Integer> myFirstNode = new MyNode<>(56);
//        MyNode<Integer> mySecondNode = new MyNode<>(30);
//        MyNode<Integer> myThirdNode = new MyNode<>(70);
//
//        MyQueue myQueue = new MyQueue();
//        myQueue.Enqueue(myFirstNode);
//        myQueue.Enqueue(mySecondNode);
//        myQueue.Enqueue(myThirdNode);
//
//        myQueue.printStack();
//
//        INode peek = myQueue.Peek();
//
//        Assert.assertEquals(myFirstNode, peek);
//    }

    @Test
    public void AddingValuesToTheQueue(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();
        myQueue.Enqueue(myFirstNode);
        myQueue.Enqueue(mySecondNode);
        myQueue.Enqueue(myThirdNode);

        System.out.println("Before Dequeue : ");
        myQueue.printStack();

        INode dequeued_node = myQueue.Dequeue();

        System.out.println("Dequeued Node : " + dequeued_node.getKey());

        System.out.println("After Dequeue : ");
        myQueue.printStack();

        Assert.assertEquals(myFirstNode, dequeued_node);
    }

}
