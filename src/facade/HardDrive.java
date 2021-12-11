package facade;

import java.util.ArrayList;
import java.util.List;

public class HardDrive {
    public List<Character> character = new ArrayList<>();

    public HardDrive() {
        Character t = 't';
        Character a = 'a';
        Character d = 'd';
        Character s = 's';
        Character o = 'o';
        Character p = 'p';
        Character i = 'i';
        Character x = 'x';
        Character l = 'l';

        character.add(t);
        character.add(a);
        character.add(d);
        character.add(s);
        character.add(o);
        character.add(p);
        character.add(i);
        character.add(l);
    }

    public List<Character> read(int lba, int size) {
        System.out.println("Data on hard drive: " + character);
        return character.subList(lba, size);
    }
}
