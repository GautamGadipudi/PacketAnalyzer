package Classes.IP;

import Util.Functions;

import java.util.Dictionary;
import java.util.Hashtable;

public class ECN {
    private int value;

    Dictionary<Integer, String> notification = new Hashtable() {
        {
            put(0, "Non ECN-Capable Transport, Non-ECT");
            put(1, "ECN Capable Transport, ECT(1)");
            put(2, "ECN Capable Transport, ECT(0)");
            put(3, "Congestion Encountered, CE");
        }
    };

    public ECN(Byte info) {
        this.value = Functions.extractBitsAsInteger(info, 7, 2);
    }

    @Override
    public String toString() {
        return this.value +
                " (" +
                notification.get(this.value) +
                ")";
    }
}
