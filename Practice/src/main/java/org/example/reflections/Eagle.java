package org.example.reflections;

public class Eagle {

    private boolean canFly;

    public Eagle(boolean canFly) {
        this.canFly = canFly;
    }

    public void fly() {
        if (canFly) {
            System.out.println("can fly");
        } else {
            System.out.println("can't fly");
        }
    }
}
