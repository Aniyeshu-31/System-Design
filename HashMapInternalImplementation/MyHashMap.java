package HashMapInternalImplementation;
public class MyHashMap<K,V> {
    class Entry<K,V> {
        K key;
        V value;
        Entry next;
        Entry(K key,V value) {
            this.key = key;
            this.value = value;
        }
    }
    public static int INITIAL_SIZE = 1 << 4;
    public static int MAXIMUM_SIZE = 1 << 30;
    public Entry[] hashtable;
    MyHashMap() {
        hashtable = new Entry[INITIAL_SIZE];
    }
    MyHashMap(int capacity) {
        int calculatedSize = tableSize(capacity);
        hashtable = new Entry[calculatedSize];
    }
    public final int tableSize(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
    
        return (n < 0) ? 1 : (n >= MAXIMUM_SIZE + 1) ? MAXIMUM_SIZE : n + 1;
    }
    public void put(K key,V value) {
         // calculate the hashcode of the key;
         int h;
         int hashcode = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        //  int hashcode = key.hashCode() % hashtable.length;
         Entry node = hashtable[hashcode];
         if(node == null) {
            Entry newNode = new Entry(key,value);
            hashtable[hashcode] = newNode;
         }else{
            Entry previousNode =node;
            while(node != null) {
                if(node.key ==key) {
                    node.value = value;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key,value);
            previousNode.next = newNode;
         }
    }
    public V get(K key) {
        int hashCode = key.hashCode() % hashtable.length;
        Entry node = hashtable[hashCode];
        while(node != null) {
            if(node.key.equals(key)){
                return (V)node.value;
            }
            node = node.next;
        }
        return null;
    }
}
