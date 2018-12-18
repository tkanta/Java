package com.algo.list;

public class LinkListReverseTest {
    public static void main(String args[]) {
        LinkListReverse<String> linkedlist = getDefaultList();
        System.out.println("linked list before reversing : " + linkedlist);
        linkedlist.reverseIteratively();
        System.out.println("linked list after reversing : " + linkedlist);
        linkedlist.reverseRecursively();
        System.out.println("linked list after reversing recursively: " + linkedlist);
    }

    private static LinkListReverse getDefaultList() {
        LinkListReverse<String> linkedlist = new LinkListReverse<>();
        linkedlist.append("A");
        linkedlist.append("B");
        linkedlist.append("C");
        linkedlist.append("D");
        linkedlist.append("E");
        linkedlist.append("F");
        return linkedlist;
    }
}