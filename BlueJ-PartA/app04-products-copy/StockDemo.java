import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * edited by Joshua Mynard
 * @version 2016.02.29
 */
public class StockDemo
{
    public static final int FIRST_ID = 101;
    
    // The stock manager.
    private StockManager manager;
    
    private Random generator;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        generator = new Random();
        this.manager = manager;
        
        int id = FIRST_ID;
        manager.addProduct(new Product(id, "Clock Radio"));
        id++;
        manager.addProduct(new Product(102, "Mobile Phone"));
        manager.addProduct(new Product(103, "Microwave Oven"));
        manager.addProduct(new Product(104, "Toaster Oven"));
        manager.addProduct(new Product(105, "Kettle"));
        manager.addProduct(new Product(106, "Vaccum Cleaner"));
        manager.addProduct(new Product(107, "Hair Dryer"));
        manager.addProduct(new Product(108, "Straighteners"));
        manager.addProduct(new Product(109, "Blender"));
        manager.addProduct(new Product(110, "Juicer"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        // Show details of all of the products.
        manager.printALLProducts();
        
        demoDelivery();
        demoSell();
        manager.printALLProducts();
    }
    private void demoDelivery()
    {
      printHeading("Delivery");
     
      int amount = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(6) + 1;
            manager.deliverProduct(id, amount);
            amount++;
        }
   }
   private void demoSell()
    {
        printHeading("Sell");
        
        int amount = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(6) + 1;
            manager.sellProduct(id, amount);
        }
}

   private void printHeading(String verb)
    {
        System.out.println("============");
        System.out.println("Demonstrating Product " + verb);
        System.out.println("============");
    }
}
