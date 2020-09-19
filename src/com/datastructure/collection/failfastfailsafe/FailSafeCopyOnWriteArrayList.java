package com.datastructure.collection.failfastfailsafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeCopyOnWriteArrayList {

	public static void main(String args[]) 
    { 
        CopyOnWriteArrayList<Integer> list 
            = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 }); 
        iterate(list); 
        System.out.println();
        iterate(list);
    }

	private static void iterate(CopyOnWriteArrayList<Integer> list) {
		Iterator<Integer> itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer no = (Integer)itr.next(); 
            System.out.print(no+","); 
            if (no == 8) 
  
                // This will not print, 
                // hence it has created separate copy 
                list.add(14); 
        }
	} 
}
