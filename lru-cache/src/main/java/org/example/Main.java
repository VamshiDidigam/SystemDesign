package org.example;

public class Main {
    public static void main(String[] args) {

        LRU lru = new LRU(3);

        lru.add(1, 111);
        lru.add(2,123);

        System.out.println(lru.get(2));
        lru.add(3,323);
        lru.add(4,413);
        lru.add(5,5234);
        System.out.println(lru.get(1));
    }
}