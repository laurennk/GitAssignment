package edu.fsu.cs.cen4021.armory;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by laurenkoulias on 2/6/17.
 */
class AncientMagicStaff extends BasicWeapon implements Weapon {

    AncientMagicStaff() {
        super(0);

        super.DAMAGE = this.getWeaponDamage();
    }


    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        double effective_armor = 0.75 * armor;

        int damage = DAMAGE - (int) effective_armor;

        if (damage < 0) {
            return 0;
        }

        return damage;
    }

    private int getWeaponDamage() {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        ArrayList<Integer> reversedList = new ArrayList<Integer>();
        try {
            File file = new File("conf/ancientstaff.obj");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList objectContents = (ArrayList<Integer>) objectInputStream.readObject();
            myList = objectContents;

            //System.out.println(objectContents.toString());

            objectInputStream.close();
            fileInputStream.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }

        int size = myList.size();

        for (int i = 0; i < size; i++){
            myList.set(i, myList.get(i) * myList.get(i));
        }

        myList.remove(4);
        myList.remove(1);

        Collections.reverse(myList);

        //System.out.println(myList.toString());

        int damage = myList.get(0) + myList.get(2) + myList.get(6);

        return damage;
    }

}
