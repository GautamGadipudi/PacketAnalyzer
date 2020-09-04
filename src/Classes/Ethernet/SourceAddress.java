package Classes.Ethernet;

import Util.Functions;

import java.util.List;

public class SourceAddress {
    private List<Integer> value;
    private String hexValue;

    public SourceAddress(List<Integer> address) {
        this.value = address;
        this.hexValue = Functions.intToHex(address);
    }

    @Override
    public String toString() {
        return this.hexValue;
    }
}
