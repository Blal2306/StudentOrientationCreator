package studentOrientation.pattern;

import studentOrientation.enums.bookStoreType;
import studentOrientation.enums.courseRegister;
import studentOrientation.enums.dormType;
import studentOrientation.enums.tourType;

public interface orientationPlan {
    public void addCampusTour();
    public void addBookStore();
    public void addDorm();
    public void addCourses();
    
    //**** ACCESSOR METHODS  *****//
    public int getTotalTime();
    public double getTotalCost();
    public double getTotalCarbonFootprint();
    public double getTotalEffort();
    
    //*** DISPLAY METHODS *****//
    public void displayTotalTime();
    public void displayTotalCost();
    public void displayTotalCarbonFootprint();
    public void displayTotalEffort();
    public void displayAll();
}
