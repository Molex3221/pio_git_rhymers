package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int Ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return Ret;
    }
}
