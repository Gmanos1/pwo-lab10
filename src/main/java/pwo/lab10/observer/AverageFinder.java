package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class AverageFinder implements Subscriber {

    Integer sum = null;
    Integer numberCounter = null;

    @Override

    public void action(int x) {

        sum = sum == null ? x : sum + x;
        numberCounter = numberCounter == null ? 1 : numberCounter+1;

    }

    public Float getAverage() {
        return (float) sum / numberCounter;
    }
}
