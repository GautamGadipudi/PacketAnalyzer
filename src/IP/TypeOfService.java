package IP;

public class TypeOfService {
    //Type of Service

    public TypeOfService(byte value) {
        this.value = value;

    }

    /**
     * Value of Type of Service
     */
    private byte value;

    /**
     * Differentiated Services Code Point
     */
    private byte differentiatedServiceCodePoint;

    /**
     * Explicit Congestion Network
     */
    private byte explicitCongestionNotification;

    /**
     * Set Differentiated Services Code Point.
     * @param differentiatedServiceCodePoint
     */
    public void setDifferentiatedServiceCodePoint(byte differentiatedServiceCodePoint) {
        this.differentiatedServiceCodePoint = differentiatedServiceCodePoint;
    }

    /**
     * Set Explicit Congestion Network.
     * @param explicitCongestionNotification
     */
    public void setExplicitCongestionNotification(byte explicitCongestionNotification) {
        this.explicitCongestionNotification = explicitCongestionNotification;
    }

    /**
     * Get Differentiated Services Code Point.
     * @return
     */
    public byte getDifferentiatedServiceCodePoint() {
        return differentiatedServiceCodePoint;
    }

    /**
     * Get Explicit Congestion Network.
     * @return
     */
    public byte getExplicitCongestionNotification() {
        return explicitCongestionNotification;
    }
}
