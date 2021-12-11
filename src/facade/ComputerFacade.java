package facade;

public class ComputerFacade {
    final Memory memory = new Memory();
    final CPU cpu = new CPU(memory);
    final HardDrive hard_drive = new HardDrive();

    final int kBootAddress = 0;
    final int kBootSector = 2;
    final int kSectorSize = 6;

    public void start() {
        cpu.freeze();
        memory.load(kBootAddress, hard_drive.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        cpu.execute();


    }
}
