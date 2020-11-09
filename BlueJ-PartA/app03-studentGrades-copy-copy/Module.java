/**
 * Write a description of class module here.
 *
 * @author (Josh Mynard)
 * @version (a version number or a date)
 */
public class Module
{
    // attributes

    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    
    
    /**
     * Constructor for objects of class module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = 0;
        credit = 15;
    }
    
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
        this.mark = mark;
    }
    else
    {
        System.out.print("Invalid Mark");
    }
    
    }
  
    public int getMark()
    {
        return mark;
    }
    
    public void print()
    {
        System.out.println("Module: " + title + " " + codeNo + " Mark = " + mark);
    }
    
}
