package Classes.ICMP;

import java.util.Dictionary;
import java.util.Hashtable;

public class Type {
    private int value;

    Dictionary<Integer, String> controlMessages = new Hashtable() {
        {
            put(0, "Echo reply");
            put(1, "Reserved");
            put(2, "Reserved");
            put(3, "Destination Unreachable");
            put(4, "Source Quench");
            put(5, "Redirect Message");
            put(6, "Alternate Host Address");
            put(7, "Reserved");
            put(8, "Echo request");
        }
    };

    public Type(int info) {
        this.value = info;
    }

    @Override
    public String toString() {
        return value +
                " (" + controlMessages.get(this.value) +
                ')';
    }
}
