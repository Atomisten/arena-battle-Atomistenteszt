package main.java;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Arena {
    private Human human;
    private Monster monster;

    public Arena() {
    }

    public void letsBattle() throws InterruptedException {
        int round = 0;
        Random random = new Random();
        int humanHit;
        int monsterHit;
        human.setLife(100);
        monster.setLife(100);


        while (human.getLife() > 0 && monster.getLife() > 0) {
            round++;
            System.out.println("Round " + round);
            humanHit = random.nextInt(11);
            monsterHit = random.nextInt(11);
            human.setLife(human.getLife() - monsterHit);
            monster.setLife(monster.getLife() - humanHit);
            System.out.println("Monster damage: " + monsterHit + ", Human has " + human.getLife() + " life left.");
            if (round % monster.getSpecialAttack() == 0) {
                human.setLife(human.getLife() - 1);
                System.out.println("Monster used special attack in round " + round + ", dealing 1 damage on human.");
            }

            System.out.println("Human damage: " + humanHit + ", Monster has " + monster.getLife() + " life left.");
            System.out.println();
            TimeUnit.SECONDS.sleep(3);
        }
        if (human.getLife() <= 0 && monster.getLife() <= 0) {
            System.out.println("it's a DRAW!");
        } else if (human.getLife() <= 0) {
            System.out.println(monster.getName() + " the Monster WINS");
        } else {
            System.out.println(human.getName() + " the Human WINS");
        }
        System.out.println("Monster life: " + monster.getLife());
        System.out.println("Human life: " + human.getLife());
        System.out.println("Total rounds: " + round);

    }


    public void setHuman(Human human) {
        this.human = human;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
