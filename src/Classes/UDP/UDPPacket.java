package Classes.UDP;

import Util.Functions;

import java.util.List;

public class UDPPacket {
    private int sourcePort;
    private int destinationPort;
    private int length;
    private int checkSum;
    private Data data;

    public UDPPacket(List<Integer> info) {
        this.sourcePort = Functions.getBytesConcatenatedAsInt(info.subList(0, 2));
        this.destinationPort = Functions.getBytesConcatenatedAsInt(info.subList(2, 4));
        this.length = Functions.getBytesConcatenatedAsInt(info.subList(4, 6));
        this.checkSum = Functions.getBytesConcatenatedAsInt(info.subList(6, 8));
        this.data = new Data(info.subList(8, info.size()));
    }

    @Override
    public String toString() {
        return "UDPPacket{" +
                "sourcePort=" + sourcePort +
                ", destinationPort=" + destinationPort +
                ", length=" + length +
                ", checkSum=" + checkSum +
                ", data=" + data +
                '}';
    }
}
