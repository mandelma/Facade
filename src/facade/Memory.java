package facade;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    public List<Character> data = new ArrayList<>();

    public void load(int position, List<Character> list) {
        System.out.println("Data loaded to memory: " + list);
        data = list;
    }
}
