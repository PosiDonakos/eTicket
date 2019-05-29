package Stops;

public class Stop {
    
    protected String stopName;		
    protected int lineID;
    protected int arrStopL;		//κατευθυνση προς τα αριστερα
    protected int arrStopR;    		// κατευθυνση προς τα δεξια
    protected int anchorTime;
    protected int stopType;		//τυπος στασης

    public int getStopType() {
        return stopType;
    }

    public void setStopType(int stopType) {
        this.stopType = stopType;
    }
        
    public Stop() {
        
    }

    public Stop(String stopName, int lineID, int arrStopL, int arrStopR, int anchorTime, int stopType) {
        this.stopName = stopName;
        this.lineID = lineID;
        this.arrStopL = arrStopL;
        this.arrStopR = arrStopR;
        this.anchorTime = anchorTime;
        this.stopType = stopType;
    }    

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public int getLineID() {
        return lineID;
    }

    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    public int getArrStopR() {
        return arrStopR;
    }

    public void setArrStopR(int arrStopR) {
        this.arrStopR = arrStopR;
    }

    public int getArrStopL() {
        return arrStopL;
    }

    public void setArrStopL(int arrStopL) {
        this.arrStopL = arrStopL;
    }

    public int getAnchorTime() {
        return anchorTime;
    }

    public void setAnchorTime(int anchorTime) {
        this.anchorTime = anchorTime;
    }

    @Override
    public String toString() {
        return "Stop name " + stopName + ", of the line " + lineID 
                + ". Estimated arrival time for the station to the left is " + arrStopL 
                + " seconds. Estimated arrival time for the station to the right is " + arrStopR 
                + " seconds. The waiting time before the train departures for this stop is " + anchorTime + " seconds.";
    }
    
    public String stops() {
        return "Stop name " + stopName + " and belongs to the line " + lineID + ".";
    }
    
}
