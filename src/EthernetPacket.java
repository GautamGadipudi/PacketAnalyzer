import java.util.ArrayList;

public class EthernetPacket {
    public EthernetPacket(ArrayList<Byte> ethernetPacket) {
        this.setPacketSize(ethernetPacket.size());

    }

    static final int headerSize = 14;
    static final int addressSize = 6;
    static final int typeSize = 2;

    private int packetSize;
    private String destinationAddress;
    private String sourceAddress;
    private String etherType;

    public int getPacketSize() {
        return packetSize;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public String getEtherType() {
        return etherType;
    }

    public void setPacketSize(int packetSize) {
        this.packetSize = packetSize;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public void setEtherType(String etherType) {
        this.etherType = etherType;
    }
}
