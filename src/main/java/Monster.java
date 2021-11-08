package main.java;

import java.util.Random;

public class Monster {
    private String name;
    private int life;

    Random random = new Random();
    private final int specialAttack = random.nextInt(2)+3;

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }
}

