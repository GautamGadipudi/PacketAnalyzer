package Util;

import java.util.List;

public final class Functions {
    private Functions() {

    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String intToHex(List<Byte> bytes) {

        char[] hexChars = new char[bytes.size() * 2];
        for (int i = 0; i < bytes.size(); i++) {
            int v = bytes.get(i) & 0xFF;
            hexChars[i * 2] = hexArray[v >>> 4];
            hexChars[i * 2 + 1] = hexArray[v & 0x0F];
        }

        return new String(hexChars);
    }

    public static int extractBitsAsInteger(int number, int position, int bitCount) {
        return (((1 << bitCount) - 1) & (number >> (position - 1)));
    }

    public static int getBytesConcatenatedAsInt(List<Byte> bytes) {
        int n = bytes.size();
        int result = 0;

        for (int i = n; i > 0; i++) {
            result = ((int)bytes.get(i) << ((i - 1) * 8)) | result;
        }

        return result;
    }
}
