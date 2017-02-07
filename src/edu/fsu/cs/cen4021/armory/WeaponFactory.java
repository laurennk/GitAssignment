/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen4021.armory;

/**
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "simpleArrow":
                return new SimpleArrow();
            case "simpleAxe":
                return new SimpleAxe();
            case "simpleMagicStaff":
                return new SimpleMagicStaff();
            case "theChosenOneAxe":
                return new TheChosenOneAxe();
            case "ancientMagicStaff":
                return new AncientMagicStaff();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
