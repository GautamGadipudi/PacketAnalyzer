package Classes.Common;

import java.util.List;

public class Data {
    private List<Integer> value;

    public Data(List<Integer> info) {
        this.value = info;
    }

    private String getASCIIDump(List<Integer> bytes) {
        StringBuilder sb = new StringBuilder();

        int n = (bytes.size() > 64 ? 64 : bytes.size());

        for (int i = 0; i < n; i++) {
            int x = bytes.get(i);

            if (x >= 32 && x <= 126) {
                char ch = (char) x;
                sb.append(String.valueOf(ch));
            }
            else
                sb.append(".");

        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return getASCIIDump(this.value);
    }
}
