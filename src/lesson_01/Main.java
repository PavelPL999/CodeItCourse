package lesson_01;

import lesson_13.hw13computer.Computer;
import lesson_13.hw13computer.hard.HardDisc;
import lesson_13.hw13computer.hard.HardDiscType;
import lesson_13.hw13computer.keyboard.Illuminate;
import lesson_13.hw13computer.keyboard.Keyboard;
import lesson_13.hw13computer.keyboard.KeyboardType;
import lesson_13.hw13computer.memory.Memory;
import lesson_13.hw13computer.memory.MemoryType;
import lesson_13.hw13computer.monitor.Monitor;
import lesson_13.hw13computer.monitor.MonitorType;
import lesson_13.hw13computer.processor.CoreCount;
import lesson_13.hw13computer.processor.Creator;
import lesson_13.hw13computer.processor.Frequency;
import lesson_13.hw13computer.processor.Processor;

public class Main {

   public static void main(String[] args) {
       Processor processor = new Processor (Frequency.TWO_THOUSAND, CoreCount.FOUR, Creator.INTEL, 500);
       Memory memory = new Memory (MemoryType.DDR4, 16, 500);
       HardDisc hardDisc = new HardDisc (HardDiscType.SSD, 500, 500);
       Monitor monitor = new Monitor (17, MonitorType.IPS, 500);
       Keyboard keyboard = new Keyboard (KeyboardType.WIRELESS, Illuminate.YES, 500);

       Computer computer = new Computer (processor, memory, hardDisc, monitor, keyboard, "Baykal", "Atom ");
       System.out.println(computer.getWeight());
    }
}
