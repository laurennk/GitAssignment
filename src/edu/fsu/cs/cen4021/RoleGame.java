package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Sword was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here
        Weapon simpleArrow = WeaponFactory.getWeapon("simpleArrow");
        System.out.println("Simple arrow has " + simpleArrow.hit() + " of damage.");
        armor = 20;
        System.out.println("Simple arrow was able to do " + simpleArrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon simpleAxe = WeaponFactory.getWeapon("simpleAxe");
        System.out.println("Simple axe has " + simpleAxe.hit() + " of damage.");
        System.out.println("Simple axe was able to do " + simpleAxe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon simpleMagicStaff = WeaponFactory.getWeapon("simpleMagicStaff");
        System.out.println("Simple magic staff has " + simpleMagicStaff.hit() + " of damage.");
        System.out.println("Simple magic staff was able to do " + simpleMagicStaff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon theChosenOneAxe = WeaponFactory.getWeapon("theChosenOneAxe");
        System.out.println("The chosen one axe has " + theChosenOneAxe.hit() + " of damage.");
        System.out.println("The chosen one axe was able to do " + theChosenOneAxe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon ancientMagicStaff = WeaponFactory.getWeapon("ancientMagicStaff");
        System.out.println("Ancient magic staff has " + ancientMagicStaff.hit() + " of damage.");
        System.out.println("Ancient magic staff was able to do " + ancientMagicStaff.hit(armor) + " of damage due to an armor with " + armor + " points.");
    }
}
