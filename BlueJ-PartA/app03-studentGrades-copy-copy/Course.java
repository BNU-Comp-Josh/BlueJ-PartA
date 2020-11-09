
/**
 * Write a description of class Course here.
 *
 * @author (Josh Mynard)
 * @version (a version number or a date)
 */
public class Course
{
    //variables 
    private String codeNo;
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    private int finalMark;
    
    private Grades finalGrade;
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        //allows user to set code and title
        this.codeNo = codeNo;
        this.title = title;
        
        module1 = new Module("Programming Concepts" , "CO452");
        module2 = new Module("3D Modelling" , "CO451");
        module3 = new Module("Computer Architectures" , "CO450");
        module4 = new Module("Game Design" , "CO453");
        
        
    }
    
    public void addMark(int mark, int moduleNo)
    {
        //used for adding up a students marks 
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
        else
        { 
            System.out.print("Please enter a valid module");
        }
    }
     public void print()
     {
         //prints details of the course
         System.out.println("Course " + codeNo + " - " + title);
        }
        public Grades convertToGrade(int mark)
     {
         //adds up all grades from modules and converts into a mark 
         if((mark >= 0) && (mark <= 39))
         {
             return Grades.F;
            }
         if((mark >= 40) && (mark <=49 ))
         {
             return Grades.D;
            }
         if((mark >= 50) && (mark <= 59))
         {
             return Grades.C;
            }
        if((mark >= 60) && (mark <= 69))
        {
            return Grades.B;
        }
        if((mark >= 70) && (mark <=100))
        {
            return Grades.A;
        }
        return Grades.X;
    }
     
}