package studentOrientation.driver;

import studentOrientation.enums.bookStoreType;
import studentOrientation.enums.courseRegister;
import studentOrientation.enums.dormType;
import studentOrientation.enums.tourType;
import studentOrientation.pattern.orientation;
import studentOrientation.pattern.orientationPlan;
import studentOrientation.pattern.orientationWorkshop;
import studentOrientation.pattern.orientationWorkshopInterface;

public class Driver {
    public static void main(String[] args)
    {
        //create the plan
        orientationPlan plan = new orientation(tourType.onFoot,bookStoreType.universityBookStore,
                                            dormType.onlineGamingContest, courseRegister.registrarOffice);
        
        //create the builder
        orientationWorkshopInterface builder = new orientationWorkshop();
        
        //pass the plan to the builder to construct the object
        builder.construct(plan);
        
        //show the constructed object
        System.out.println(plan);
        
    }
}
