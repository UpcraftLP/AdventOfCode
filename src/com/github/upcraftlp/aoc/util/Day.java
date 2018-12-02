package com.github.upcraftlp.aoc.util;

public abstract class Day {

    public void doTasks() {
        System.out.printf("%s:", getClass().getSimpleName());
        System.out.println();
        this.doPartA();
        System.out.println();
        this.doPartB();
        System.out.println();
        System.out.println();
    }

    protected abstract void doPartA();
    protected abstract void doPartB();
}
