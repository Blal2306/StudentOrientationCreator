package studentOrientation.util;

public class computerLabEngineeringBuilding implements registerCourses, time, cost, carbonFootprint, effort {
    
    //*** INSTANCE VARIABLES ***//
    int time; //minutes
    double cost;
    double carbonFootprint; //tonnes of CO2
    double effort; //calories

    public computerLabEngineeringBuilding()
    {
        time = 15;
        cost = 5000;
        carbonFootprint = 3.78;
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
