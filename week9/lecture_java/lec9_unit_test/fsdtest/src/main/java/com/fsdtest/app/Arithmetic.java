package com.fsdtest.app;

public class Arithmetic {
    private int x;
    private int y;

    public Arithmetic() {}

    public Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add(int x, int y) {
        return x+y;
    }

    public int sub(int x, int y) {
        return x-y;
    }

    public int mul(int x, int y) {
        return x*y;
    }

    public int div(int x, int y) {
        return x/y;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
