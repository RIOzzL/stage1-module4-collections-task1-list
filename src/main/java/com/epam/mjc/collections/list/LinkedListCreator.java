package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for (Integer integer : sourceList) {
            if (integer % 2 != 0) {
                resultList.add(0, integer);
            } else {
                resultList.add(integer);
            }
        }
        return resultList;
    }
}
