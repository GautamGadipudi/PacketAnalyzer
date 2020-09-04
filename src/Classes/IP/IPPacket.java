package Classes.IP;

import Util.Functions;

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
        this.headerLength = Functions.extractBitsAsInteger(ipPacket.get(0), 1, 4) * 4;
        this.trafficClass = new TrafficClass(ipPacket.get(1));
        this.totalLength = Functions.getBytesConcatenatedAsInt(ipPacket.subList(2, 4));
        this.identification = Functions.getBytesConcatenatedAsInt(ipPacket.subList(4, 6));
        this.flags = new Flags(ipPacket.subList(6, 8));
        this.TTL = ipPacket.get(8);
        this.protocol = new Protocol(ipPacket.get(9));
        this.headerChecksum = Functions.getBytesConcatenatedAsInt(ipPacket.subList(10, 12));
        this.sourceAddress = new Address(ipPacket.subList(12, 16));
        this.destinationAddress = new Address(ipPacket.subList(16, 20));
    }

    @Override
    public String toString() {
        return "IPPacket{" +
                "version=" + version +
                ", headerLength=" + headerLength +
                ", trafficClass=" + trafficClass +
                ", totalLength=" + totalLength +
                ", identification=" + identification +
                ", flags=" + flags +
                ", TTL=" + TTL +
                ", Protocol=" + protocol +
                ", headerChecksum=" + headerChecksum +
                ", sourceAddress=" + sourceAddress +
                ", destinationAddress=" + destinationAddress +
                '}';
    }
}
