package Classes.IP;

import java.util.List;

public class TotalLength {
    private int value;

    public TotalLength(List<Byte> info) {
        this.value = (info.get(0) << 8) | info.get(1);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
