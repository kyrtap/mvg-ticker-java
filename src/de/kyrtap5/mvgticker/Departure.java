package de.kyrtap5.mvgticker;


import java.util.Date;

public class Departure implements Comparable<Departure> {
    private String line;
    private Transport.Type type;
    private String destination;
    private Date departure;

    public Departure(String line, Transport.Type type, String destination, Date departure) {
        this.line = line;
        this.type = type;
        this.destination = destination;
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Linie: " + line + " (" + type.toString() + ")\t" +
                "Ziel: " + destination + "\t" +
                "Abfahrt: " + DateHandler.formatDate(departure, "HH:mm");
    }

    @Override
    public int compareTo(Departure other) {
        return departure.compareTo(other.departure);
    }
}
