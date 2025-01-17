package Classes.IP;

import Util.BinaryFunctions;

import java.util.List;

public class Flags {
    private int value;
    private boolean dontFragment;
    private boolean moreFragments;
    private int fragmentOffset;

    public Flags(List<Integer> info) {
        this.value = BinaryFunctions.getBytesConcatenatedAsInt(info);
        this.dontFragment = (((this.value >> 14) & 1) == 1) ? true : false;
        this.moreFragments = (((this.value >> 13) & 1) == 1) ? true : false;
        this.fragmentOffset = BinaryFunctions.extractBitsAsInteger(this.value, 1, 13);
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                ", dontFragment=" + dontFragment +
                ", moreFragments=" + moreFragments +
                ", fragmentOffset=" + fragmentOffset +
                '}';
    }
}
