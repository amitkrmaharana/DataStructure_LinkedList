import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given3NumbersWhenlinkedShouldPassedLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecomdNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext((mySecomdNode));
        mySecomdNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecomdNode) &&
                mySecomdNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
