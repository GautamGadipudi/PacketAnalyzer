package Classes.Ethernet;

import Util.BinaryFunctions;
import java.util.List;

public class DestinationAddress {
    private List<Integer> value;
    private String hexValue;


    public DestinationAddress(List<Integer> address) {
        this.value = address;
        this.hexValue = BinaryFunctions.intToHex(address);
    }

    @Override
    public String toString() {
        return this.hexValue;
    }
}
