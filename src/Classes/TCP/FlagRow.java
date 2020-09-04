package Classes.TCP;

import Util.BinaryFunctions;

import java.util.List;

public class FlagRow {
    private int dataOffset;
    private boolean NS;
    private boolean CWR;
    private boolean ECE;
    private boolean URG;
    private boolean ACK;
    private boolean PSH;
    private boolean RST;
    private boolean SYN;
    private boolean FIN;
    private int windowSize;

    public FlagRow(List<Integer> info) {
        this.dataOffset = BinaryFunctions.extractBitsAsInteger(info.get(0), 5, 4);
        this.NS = ((info.get(0) & 1) == 1) ? true : false;
        this.CWR = (((info.get(1) >> 7) & 1) == 1) ? true : false;
        this.ECE = (((info.get(1) >> 6) & 1) == 1) ? true : false;
        this.URG = (((info.get(1) >> 5) & 1) == 1) ? true : false;
        this.ACK = (((info.get(1) >> 4) & 1) == 1) ? true : false;
        this.PSH = (((info.get(1) >> 3) & 1) == 1) ? true : false;
        this.RST = (((info.get(1) >> 2) & 1) == 1) ? true : false;
        this.SYN = (((info.get(1) >> 1) & 1) == 1) ? true : false;
        this.FIN = (((info.get(1)) & 1) == 1) ? true : false;
        this.windowSize = BinaryFunctions.getBytesConcatenatedAsInt(info.subList(2, 4));
    }

    @Override
    public String toString() {
        return "{" +
                "dataOffset=" + dataOffset +
                ", NS=" + NS +
                ", CWR=" + CWR +
                ", ECE=" + ECE +
                ", URG=" + URG +
                ", ACK=" + ACK +
                ", PSH=" + PSH +
                ", RST=" + RST +
                ", SYN=" + SYN +
                ", FIN=" + FIN +
                ", windowSize=" + windowSize +
                '}';
    }
}
