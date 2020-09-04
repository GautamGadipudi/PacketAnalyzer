package Classes.UDP;

import Classes.Common.Data;
import Util.BinaryFunctions;

import java.util.List;

public class UDPPacket {
    private int sourcePort;
    private int destinationPort;
    private int length;
    private int checkSum;
    private Data data;

    public UDPPacket(List<Integer> info) {
        this.sourcePort = BinaryFunctions.getBytesConcatenatedAsInt(info.subList(0, 2));
        this.destinationPort = BinaryFunctions.getBytesConcatenatedAsInt(info.subList(2, 4));
        this.length = BinaryFunctions.getBytesConcatenatedAsInt(info.subList(4, 6));
        this.checkSum = BinaryFunctions.getBytesConcatenatedAsInt(info.subList(6, 8));
        this.data = new Data(info.subList(8, info.size()));
    }

    @Override
    public String toString() {
        return "UDP {" +
                "\n\tsourcePort=" + sourcePort +
                "\n\t, destinationPort=" + destinationPort +
                "\n\t, length=" + length +
                "\n\t, checkSum=" + checkSum +
                "\n\t, data (first 64 bytes only)=" + data +
                "\n}";
    }
}
