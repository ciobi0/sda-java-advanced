package com.codingadvanced.ex7;

import java.util.LinkedList;

public class WeaponMagazine {
    private int maxCapacity;
    private LinkedList<String> bullets;

    public WeaponMagazine(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        bullets = new LinkedList<>();
    }

    public void loadBullet(String bullet) {
        if (bullets.size() < maxCapacity) {
            bullets.add(bullet);
        } else {
            System.out.println("weapon magazine is full");
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
    }

    public void shot() {
        if (bullets.isEmpty()) {
            System.out.println("magazine is empty");
        } else {
            System.out.println("shooting bullet " + bullets.getLast());
            bullets.removeLast();
        }
    }


}
