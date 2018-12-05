package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {

    public static void main(String[] args) {
        List<String> pointList = new ArrayList();
        pointList.add("1");
        pointList.add("2");
        pointList.forEach(p ->  {
                    System.out.println(p);
                    //Do more work
                }
        );
    }
}
