public class MyLinkedList {
    public Inode head;
    public Inode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Inode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            Inode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(Inode newNode) {
        if(this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public void insertNode(Inode myNode,Inode newNode) {
        Inode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public void popFirst() {
        this.head = this.head.getNext();
    }
    public void popLast() {
        Inode tempNode = head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
    }
    public boolean searchValue(Inode key) {
        Inode tempNode = head;
        while(tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey() == key.getKey()) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }
    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My nodes: ");
        Inode tempNode= head;
        while(tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}