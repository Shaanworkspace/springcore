package com.constructorInjection;

public class Person {
    private String name;
    private int personId;

    public Person(String name, int personId) {
        this.name = name;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "name='" + name + ':' +", personId=" + personId;
    }
}
