package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int size = 12;
    public static final int ERROR = -1;
    private int[] NUMBERS = new int[size];


    public int Total = ERROR;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++Total] = in;
    }

    public boolean callCheck() {
        return Total == ERROR;
    }

    public boolean isFull() {
        return Total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return NUMBERS[Total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return NUMBERS[Total--];
    }

}
