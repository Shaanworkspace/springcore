package com.referenceTypeInject;

public class A {
    private int x;
    //Here B is a class
    private B objectB;

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", objectB=" + objectB +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getObjectB() {
        return objectB;
    }

    public void setObjectB(B objectB) {
        this.objectB = objectB;
    }

    public A(int x, B objectB) {
        this.x = x;
        this.objectB = objectB;
    }
}
