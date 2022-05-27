package C2LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> nodeMap;
    int cacheCapacity;
    public LRUCache(int capacity){
        nodeMap = new HashMap(capacity);
        this.cacheCapacity = capacity;
        // link the two dummy node
        // head <-> tail
        head.next = tail;
        tail.prev = head;


    }
    //Add the Node to the front of the Cache
    public void add(Node node){
        Node headNext = head.next;
        node.next = headNext;
        headNext.prev = node;
        head.next = node;
        node.prev = head;

    }
    public void remove(Node node){
        Node nextNode = node.next;
        Node prevNode = node.prev;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }
    public int get(int key){
        int res = -1;
        Node node = nodeMap.get(key);
        if(node != null){
            res = node.val;
            remove(node);
            add(node);
        }
        return res;
    }
    public void put(int key, int value){
        Node node = nodeMap.get(key);
        // update
        if(node != null){
            remove(node);
            node.val = value;
            add(node);
        }else{
            // check if reaches the capacity
            // if true -> remove from tail -> tail.prev
            if(nodeMap.size() == cacheCapacity){
                nodeMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            nodeMap.put(key, newNode);
            add(newNode);
        }
    }
    static class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }

}
