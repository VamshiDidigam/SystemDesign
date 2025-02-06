package org.example;

public class DoublyLinkedList {
    int val, key;
    DoublyLinkedList prev, next;

    DoublyLinkedList( int key, int val) {
        this.val = val;
        this.key = key;
        prev = null;
        next = null;
    }
}
