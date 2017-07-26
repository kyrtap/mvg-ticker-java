package de.kyrtap5.mvgticker;

public class Transport {
    public enum Type {
        BUS, TRAM, UBAHN, SBAHN
    }

    /**
     * Returns the Munich transport type from the given line string
     * @param input the line String
     * @return the transport type
     */
    public static Type getTransportType(String input) {
        if (input.startsWith("U")) return Type.UBAHN;
        else if (input.startsWith("S")) return Type.SBAHN;
        else if (input.startsWith("X")) return Type.BUS;
        else if (input.startsWith("N")) return Type.BUS;
        else {
            if (Integer.parseInt(input) < 30) return Type.TRAM;
            else return Type.BUS;
        }
    }
}
