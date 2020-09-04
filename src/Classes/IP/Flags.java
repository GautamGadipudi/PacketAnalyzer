package Classes.IP;

import Util.Functions;

import java.util.List;

public class Flags {
    private int value;
    private boolean dontFragment;
    private boolean moreFragments;
    private int fragmentOffset;

    public Flags(List<Byte> info) {
        this.value = Functions.getBytesConcatenatedAsInt(info.subList(6, 7));
        this.dontFragment = (((this.value >> 14) & 1) == 1) ? true : false;
        this.moreFragments = (((this.value >> 13) & 1) == 1) ? true : false;
        this.fragmentOffset = Functions.extractBitsAsInteger(this.value, 1, 13);
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
