package Classes.TCP;

import Classes.Common.Data;
import Util.BinaryFunctions;

import java.util.List;

public class TCPPacket {
    private int sourcePort;
    private int destinationPort;
    private String sequenceNumber;
    private String acknowledgeNumber;
    private FlagRow flagRow;
    private String checkSum;
    private String urgentPointer;
    private Data data;

    public TCPPacket(List<Integer> info) {
        this.sourcePort = BinaryFunctions.getBytesConcatenatedAsInt(info.subList(0, 2));
        this.destinationPort = BinaryFunctions.getBytesConcatenatedAsInt(info.subList(2, 4));
        this.sequenceNumber = BinaryFunctions.intToHex(info.subList(4, 8));
        this.acknowledgeNumber = BinaryFunctions.intToHex(info.subList(8, 12));
        this.flagRow = new FlagRow(info.subList(12, 16));
        this.checkSum = BinaryFunctions.intToHex(info.subList(16, 18));
        this.urgentPointer = BinaryFunctions.intToHex(info.subList(18, 20));
        this.data = new Data(info.subList(20, info.size()));
    }

    @Override
    public String toString() {
        return "TCP {" +
                "\n\tsourcePort=" + sourcePort +
                "\n\t, destinationPort=" + destinationPort +
                "\n\t, sequenceNumber='" + sequenceNumber + '\'' +
                "\n\t, acknowledgeNumber='" + acknowledgeNumber + '\'' +
                "\n\t, flagRow=" + flagRow +
                "\n\t, checkSum=" + checkSum +
                "\n\t, urgentPointer='" + urgentPointer + '\'' +
                "\n\t, data (first 64 bytes only)='" + data + '\'' +
                "\n}";
    }
}
