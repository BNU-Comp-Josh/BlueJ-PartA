import java.util.Date;
/**
 * Write a description of class Ticket here.
 * Ticket class stores information about the multiple tickets being offered 
 * by the machine, including price, location and date issued
 * @author (Josh Mynard)
 * @version (a version number or a date)
 */
public class Ticket
{
   //Attributes 
   private String destination;
   
   // currency in pence
   private int price; 
   
   private Date issueDateTime;
  
   
   
   /**
    * Acts as a constructor for objects of class Ticket for setting the price 
    * and destination, the date will take the currently used systems date
    * and time
    */
   
   public Ticket(String destination, int price)
   {
       this.destination = destination;
       this.price = price;
       issueDateTime = new Date();
       
    }
   public int getPrice()
   {
       return price;
    }
    public String getDestination()
    {
        return destination;
    }
    /** 
     * prints all details of the ticket like date, location and price 
     */
    public void print()
    {
        System.out.println();
        System.out.println("Ticket to " + destination +
            " Price : " + price + " pence " + 
            " Issued " + issueDateTime);
        System.out.println();
        }
    
        
   
}
