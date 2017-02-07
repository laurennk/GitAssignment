package edu.fsu.cs.cen4021.armory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import static javax.script.ScriptEngine.FILENAME;

/**
 * Created by laurenkoulias on 2/6/17.
 */
class TheChosenOneAxe extends BasicWeapon implements Weapon {

    TheChosenOneAxe() {
        super(0);

        super.DAMAGE = this.getWeaponDamage();
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = 0;

        if (armor > 0 && armor < 20){
            damage = DAMAGE;
        }
        else if (armor <= 0 || armor >= 20) {
            damage = DAMAGE - armor;
        }

        if (damage < 0) {
            return 0;
        }

        return damage;
    }

    private int getWeaponDamage() {
        Hashtable dict = new Hashtable();
        int uniqueLine = -1;

        try {
            File file = new File("conf/thechosenone.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            String repeatedWord = "";
            int lineNum = 1;
            while ((line = reader.readLine()) != null)
            {
                if(line.trim().length() == 0) continue;
                if (!dict.containsKey(line)){
                    dict.put(line, lineNum);
                } else {
                    repeatedWord = line;
                }
                lineNum++;
            }

            dict.remove(repeatedWord);
            uniqueLine =  (int)dict.values().toArray()[0];

            reader.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }

       return uniqueLine;
    }

}