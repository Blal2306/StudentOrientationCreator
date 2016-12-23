package studentOrientation.util;

public class queue implements dorm, time, cost, carbonFootprint, effort {

    //*** INSTANCE VARIABLES ***//
    int time; //minutes
    double cost;
    double carbonFootprint; //tonnes of CO2
    double effort; //calories
    
    public queue()
    {
        time = 60;
        cost = 3000;
        carbonFootprint = 2.90;
        effort = 200;
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

    public double getEffort() 
    {
        return effort;
    }
    
}
