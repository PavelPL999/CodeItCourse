package lesson_13.hw13computer;

import lesson_13.hw13computer.hard.HardDisc;
import lesson_13.hw13computer.keyboard.Keyboard;
import lesson_13.hw13computer.memory.Memory;
import lesson_13.hw13computer.monitor.Monitor;
import lesson_13.hw13computer.processor.Processor;

public class Computer {

    private Processor processor;
    private Memory memory;
    private HardDisc disc;
    private Monitor monitor;
    private Keyboard keyboard;

    private final String VENDOR;
    private final String NAME;

    public Computer(Processor processor,
                    Memory memory,
                    HardDisc disc,
                    Monitor monitor,
                    Keyboard keyboard,
                    String VENDOR,
                    String NAME) {
        this.processor = processor;
        this.memory = memory;
        this.disc = disc;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.VENDOR = VENDOR;
        this.NAME = NAME;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisc getDisc() {
        return disc;
    }

    public void setDisc(HardDisc disc) {
        this.disc = disc;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVENDOR() {
        return VENDOR;
    }

    public String getNAME() {
        return NAME;
    }

    public double getWeight() {
        return processor.getWeight() + memory.getWeight() + disc.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", disc=" + disc +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", VENDOR='" + VENDOR + '\'' +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
