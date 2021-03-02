import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumberWhenAddedToLinkedListShouldAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.add(mySecondNode);
        myLinkList.add(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myThirdNode) &&
                         myLinkList.head.getNext().equals(mySecondNode) &&
                         myLinkList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberWhenAppendedToLinkedListShouldAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberWhenInsertedBetweenLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.append(myThirdNode);
        myLinkList.insertNode(myFirstNode,mySecondNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberWhenDeletedFirstNodePrintLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
        myLinkList.popFirst();
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(mySecondNode) &&
                myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberWhenDeletedLastNodePrintLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
        myLinkList.popLast();
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberWhenSearchNodePrintLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.searchValue(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberSearchAnumberAndInsertAnotherNumberProvided() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.searchValue(mySecondNode);
        if (result) {
            myLinkList.insertNode(mySecondNode, myFourthNode);
        }
        myLinkList.printMyNodes();
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberSearchAndDeleteNumberProvided() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myFourthNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.searchValue(myFourthNode);
        if (result)
            myLinkList.deleteNode(myFourthNode);
        myLinkList.printMyNodes();
        Assert.assertTrue(result);
    }
}