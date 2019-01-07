package com.algo.list;

import java.util.Iterator;
import java.util.LinkedList;

public class MergeSortedLinkList {


    private static LinkedList<Integer> mergeList(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> head = new LinkedList<>();
        int i=0, j=0;

        if(l1 != null && l2 != null){
            int l1_size = l1.size();
            int l2_size = l2.size();

        }

        return head;
    }
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(5);
        list1.add(7);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(100);
        list2.add(300);
        list2.add(4000);
        System.out.println(mergeList(list1, list2));
    }
}
