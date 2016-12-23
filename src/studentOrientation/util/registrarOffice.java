package studentOrientation.util;

public class registrarOffice implements registerCourses, time, cost, carbonFootprint, effort{
    
    //*** INSTANCE VARIABLES ***//
    int time; //minutes
    double cost;
    double carbonFootprint; //tonnes of CO2
    double effort; //calories

    public registrarOffice()
    {
        time = 30;
        cost = 4850;
        carbonFootprint = 2.45;
        effort = 300;
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
