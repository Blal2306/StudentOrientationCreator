package studentOrientation.util;

public class onlineGamingContest implements dorm, time, cost, carbonFootprint, effort {
    
    //*** INSTANCE VARIABLES ***//
    int time; //minutes
    double cost;
    double carbonFootprint; //tonnes of CO2
    double effort; //calories

    public onlineGamingContest()
    {
        time = 40;
        cost = 3060;
        carbonFootprint = 4.56;
        effort = 30;
    }
    public int getTime() {
        return time;
    }

    public double getCost() {
        return cost;
    }
    
    public double getCarbonFootprint() {
        return carbonFootprint;
    }

    public double getEffort() {
        return effort;
    }
    
    
}
