package HashMapInternalImplementation;
public class HashMapImplementation {
    public static void main(String[] args) {
        MyHashMap<Integer,Integer> map = new MyHashMap<Integer,Integer>(7);
        map.put(1,1);
        map.put(2,2);
        map.put(3,100);
        map.put(4,200);
        int value = map.get(2);
        System.out.println(value);
    }

}
