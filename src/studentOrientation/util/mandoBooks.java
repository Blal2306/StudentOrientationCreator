package studentOrientation.util;

public class mandoBooks implements bookStore, time, cost, carbonFootprint, effort {

    //*** INSTANCE VARIABLES ***//
    int time; //minutes
    double cost;
    double carbonFootprint; //tonnes of CO2
    double effort; //calories
    
    public mandoBooks()
    {
        time = 120;
        cost = 475;
        carbonFootprint = 2.15;
        effort = 500;
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
