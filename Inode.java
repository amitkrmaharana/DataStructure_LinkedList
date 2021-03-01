
public interface Inode<K> {
    K getKey();
    void setKey(K key);

    Inode getNext();
    void setNext(Inode next);
}
