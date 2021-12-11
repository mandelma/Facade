package facade;

public class CPU {
    final Memory memory;

    public CPU(Memory memory) {
        this.memory = memory;
    }

    public void freeze() {
        System.out.println("Stoping cpu before boot!");
    }

    public void jump(int position) {
        System.out.println("CPU jumping on memory position: " + memory.data.get(position));
    }

    public void execute() {
        System.out.println("Executing ...");
        for(int i = 1; i < memory.data.size(); i++) {
            jump(i);
        }
        System.out.println("Done!");
    }
}
