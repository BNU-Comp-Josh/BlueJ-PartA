
/**
 * Write a description of class Course here.
 * This class will hold information of a university course
 * Courses will have an official title and a UCAS course code
 * @author Derek Peacock
 * @version 0.1
 */
public class Course
{
    private String title;
    
    private String codenumber;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codenumber)
    {
      this.title = title;
      this.codenumber = codenumber;
    }

    public void print()
    {
        System.out.println("Course: " + title + " " + codenumber);
    }
}
