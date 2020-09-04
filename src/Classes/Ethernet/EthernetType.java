package Classes.Ethernet;

import Util.Functions;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class EthernetType {
    private List<Integer> value;
    private String hexValue;

    static final Dictionary<Integer, String> ethernetTypes = new Hashtable() {
        {
            put("0800", "IP");
        }
    };

    public EthernetType(List<Integer> ethernetType) {
        this.value = ethernetType;
        this.hexValue = Functions.intToHex(ethernetType);
    }

    @Override
    public String toString() {
        return this.hexValue +
                " (" +
                ethernetTypes.get(hexValue) +
                ")";
    }
}
