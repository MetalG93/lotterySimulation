package hu.gergelyurban.lotterysimulation.logic;

import hu.gergelyurban.lotterysimulation.domain.LotteryNumber;

import java.util.Random;

public class Simulation {
    private final LotteryNumber[] array = new LotteryNumber[90];

    public LotteryNumber[] simulation(double cycle){
        fillArray();
        doSimulation(cycle);
        sort();
        return array;
    }

    private void fillArray(){
        for (int i = 0; i < array.length; i++) {
            array[i] = new LotteryNumber(i+1);
        }
    }

    private void doSimulation(double cycle){
        Random r = new Random();

        for (double i = 0; i < cycle; i++) {
            int number = r.nextInt(90);
            array[number].setCount(array[number].getCount()+1);
        }
    }

    private void sort(){
        for (int i = array.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[i].getCount()>array[j].getCount()){
                    swap(i, j);
                }
            }
        }
    }

    private void swap(int i, int j) {
        LotteryNumber temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
