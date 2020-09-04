import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import Classes.Ethernet.EthernetPacket;
import Classes.IP.IPPacket;

public class PacketAnalyzer {

    // Ethernet header field sizes (in Bytes)
    static final int ethernetHeaderSize = 14;
    static final int ethernetAddressSize = 6;
    static final int ethernetTypeSize = 2;

    static final Dictionary<Integer, String> ethernetTypes = new Hashtable() {
        {
            put(0x0800, "IP");
        }
    };

    public enum HeaderType {
        ETHERNET, TCP, UDP, IP
    }



    public static void main(String[] args) throws IOException {
        String inputFile = "pkt/new_icmp_packet2.bin";
        List<Byte> info = new ArrayList<>();

        try (InputStream inputStream = new FileInputStream(inputFile)) {
            byte byteRead;

            while ((byteRead = (byte)inputStream.read()) != -1) {
                info.add(byteRead);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        int byteOffset = 0;

        EthernetPacket e = new EthernetPacket(info);
        IPPacket i = new IPPacket(info.subList(14, 34));

        System.out.println(e);
        System.out.println(i);


//        Util.customPrint("------ Ether Header -----", HeaderType.ETHERNET);
//        Util.customPrint("Packet size = " + e.getPacketSize() + " bytes", HeaderType.ETHERNET);
//        Util.customPrint("Destination MAC address = " + e.getDestinationAddress(), HeaderType.ETHERNET);
//        Util.customPrint("Source MAC address = " + e.getSourceAddress(), HeaderType.ETHERNET);
//        Util.customPrint("EtherType = " + e.getEtherType(), HeaderType.ETHERNET);
//
//        if (e.getEtherType().equals(ethernetTypeIP)) {
//            int ipVersion = Integer.parseInt(String.valueOf(hex.get(byteOffset).charAt(0)));
//            int internetHeaderLength = Integer.parseInt(String.valueOf(hex.get(byteOffset).charAt(1))) * 4;
//
//            Util.customPrint("------ Ether Header -----", HeaderType.IP);
//            Util.customPrint("Version = " + ipVersion, HeaderType.IP);
//            Util.customPrint("Header Length = " + internetHeaderLength, HeaderType.IP);
//        }
    }
}
