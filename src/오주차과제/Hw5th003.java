package 오주차과제;

class Calculator {
    int value = 0;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends Calculator {
    int value =0 ;


    UpgradeCalculator() {
        this.value =0;
    }

    void minus(int val) {
        this.value -= val;
    }
}


public class Hw5th003 {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);

        System.out.println(cal.getValue());
    }
}
