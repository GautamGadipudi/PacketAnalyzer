package Classes.Ethernet;

import Util.BinaryFunctions;

import java.util.List;

public class SourceAddress {
    private List<Integer> value;
    private String hexValue;

    public SourceAddress(List<Integer> address) {
        this.value = address;
        this.hexValue = BinaryFunctions.intToHex(address);
    }

    @Override
    public String toString() {
        return this.hexValue;
    }
}
