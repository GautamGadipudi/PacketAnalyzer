package Classes.IP;

import Util.Functions;

import java.util.Dictionary;
import java.util.Hashtable;

public class DSCP {
    private int value;

    private static Dictionary<Integer, String> codePoints = new Hashtable() {
        {
            put(0, "CS0");
            put(8, "CS1");
            put(16, "CS2");
            put(24, "CS3");
            put(32, "CS4");
            put(40, "CS5");
            put(48, "CS6");
            put(56, "CS7");
            put(10, "AF11");
            put(12, "AF12");
            put(14, "AF13");
            put(18, "AF21");
            put(20, "AF22");
            put(22, "AF23");
            put(26, "AF31");
            put(28, "AF32");
            put(30, "AF33");
            put(34, "AF41");
            put(36, "AF42");
            put(38, "AF43");
            put(46, "EF");
            put(44, "VOICE-ADMIT");
            put(1, "LE");
        }
    };

    public DSCP(Integer info) {
        this.value = Functions.extractBitsAsInteger(info, 1, 6);
    }

    @Override
    public String toString() {
        return this.value +
                " (" +
                codePoints.get(this.value) +
                ")";
    }
}
