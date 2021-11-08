package main.java;

public class ArenaGame {
    public static void main(String[] args) throws InterruptedException {
        Arena arena = new Arena();
        Human human = new Human("Bob");
        Monster monster = new Monster("Susan");
        arena.setHuman(human);
        arena.setMonster(monster);
        arena.letsBattle();
    }
}
