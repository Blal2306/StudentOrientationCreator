package studentOrientation.pattern;

import studentOrientation.enums.bookStoreType;
import studentOrientation.enums.courseRegister;
import studentOrientation.enums.dormType;
import studentOrientation.enums.tourType;
import studentOrientation.util.bookStore;
import studentOrientation.util.busRide;
import studentOrientation.util.campusTour;
import studentOrientation.util.computerLabEngineeringBuilding;
import studentOrientation.util.dorm;
import studentOrientation.util.mandoBooks;
import studentOrientation.util.onFoot;
import studentOrientation.util.onlineGamingContest;
import studentOrientation.util.queue;
import studentOrientation.util.registerCourses;
import studentOrientation.util.registrarOffice;
import studentOrientation.util.universityBookStore;

public class orientation implements orientationPlan 
{

    private campusTour t;
    private bookStore b;
    private dorm d;
    private registerCourses c;
    
    //*** INSTANCE VARIABLES ***//
    tourType TOUR_TYPE;
    bookStoreType BOOK_STORE_TYPE;
    dormType DORM_TYPE;
    courseRegister BOOK_REGISTER_TYPE;
    //**************************//
    
    //constructor - which is going to take all the different types of things
    public orientation(tourType x, bookStoreType y, dormType z, courseRegister t)
    {
        TOUR_TYPE = x;
        BOOK_STORE_TYPE = y;
        DORM_TYPE = z;
        BOOK_REGISTER_TYPE = t;
    }
    //**********************************************************************
    public void addCampusTour() 
    {
        if(TOUR_TYPE == tourType.bus)
        {
            t = new busRide();
        }
        else if(TOUR_TYPE == tourType.onFoot)
        {
            t = new onFoot();
        }
    }

    public void addBookStore() 
    {
        if(BOOK_STORE_TYPE == bookStoreType.universityBookStore)
        {
            b = new universityBookStore();
        }
        else if(BOOK_STORE_TYPE == bookStoreType.mandoBooks)
        {
            b = new mandoBooks();
        }
    }

    public void addDorm() {
        
        if(DORM_TYPE == dormType.queue)
        {
            d = new queue();
        }
        else if(DORM_TYPE == dormType.onlineGamingContest)
        {
            d = new onlineGamingContest();
        }
    }

    public void addCourses() 
    {
        if(BOOK_REGISTER_TYPE == courseRegister.registrarOffice)
        {
            c = new registrarOffice();
        }
        else if(BOOK_REGISTER_TYPE == courseRegister.computerLabEngineeringBuilding)
        {
            c = new computerLabEngineeringBuilding();
        }
    }

    public int getTotalTime() {
        int total = 0;
        total = t.getTime() + b.getTime() + d.getTime()+ c.getTime();
        return total;
    }

    public double getTotalCost() {
        double total = 0;
        total = b.getCost() + t.getCost() + d.getCost() + c.getCost();
        return total;
    }

    public double getTotalCarbonFootprint() {
        double total = 0;
        total = t.getCarbonFootprint() + b.getCarbonFootprint() + d.getCarbonFootprint()
                + c.getCarbonFootprint();
        return total;
    }

    public double getTotalEffort() {
        double total = 0;
        total = t.getEffort()+b.getEffort()+d.getEffort()+c.getEffort();
        return total;
    }

    public void displayTotalTime() {
        System.out.println("TOTAL TIME: "+getTotalTime()+" MINUTES");
    }

    public void displayTotalCost() {
        System.out.println("TOTAL COST: $"+getTotalCost());
    }

    public void displayTotalCarbonFootprint() 
    {
        System.out.println("TOTAL CO 2: "+getTotalCarbonFootprint());
    }

    public void displayTotalEffort() {
        System.out.println("TOTAL CALORIES : "+getTotalEffort());
    }
    public void displayAll()
    {
        
    }
    
    public String toString()
    {
        System.out.println("TOUR TYPE : " + t.getClass());
        System.out.println("BOOK STORE TYPE : " + b.getClass());
        System.out.println("DORM TYPE : " + d.getClass());
        System.out.println("REGISTRATION METHOD : "+c.getClass()+"\n");
        displayTotalTime();
        displayTotalCost();
        displayTotalCarbonFootprint();
        displayTotalEffort();
        String out = "\n";
        return out;
    }
    
}
