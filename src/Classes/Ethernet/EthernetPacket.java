package Classes.Ethernet;

import Classes.Ethernet.DestinationAddress;
import Classes.Ethernet.EthernetType;
import Classes.Ethernet.SourceAddress;

import java.util.ArrayList;
import java.util.List;

public class EthernetPacket {
    private int packetSize;
    private DestinationAddress destinationAddress;
    private SourceAddress sourceAddress;
    private EthernetType ethernetType;


    public EthernetPacket(List<Integer> ethernetPacket) {
        this.packetSize = ethernetPacket.size();
        this.destinationAddress = new DestinationAddress(ethernetPacket.subList(0, 6));
        this.sourceAddress = new SourceAddress(ethernetPacket.subList(6, 12));
        this.ethernetType = new EthernetType(ethernetPacket.subList(12, 14));
    }

    @Override
    public String toString() {
        return "Ethernet {" +
                "\n\tpacketSize=" + packetSize +
                "\n\t, destinationAddress=" + destinationAddress +
                "\n\t, sourceAddress=" + sourceAddress +
                "\n\t, ethernetType=" + ethernetType +
                "\n}";
    }
}
