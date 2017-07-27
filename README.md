# MVG Ticker
#### Simple MVG (Münchner Verkehrsgesellschaft) live data parser written in Java.
## What can I use it for?
You can use MVG Ticker to get the upcoming departures from the desired bus/tram/subway station. The output will be an ArrayList of Departure objects with the data parsed from the MVG live website. A Departure object contains the line, its type, its destination and the departure time.
## How can I use it?
Example usage:
```
ArrayList<Departure> deps = new MvgTicker("Hauptbahnhof").getDepartures(true, true, true, true);

for (Departure d : deps) {
    System.out.println(d.toString());
}
```
You can also take a look at the Javadoc documentation [here](https://kyrtap5.github.io/mvg-ticker-java/index.html).
