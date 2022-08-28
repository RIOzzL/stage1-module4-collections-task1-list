package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {

    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i += 3) {
            list.add(sourceList.get(i));
            list.add(sourceList.get(i));
        }
        System.out.println(list);
        return list;
    }
}
