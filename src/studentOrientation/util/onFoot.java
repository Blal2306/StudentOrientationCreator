package studentOrientation.util;

public class onFoot implements campusTour, time, cost, carbonFootprint, effort {

    //*** INSTANCE VARIABLES ***//
    int time; //minutes
    double cost;
    double carbonFootprint; //tonnes of CO2
    double effort; //calories
    
    public onFoot()
    {
        time = 60;
        cost = 0.10;
        carbonFootprint = 1.02;
        effort = 200;
    }
    public int getTime() {
        return time;
    }

    public double getCost() 
    {
        return cost;
    }

    public double getCarbonFootprint() 
    {
        return carbonFootprint;
    }
    
    public double getEffort() 
    {
        return effort;
    }
    
}
