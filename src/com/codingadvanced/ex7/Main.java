package com.codingadvanced.ex7;

/**
 * than the capacity of the magazine
 * isLoaded()→ returns information about whether the weapon is loaded (at least one cartridge) or not
 * shot()→ each call shots one bullet (prints string value in console) -the last loaded cartridge-
 * and prepares the next one, loaded before the last one, if there are no more cartridges, it prints "empty
 * magazine" in the console
 */
public class Main {
    public static void main(String[] args) {
        WeaponMagazine weaponMagazine = new WeaponMagazine(5);
        System.out.println(weaponMagazine.isLoaded());
        weaponMagazine.loadBullet("bullet1");
        weaponMagazine.loadBullet("bullet2");
        weaponMagazine.loadBullet("bullet3");
        weaponMagazine.loadBullet("bullet4");
        weaponMagazine.loadBullet("bullet5");
        weaponMagazine.loadBullet("bullet6");
        System.out.println(weaponMagazine.isLoaded());
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        System.out.println(weaponMagazine.isLoaded());
    }

}
