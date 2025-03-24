package a_oop.composition.pcfactory;

public class Main {

    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "2*2");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, monitor, motherboard);

        thePC.getMonitor().drawPixelAt(5, 5, "red");
        thePC.getComputerCase().pressPowerButton();
        thePC.getMotherboard().loadProgram("Test");
    }
}
