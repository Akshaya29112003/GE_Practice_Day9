import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest(){
        MyNode<Integer> myfirstnode = new MyNode<>(56);
        MyNode<Integer> mysecondnode = new MyNode<>(30);
        MyNode<Integer> mythirdnode = new MyNode<>(70);
        myfirstnode.setNext(mysecondnode);
        mysecondnode.setNext(mythirdnode);
        boolean result = myfirstnode.getNext().equals(mysecondnode) &&
                mysecondnode.getNext().equals(mythirdnode);
        Assert.assertTrue(result);
    }

}