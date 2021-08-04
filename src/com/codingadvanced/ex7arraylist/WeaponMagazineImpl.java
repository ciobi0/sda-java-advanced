package com.codingadvanced.ex7arraylist;

import java.util.ArrayList;
import java.util.List;

public class WeaponMagazineImpl implements WeaponMagazine {

    private int magazineSize = 0;
    private List<String> bulletsInMagazine = new ArrayList<>(magazineSize);

    public WeaponMagazineImpl(int magazineSize) {
        this.magazineSize = magazineSize;
    }

    @Override
    public void loadBullet(String bullet) {
        if (bulletsInMagazine.size()>=magazineSize) {
            System.out.println("magazine is full");
        } else {
            bulletsInMagazine.add(bullet);
        }
    }

    @Override
    public boolean isLoaded() {
        return bulletsInMagazine.size()>0;
    }

    @Override
    public void shot() {
        if (bulletsInMagazine.size()>0){
        String lastBullet = bulletsInMagazine.get(bulletsInMagazine.size()-1);
        System.out.println("bullet shot: "+ lastBullet);
        bulletsInMagazine.remove(bulletsInMagazine.size()-1);}
        else {
            System.out.println("empty magazine");
        }
    }
}
