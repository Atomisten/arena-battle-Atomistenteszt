package main.java;

public class Human {
    private String name;
    private int life;

    public Human(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }
}
