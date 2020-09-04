package Classes.IP;

import java.util.Dictionary;
import java.util.Hashtable;

public class Protocol {
    private byte value;

    Dictionary<Byte, String> protocolCode = new Hashtable() {
        {
            put(1, "ICMP");
            put(6, "TCP");
            put(17, "TCP");
        }
    };

    public Protocol(Byte info) {
        this.value = info;
    }

    @Override
    public String toString() {
        return this.value +
                " (" + protocolCode +
                ')';
    }
}
