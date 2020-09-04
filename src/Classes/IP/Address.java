package Classes.IP;

import java.util.List;
import java.util.stream.Collectors;

public class Address {
    private List<Byte> value;
    private String dotValue;

    public Address(List<Byte> info) {
        this.value = info;
        this.dotValue = info.stream().map(String::valueOf).collect(Collectors.joining("."));
    }

    @Override
    public String toString() {
        return this.dotValue;
    }
}
