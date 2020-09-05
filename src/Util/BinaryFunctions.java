package Util;

import java.util.List;

public final class BinaryFunctions {
    private BinaryFunctions() {

    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String intToHex(List<Integer> bytes) {

        char[] hexChars = new char[bytes.size() * 2];
        for (int i = 0; i < bytes.size(); i++) {
            int v = bytes.get(i) & 0xFF;
            hexChars[i * 2] = hexArray[v >>> 4];
            hexChars[i * 2 + 1] = hexArray[v & 0x0F];
        }

        return "0x" + new String(hexChars);
    }

    public static int extractBitsAsInteger(int number, int position, int bitCount) {
        return (((1 << bitCount) - 1) & (number >> (position - 1)));
    }

    public static int getBytesConcatenatedAsInt(List<Integer> unsignedBytes) {
        int n = unsignedBytes.size();
        int result = 0;

        for (int i = n; i > 0; i--) {
            result = (unsignedBytes.get(n - i) << ((i - 1) * 8)) | result;
        }

        return result;
    }
}
