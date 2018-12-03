package UI;

import java.io.Serializable;

public class refer implements Serializable{
    private String Ctype , Route;
    private int timestamp, R_ID , DMid ,TimeD;



    public refer(String Ctype){
        this.Ctype = Ctype;
    }
    public refer(int timestamp, int R_ID){
        this.timestamp = timestamp;
        this.R_ID = R_ID;
    }

    public String getCtype(){
        return Ctype;
    }
    public void setCtype(){
        this.Ctype = Ctype;
    }
    public String getRoute(){
        return Route;
    }
    public void setRoute(){
        this.Route = Route;
    }
    
    public int gettimestamp(){
        return timestamp;
    }
    public void settimestamp(){
        this.timestamp = timestamp;
    }
    
    public int getR_ID(){
        return R_ID;
    }
    public void setR_ID(){
        this.R_ID = R_ID;
    }
    public int getDMid(){
        return DMid;
    }
    public void setDMid(){
        this.DMid = DMid;
    }
    public int getTimeD(){
        return TimeD;
    }
    public void seTimeD(){
        this.TimeD = TimeD;
    }
    
  @Override
  public int hashCode() {
    int hash = 3;
    return hash;
  }   
   
      public String toString(){
        return String.format("No. %-10d %-20s\n %-10d", R_ID, Ctype,timestamp);
    }
}
