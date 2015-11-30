package com.ahmed.learn.ocjp6.chapterone.child;

import com.ahmed.learn.ocjp6.chapterone.parent.Parent;

/**
 * Created by ahmed on 26.08.2015.
 */
public class Child extends Parent {

    void printX() {
        System.out.println(x);
    }

}

class ChildTest {

    public static void main(String[] args) {
        Child c = new Child();
        c.printX();
    }

}
