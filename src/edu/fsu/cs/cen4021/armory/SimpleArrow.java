package edu.fsu.cs.cen4021.armory;

/**
 * Created by laurenkoulias on 2/6/17.
 */
class SimpleArrow extends BasicWeapon implements Weapon {

    SimpleArrow() {
        super(70);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage;

        if (armor > 5) {
            int effective_armor = armor - 5;
            damage = DAMAGE - effective_armor;
        }

        else{
            damage = DAMAGE - armor;
        }

        if (damage < 0) {
            return 0;
        }

        return damage;
    }

}