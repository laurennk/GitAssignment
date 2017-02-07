package edu.fsu.cs.cen4021.armory;

/**
 * Created by laurenkoulias on 2/6/17.
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon {

    SimpleMagicStaff() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        double effective_armor = 0.8 * armor;

        int damage = DAMAGE - (int) effective_armor;

        if (damage < 0) {
            return 0;
        }

        return damage;
    }

}
