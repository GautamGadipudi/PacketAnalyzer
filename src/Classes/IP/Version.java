package Classes.IP;

import Util.Functions;

public class Version {
    private int value;

    public Version(Byte info) {
        this.value = Functions.extractBitsAsInteger(info, 5, 4);
    }

    @Override
    public String toString() {
        return "IPv" + this.value;
    }
}
