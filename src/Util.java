public final class Util {
    public static void customPrint(String myString, PacketAnalyzer.HeaderType type) {
        switch (type) {
            case ETHERNET:
                System.out.println("ETHER: \t" + myString);
                break;
            case TCP:
                System.out.println("TCP: \t" + myString);
                break;
            case IP:
                System.out.println("IP.IP: \t" + myString);
                break;
            case UDP:
                System.out.println("UDP: \t" + myString);
                break;
            default:
                System.out.println(myString);
        }
    }
}
