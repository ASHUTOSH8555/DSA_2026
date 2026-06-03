package HashMap;
import java.util.*;
public class HashMapImplementation {
    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i=0; i< buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key==key) {
                    return i;
                }
            }
            return -1;
        }

        private int HashFunction(K key){
            int hc=key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY); // N → capacity of buckets array
        }

        public void rehash(){
            LinkedList<Node>[] oldBuckets=buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for(var buckets : oldBuckets){
                for(var node : buckets){
                    put(node.key , node.value);
                }
            }
        }

        public int size(){
            return n;
        }
        public void put(K key, V value){
            int bi= HashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei= searchInBucket(currBucket, key);
            if(ei == -1){
                Node node=new Node(key, value);
                currBucket.add(node);
                n++;
            }
            else{
                Node currNode= currBucket.get(ei);
                currNode.value=value;
            }

            if(n >= buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }
        public V get(K key){
            int bi=HashFunction(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket, key);
            if(ei !=-1 ){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }
        public V remove(K key){
            int bi=HashFunction(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket, key);
            if(ei != -1){
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }
    public static void main(String[] args){
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("s", 3);
        mp.put("f", 4);
        mp.put("g", 7);
        System.out.println("Testing size : " + mp.size());
        mp.put("s", 30);
        System.out.println("Testing size "+ mp.size());

        // Testing get

        System.out.println(mp.get("a"));
        System.out.println(mp.get("s"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("f"));
        System.out.println(mp.get("Ashutosh"));

        // Testing Remove
        System.out.println(mp.remove("s"));
        System.out.println(mp.remove("s"));
        System.out.println(mp.size());
        System.out.println(mp.get("g"));
    }
}
