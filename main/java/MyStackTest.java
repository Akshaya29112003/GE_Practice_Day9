import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
//    @Test
//    public void AddingValuesToTheStack(){
//        MyNode<Integer> myFirstNode = new MyNode<>(70);
//        MyNode<Integer> mySecondNode = new MyNode<>(30);
//        MyNode<Integer> myThirdNode = new MyNode<>(56);
//        MyStack myStack = new MyStack();
//        myStack.push(myFirstNode);
//        myStack.push(mySecondNode);
//        myStack.push(myThirdNode);
//
//        myStack.printStack();
//
//        INode peek = myStack.peek();
//
//        Assert.assertEquals(myThirdNode, peek);
//    }

    @Test
    public void PopValuesFromStack(){

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

        System.out.println("Before Popping : ");
        myStack.printStack();

        INode pop_value = myStack.pop();

        System.out.println("Popped Value : " + pop_value.getKey());

        System.out.println("After Popping : ");
        myStack.printStack();

        Assert.assertEquals(myThirdNode, pop_value);

    }
}
