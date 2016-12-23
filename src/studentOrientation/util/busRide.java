package studentOrientation.util;

public class busRide implements campusTour, time, cost, carbonFootprint, effort {

    //*** INSTANCE VARIABLES ***//
    int time; //minutes
    double cost;
    double carbonFootprint; //tonnes of CO2
    double effort; //calories
    
    //constructor
    public busRide()
    {
        time = 10;
        cost = 2.00;
        carbonFootprint = 3.03;
        effort = 50;
        
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
