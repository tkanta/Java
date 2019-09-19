package com.algorithm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = Arrays.asList(0,0);
        
        for(int i=0,j = 0; i<a.size() & j<b.size(); i++, j++){
            if(a.get(i) < b.get(j)){
                result.set(1, result.get(1)+1 );
            }else if(a.get(i) > b.get(j)){
                result.set(0, result.get(0)+1); 
            }
        }
        return result;
    }
    
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));*/

        List<Integer> a = Arrays.asList(6,2,3) ;
        		
//        		Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());

        List<Integer> b = Arrays.asList(1,3,8) ;
        
//        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());

        try {
        	List<Integer> result = compareTriplets(a, b);
        	System.out.println(result);
        }catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
        

        
        
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
