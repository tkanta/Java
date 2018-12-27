package com.algo.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindCountAndSeqOfNumber {

    /**
     * get sequence number {100, 2, 1, 200, 3, 4 }
     * @param number
     */
    private static void getSequence(Integer[] number){
        Set<Integer> numberSet = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        for(Integer n : number){
            numberSet.add(n);
        }
        int max = 0;


        System.out.println(numberSet);


        for(Integer n : number){
            Integer left = n - 1;
            Integer right = n + 1;
            int count = 1;
            boolean seqFound = false;

            StringBuilder str = new StringBuilder(String.valueOf(n));

            while(numberSet.contains(left)){
                count++;
                numberSet.remove(left);
                str.insert(0, left+",");
                left--;
                seqFound = true;
            }

            while(numberSet.contains(right)){
                count++;
                numberSet.remove(right);
                str.append(",").append(right);
                right++;
                seqFound = true;
            }

            if(seqFound){
                System.out.println("sequence numbers : "+ str.toString());
                numberSet.remove(n);
                max = max + count;
            }
        }

        System.out.println("sequence number size : "+ max);

    }

    public static void main(String args[]){
            Integer[] seq = { 1, 2, 3,  200, 5, 101, 99, 6};
            getSequence(seq);
    }
}
