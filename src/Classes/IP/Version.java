package Classes.IP;

import Util.BinaryFunctions;

public class Version {
    private int value;

    public Version(Integer info) {
        this.value = BinaryFunctions.extractBitsAsInteger(info, 5, 4);
    }

    @Override
    public String toString() {
        return "IPv" + this.value;
    }
}
