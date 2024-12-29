import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
//    @Test
//    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop(){
//        MyNode<Integer> myfirstnode = new MyNode<>(70);
//        MyNode<Integer> mysecondnode = new MyNode<>(30);
//        MyNode<Integer> mythirdnode = new MyNode<>(56);
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(myfirstnode);
//        myLinkedList.add(mysecondnode);
//        myLinkedList.add(mythirdnode);
//        myLinkedList.printMyNodes();
//        boolean result = myLinkedList.head.equals(mythirdnode) &&
//                myLinkedList.head.getNext().equals(mysecondnode) &&
//                myLinkedList.tail.equals(myfirstnode);
//        Assert.assertTrue(result);
//
//    }
//
//    @Test
//    public void given3NumbersWhenAppendedShoutdBeAddedTOLast() {
//        MyNode<Integer> myFirstNode = new MyNode<>(56);
//        MyNode<Integer> mySecondNode = new MyNode<>(30);
//        MyNode<Integer> myThirdNode = new MyNode<>(70);
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(myFirstNode);
//        myLinkedList.append(mySecondNode);
//        myLinkedList.append(myThirdNode);
//        myLinkedList.printMyNodes();
//        boolean result = myLinkedList.head.equals(myFirstNode) &&
//                myLinkedList.head.getNext().equals(mySecondNode) &&
//                myLinkedList.tail.equals(myThirdNode);
//        Assert.assertTrue(result);
//    }

//    @Test
//    public void given3NumbersWhenInsertingSecondInBetweenShoutdPassLinkedListResutt() {
//        MyNode<Integer> myFirstNode = new MyNode<>(56);
//        MyNode<Integer> mySecondNode = new MyNode<>(30);
//        MyNode<Integer> myThirdNode = new MyNode<>(70);
//        MyNode<Integer> myForthNode = new MyNode<>(40);
//
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(myFirstNode);
//        myLinkedList.append(mySecondNode);
//        myLinkedList.append(myThirdNode);
//
//        System.out.println("Before Inserting : ");
//        myLinkedList.printMyNodes();
//
//        myLinkedList.insert(mySecondNode, myForthNode);
//
//        System.out.println("After Inserting : ");
//        myLinkedList.printMyNodes();
//
//        boolean result = myLinkedList.head.equals(myFirstNode) &&
//                myLinkedList.head.getNext().equals(mySecondNode) &&
//                mySecondNode.getNext().equals(myForthNode) &&
//                myLinkedList.tail.equals(myThirdNode);
//        Assert.assertTrue(result);
//    }

//    @Test
//    public void DeletingFirstNode() {
//        MyNode<Integer> myFirstNode = new MyNode<>(56);
//        MyNode<Integer> mySecondNode = new MyNode<>(30);
//        MyNode<Integer> myThirdNode = new MyNode<>(70);
//
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(myFirstNode);
//        myLinkedList.append(mySecondNode);
//        myLinkedList.append(myThirdNode);
//
//        System.out.println("Before Popping : ");
//        myLinkedList.printMyNodes();
//
//        INode res = myLinkedList.popFirst();
//        System.out.println("Popped 1st Node is : " + res.getKey());
//
//        System.out.println("After Popping : ");
//        myLinkedList.printMyNodes();
//
//        boolean result = myLinkedList.head.equals(mySecondNode) &&
//                myLinkedList.tail.equals(myThirdNode);
//        Assert.assertTrue(result);
//    }

//    @Test
//    public void DeletingLastNode() {
//        MyNode<Integer> myFirstNode = new MyNode<>(56);
//        MyNode<Integer> mySecondNode = new MyNode<>(30);
//        MyNode<Integer> myThirdNode = new MyNode<>(70);
//
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(myFirstNode);
//        myLinkedList.append(mySecondNode);
//        myLinkedList.append(myThirdNode);
//
//        System.out.println("Before Popping : ");
//        myLinkedList.printMyNodes();
//
//        INode res = myLinkedList.popLast();
//        System.out.println("Popped 1st Node is : " + res.getKey());
//
//        System.out.println("After Popping : ");
//        myLinkedList.printMyNodes();
//
//        boolean result = myLinkedList.head.equals(myFirstNode) &&
//                myLinkedList.tail.equals(mySecondNode);
//        Assert.assertTrue(result);
//    }

    @Test
    public void SearchingNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        INode res = myLinkedList.Search(mySecondNode);
        System.out.println("Searched Node is : " + res.getKey());

        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

//    @Test
//    public void DeleteMiddleNode() {
//        MyNode<Integer> myFirstNode = new MyNode<>(56);
//        MyNode<Integer> mySecondNode = new MyNode<>(30);
//        MyNode<Integer> myThirdNode = new MyNode<>(40);
//        MyNode<Integer> myForthNode = new MyNode<>(70);
//
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(myFirstNode);
//        myLinkedList.append(mySecondNode);
//        myLinkedList.append(myThirdNode);
//        myLinkedList.append(myForthNode);
//
//        System.out.println("Before Deleting : ");
//        myLinkedList.printMyNodes();
//
//        INode res = myLinkedList.Delete(myThirdNode);
//        System.out.println("Node to be Deleted : " + res.getKey());
//
//        System.out.println("After Deleting : ");
//        myLinkedList.printMyNodes();
//
//        boolean result = myLinkedList.head.equals(myFirstNode) &&
//                myLinkedList.head.getNext().equals(mySecondNode) &&
//                mySecondNode.getNext().equals(myForthNode);
//        Assert.assertTrue(result);
//    }

//    @Test
//    public void SortingLinkedList() {
//        MyNode<Integer> myFirstNode = new MyNode<>(56);
//        MyNode<Integer> mySecondNode = new MyNode<>(30);
//        MyNode<Integer> myThirdNode = new MyNode<>(40);
//        MyNode<Integer> myForthNode = new MyNode<>(70);
//
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(myFirstNode);
//        myLinkedList.append(mySecondNode);
//        myLinkedList.append(myThirdNode);
//        myLinkedList.append(myForthNode);
//
//        System.out.println("Before Sorting : ");
//        myLinkedList.printMyNodes();
//
//        myLinkedList.Sorting();
//
//        System.out.println("After Sorting : ");
//        myLinkedList.printMyNodes();
//
//        boolean result = mySecondNode.getNext().equals(myThirdNode) &&
//                myForthNode.getNext() == null; // Check last node points to null
//
//        Assert.assertTrue(result);
//
//    }
}