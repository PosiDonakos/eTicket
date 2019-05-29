package Stations;

public class Station {

    protected String stationName;
    protected String stationType;
    protected int LineID;

	// εχω μετατρεψει τους τυπους των στασεων σε 3 διαφορετικους αριθμους(οσοι και οι διαφορετικοι τυποι) για λογους ευκολιας στο γραψιμο

    public Station(String stationName, int stationType, int LineID) {
        this.stationName = stationName;
        switch (stationType) {
            case 1:
                this.stationType = "Initial";
                break;
            case 2:
                this.stationType = "ordinary";
                break;
            case 3:
                this.stationType = "transit";
                break;
            default:
                break;
        }
        this.LineID = LineID;

    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public int getStationLine() {
        return LineID;
    }

    public void setStationLine(int LineID) {
        this.LineID = LineID;
    }

    @Override
    public String toString() {
        return "The station you selected is " + stationName + ", and is a/an "
                + stationType + " station, which belongs to the Line " + LineID;
    }

    public String stathmoi() {
        return "Station name " + stationName + " and is a/an " + stationType + " station.";
    }

}
