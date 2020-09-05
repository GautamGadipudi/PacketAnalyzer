import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import Classes.Ethernet.EthernetPacket;
import Classes.ICMP.ICMPPacket;
import Classes.IP.IPPacket;
import Classes.TCP.TCPPacket;
import Classes.UDP.UDPPacket;

public class PacketAnalyzer {
    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        List<Integer> info = new ArrayList<>();

        try (InputStream inputStream = new FileInputStream(inputFile)) {
            byte byteRead;

            while ((byteRead = (byte)inputStream.read()) != -1) {
                info.add(Byte.toUnsignedInt(byteRead));
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        EthernetPacket e = new EthernetPacket(info);
        System.out.println(e);

        if (e.getEthernetType().equals("0x0800")) {
            IPPacket i = new IPPacket(info.subList(14, 34));
            System.out.println(i);
            int protocol = i.getProtocol();

            switch (protocol) {
                case 1:
                    ICMPPacket icmp = new ICMPPacket(info.subList(34, info.size()));
                    System.out.println(icmp);
                    break;

                case 17:
                    UDPPacket udp = new UDPPacket(info.subList(34, info.size()));
                    System.out.println(udp);
                    break;

                case 6:
                    TCPPacket tcp = new TCPPacket(info.subList(34, info.size()));
                    System.out.println(tcp);
                    break;
            }
        }
    }
}
