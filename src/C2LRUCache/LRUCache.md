# LRUCache
![img.png](img.png)
## Examples
![img_1.png](img_1.png)


## Solution
For the Cache, we need always remove the most previous node when we add a new node.
Also, if we do any operation on any previous node, we need to change it to the most recent. -> Doubly linkedlist

Guarantee run in O(1) TC -> Hashmap

Always add at front and delete at tail -> Two Dummy nodes 

Front <=> A <=> B <=> C <=> Tail

#### add(newNode):  -> Always add at front
Front <=> newNode <=> A <=> B <=> C <=> Tail

    Node temp = front.next;
    front.next = newNode;
    newNode.next = temp;
    temp.prev = newNode;
    newNode.prev = fornt;
    
#### remove(B): -> remove node in any place
Front <=> A <=> C <=> Tail
    
    Node nodeNext = B.next;
    Node nodePrev = B.prev;
    nodePrev.next = nodeNext;
    nodeNext.prev = nodePrev;

### get(key) -> get value

If key exits, return the value of current node and move this node to the front

    Get the value of the current node -> Node = map.get(key);
    Remove this node -> remove(node);
    Add this node to the front -> add(node);
If key does not exit, return -1

    set -1 as default return.
### put(key, value) -> update / offer
Check if the key exit

    Node node = map.get(key);
If key exits(node != null) -> Update -> Change value -> Move to the front(remove + add)

    remove(node);
    node.val = value;
    add(node);                 // move to the front

If key does not exit(node == null) -> Offer a new node -> Check Cache capacity

    //If current map size == capacity -> remove from tail first
    map.remove(tail.prev.key); // remove from map
    remove(tail.prev);         // remove from cache
    // Offer the new node -> Add to both map and cache
    Node newNode = new Node();
    newNode.key = key;
    newNode.val = value;
    map.put(key, newNode);     // put method in Hashmap
    add(newNode);              // add to the front
    
    
