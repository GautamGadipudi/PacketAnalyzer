package Classes.Ethernet;

import Util.Functions;

import java.util.List;

public class SourceAddress {
    private List<Byte> value;
    private String hexValue;

    public SourceAddress(List<Byte> address) {
        this.value = address;
        this.hexValue = Functions.intToHex(address);
    }

    @Override
    public String toString() {
        return this.hexValue;
    }
}
