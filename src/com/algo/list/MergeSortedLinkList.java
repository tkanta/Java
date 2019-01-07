package com.algo.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MergeSortedLinkList {


    private static LinkedList<Integer> mergeList(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> head = new LinkedList<>();
        int i=0, j=0;

        if(l1 != null && l2 != null){
            int l1_size = l1.size();
            int l2_size = l2.size();

            while(i < l1_size && j < l2_size){
                if(l1.get(i).intValue() < l2.get(j).intValue() ){
                    head.add(l1.get(i));
                    i++;
                }else{
                    head.add(l2.get(j));
                    j++;
                }
            }

            while(i < l1_size ){
                head.add(l1.get(i));
                i++;
            }

            while(j < l2_size){
                head.add(l2.get(j));
                j++;
            }
        }

        return head;
    }
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(200);
        list1.add(300);
        list1.add(700);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(100);
        list2.add(300);
        list2.add(4000);
        list2.add(7000);
        System.out.println(Arrays.asList(mergeList(list1, list2)));
    }
}
