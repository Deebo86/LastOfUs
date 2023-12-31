package model.characters;

import java.awt.Point;

public abstract class Character {
    private String name;
    private Point location;
    private int maxHp;
    private int currentHp;
    private int attackDmg;
    private Character target;

    public Character(String name, int maxHp, int attackDmg) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attackDmg = attackDmg;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
        if(this.currentHp<= 0)
            this.currentHp = 0;
        else if(this.currentHp > maxHp)
            this.currentHp = maxHp;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public int getAttackDmg() {
        return attackDmg;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

}
