package com.ahmed.learn.ocjp6.chapterone.animals;

/**
 * Created by ahmed on 03.09.2015.
 */
enum Animal {

    DOG("woof"),
    CAT("miow"),
    FISH("burble");

    String sound;

    Animal(String s) {
        sound = s;
    }
}

class AnimalTest {

    static Animal a;
    public static void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);

    }
}
