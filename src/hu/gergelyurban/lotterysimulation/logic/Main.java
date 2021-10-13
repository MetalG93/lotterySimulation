package hu.gergelyurban.lotterysimulation.logic;

import hu.gergelyurban.lotterysimulation.domain.LotteryNumber;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        IO io = new IO();
        Simulation simulation = new Simulation();

        double cycles = Double.parseDouble(io.consoleIn("How many simulation do you want?"));
        LocalTime start = LocalTime.now();
        LotteryNumber[] array = simulation.simulation(cycles);
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i].toString());
        }
        LocalTime elapsedTime = LocalTime.now().minusNanos(start.toNanoOfDay());
        System.out.printf("\nElapsed time: %dm, %ds, %dns%n", elapsedTime.getMinute(), elapsedTime.getSecond(), elapsedTime.getNano());
    }
}
