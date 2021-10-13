package hu.gergelyurban.lotterysimulation.domain;

public class LotteryNumber {
    int number;
    double count;

    public LotteryNumber(int number){
        this.number=number;
        this.count=0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return number + ((number<10)?" : ":": ") + (int)count;
    }
}
