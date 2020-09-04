package Classes.IP;

public class TrafficClass {
    private DSCP dscp;
    private ECN ecn;

    public TrafficClass(Integer info) {
        this.dscp = new DSCP(info);
        this.ecn = new ECN(info);
    }

    @Override
    public String toString() {
        return "{" +
                "DSCP=" + dscp +
                ", ECN=" + ecn +
                '}';
    }
}
