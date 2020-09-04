package Classes.IP;

import Util.BinaryFunctions;

import java.util.List;

public class IPPacket {
    private Version version;
    private int headerLength;
    private TrafficClass trafficClass;
    private int totalLength;
    private int identification;
    private Flags flags;
    private int TTL;
    private Protocol protocol;
    private int headerChecksum;
    private Address sourceAddress;
    private Address destinationAddress;

    public IPPacket(List<Integer> ipPacket) {
        this.version = new Version(ipPacket.get(0));
        this.headerLength = BinaryFunctions.extractBitsAsInteger(ipPacket.get(0), 1, 4) * 4;
        this.trafficClass = new TrafficClass(ipPacket.get(1));
        this.totalLength = BinaryFunctions.getBytesConcatenatedAsInt(ipPacket.subList(2, 4));
        this.identification = BinaryFunctions.getBytesConcatenatedAsInt(ipPacket.subList(4, 6));
        this.flags = new Flags(ipPacket.subList(6, 8));
        this.TTL = ipPacket.get(8);
        this.protocol = new Protocol(ipPacket.get(9));
        this.headerChecksum = BinaryFunctions.getBytesConcatenatedAsInt(ipPacket.subList(10, 12));
        this.sourceAddress = new Address(ipPacket.subList(12, 16));
        this.destinationAddress = new Address(ipPacket.subList(16, 20));
    }

    public int getProtocol() {
        return protocol.getValue();
    }

    @Override
    public String toString() {
        return "IP {" +
                "\n\tversion=" + version +
                "\n\t, headerLength=" + headerLength +
                "\n\t, trafficClass=" + trafficClass +
                "\n\t, totalLength=" + totalLength +
                "\n\t, identification=" + identification +
                "\n\t, flags=" + flags +
                "\n\t, TTL=" + TTL +
                "\n\t, Protocol=" + protocol +
                "\n\t, headerChecksum=" + headerChecksum +
                "\n\t, sourceAddress=" + sourceAddress +
                "\n\t, destinationAddress=" + destinationAddress +
                "\n}";
    }
}
