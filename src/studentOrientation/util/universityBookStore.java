package studentOrientation.util;

public class universityBookStore implements bookStore, time, cost, carbonFootprint, effort {

    //*** INSTANCE VARIABLES ***//
    int time; //minutes
    double cost;
    double carbonFootprint; //tonnes of CO2
    double effort; //calories
    
    //constructor
    public universityBookStore()
    {
        time = 20;
        cost = 500;
        carbonFootprint = 1.08;
        effort = 100;
    }
    public int getTime() {
        return time;
    }

    public double getCost() {
        return cost;
    }

    public double getCarbonFootprint() 
    {
        return carbonFootprint;
    }

    public double getEffort() {
        return effort;
    }
    
}
