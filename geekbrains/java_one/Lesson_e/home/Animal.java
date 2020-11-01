package ru.geekbrains.java_one.lesson_e.home;

import java.util.Random;

public abstract class Animal {

    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_WTF = -1;

    private String type;
    private String name;
    private float maxRun;
    private float maxSwim;
    private float maxJump;
    private final Random random = new Random();

//    Animal(String type, String name, float maxJump, float maxRun, float maxSwim) {
//        this.type = type;
//        this.name = name;
//        this.maxJump = maxJump;
//        this.maxRun = maxRun;
//        this.maxSwim = maxSwim;
//    }

    Animal(String type, String name, float maxJump, float maxRun, float maxSwim) {
        this.type = type;
        this.name = name;
        this.maxJump = setVariativeValue(maxJump);
        this.maxRun = setVariativeValue(maxRun);
        this.maxSwim = setVariativeValue(maxSwim);
    }

    private float setVariativeValue(float value) {
        return value + (random.nextFloat() * value - (value / 2));
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    float getMaxJump() {
        return this.maxJump;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }

    protected boolean jump(float height) {
        return (height <= maxJump);
    }
}
