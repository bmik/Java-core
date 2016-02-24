package com.ahmed.learn.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ahmed on 30.09.2015.
 */
public class SimpleLambda {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "e", "b");

        list.forEach(s -> {
            s = s.toUpperCase();
            System.out.println(s);
        });

        list.sort(String::compareTo);

        System.out.println(Arrays.toString(list.toArray()));

    }

}
