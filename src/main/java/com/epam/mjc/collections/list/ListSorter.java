package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListSorter {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("-5", "-12", "0", "20", "9", "-20", "37"));
        ListSorter listSorter = new ListSorter();
        Collections.sort(list, new ListComparator());
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int valueA = 5 * aInt * aInt + 3;
        int valueB = 5 * bInt * bInt + 3;
        if (Math.abs(aInt) == Math.abs(bInt)) {
            return aInt > bInt ? 1 : -1;
        } else {
            if (valueA > valueB) {
                return 1;
            } else if (valueA < valueB) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
