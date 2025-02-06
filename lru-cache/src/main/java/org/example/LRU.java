package org.example;

import java.util.*;

public class LRU {

    private int size;
    Map<Integer, DoublyLinkedList> map;
    DoublyLinkedList head, tail;

    LRU(int size) {
        this.size = size;
        map = new HashMap<>();
        head = new DoublyLinkedList(-1, -1);
        tail = new DoublyLinkedList(-1, -1);
        tail.prev = head;
        head.next = tail;
    }

    void add(int key, int val) {
        if(map.containsKey(key)) {
            // move node to head
            DoublyLinkedList node = map.get(key);
            node.val = val;
            moveNodetoHead(node);
        } else {
            if(map.size() >= size) {
                removeLRU();
            }

            DoublyLinkedList node = new DoublyLinkedList(key, val);
            map.put(key, node);
            addNodeToHead(node);
        }
    }

    int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }

        DoublyLinkedList node = map.get(key);
        moveNodetoHead(node);

        return node.val;
    }


    void addNodeToHead(DoublyLinkedList node) {
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    void moveNodetoHead(DoublyLinkedList node) {
        removeNode(node);
        addNodeToHead(node);
    }

    void removeNode(DoublyLinkedList node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void removeLRU() {
        DoublyLinkedList node = tail.prev;
        removeNode(node);
        map.remove(node.key);
    }
}
