package studentOrientation.pattern;

public class orientationWorkshop implements orientationWorkshopInterface 
{
    public void construct(orientationPlan x) 
    {
        x.addCampusTour();
        x.addBookStore();
        x.addDorm();
        x.addCourses();
    }
    
}
