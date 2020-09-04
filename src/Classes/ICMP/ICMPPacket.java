package Classes.ICMP;

import Util.BinaryFunctions;

import java.util.List;

public class ICMPPacket {
    private Type type;
    private int code;
    private int checkSum;

    public ICMPPacket(List<Integer> info) {
        this.type = new Type(info.get(0));
        this.code = info.get(1);
        this.checkSum = BinaryFunctions.getBytesConcatenatedAsInt(info.subList(2, 4));
    }

    @Override
    public String toString() {
        return "ICMP {" +
                "\n\ttype=" + type +
                "\n\t, code=" + code +
                "\n\t, checkSum=" + checkSum +
                "\n}";
    }
}
