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
    private byte TTL;
    private int headerChecksum;
    private Address sourceAddress;
    private Address destinationAddress;

    public IPPacket(List<Byte> ipPacket) {
        this.version = new Version(ipPacket.get(0));
        this.headerLength = Functions.extractBitsAsInteger(ipPacket.get(0), 1, 4) * 4;
        this.trafficClass = new TrafficClass(ipPacket.get(1));
        this.totalLength = Functions.getBytesConcatenatedAsInt(ipPacket.subList(2, 4));
        this.identification = Functions.getBytesConcatenatedAsInt(ipPacket.subList(4, 6));
        this.flags = new Flags(ipPacket.subList(6, 8));
        this.TTL = ipPacket.get(8);
        this.headerChecksum = Functions.getBytesConcatenatedAsInt(ipPacket.subList(9, 11));
        this.sourceAddress = new Address(ipPacket.subList(11, 15));
        this.destinationAddress = new Address(ipPacket.subList(15, 19));
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
                ", headerChecksum=" + headerChecksum +
                ", sourceAddress=" + sourceAddress +
                ", destinationAddress=" + destinationAddress +
                '}';
    }
}
