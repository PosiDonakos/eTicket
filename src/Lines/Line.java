package Lines;

public class Line {
    
    protected String lineName;
    protected int lineID;
    protected int depFreq;		//ωρα αναχωρησης
    
    public Line() {
    }
    
    public Line(String lineName, int lineID, int depFreq) {
    this.lineName = lineName;
    this.lineID = lineID;
    this.depFreq = depFreq;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public int getLineID() {
        return lineID;
    }

    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    public int getDepFreq() {
        return depFreq;
    }

    public void setDepFreq(int depFreq) {
        this.depFreq = depFreq;
    }
    
    

    @Override
    public String toString() {
        return "The name of the line is " + lineName + ", with the Line ID " + lineID + ", and the departure frequency of this is line is " + depFreq + " seconds.";
    }
    
}
