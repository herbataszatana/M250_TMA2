import ou.*;
/**
 * TMA02 Q3
 * @author (Anna Duncan) 
 * @version (27.01.21)
 */
public class Dog extends Pet implements Lovable 
{
   // instance variables
   private int happiness;
   private int energyLevel;

   /**
    * Constructor for objects of class Dog
    */
   public Dog(String aName, String aDescription)
   {  
      super(aName, aDescription);
      happiness = 2;
      
   }

   /**
    * Getter method for happiness
    */
   public int getHappiness()
   {
      return this.happiness;
   }
      /**
    * Getter method for eneryLevel
    */
   public int getEnergyLevel()
   {
      return this.energyLevel;
   }
   
   /**
    * Helper method
    * happiness decrement method
    * decreases happiness level by 1, where
    * happiness cannot be less than 0
    */ 

   
   public void decrementHappiness()
   {  if (happiness > 0) 
         {happiness =this.getHappiness() - 1;}
      else 
         ;
   }
   /**
    * Helper method
    * happiness increment method
    * increases happiness level by 1
    */

   public void incrementHappiness(){
      happiness =this.getHappiness() + 1;
   }
    /**
    * Helper method
    * energyLevel decrement method
    * decreses energyLevel level by 1
    * energyLevel cannot be less than 0
    */ 
  
   public void decrementEnergyLevel()
      {  if (energyLevel > 0) 
         {energyLevel =this.getEnergyLevel() - 1;}
      else 
         ;
   }
    /**
    * Helper method
    * energyLevel increment method
    * increasess energyLevel level by 1
    */ 
   public void incrementEnergyLevel(){
      energyLevel =this.getEnergyLevel() + 1;
   }
   
   /**
    * Public instance method  walkies()which takes no 
    * argument and returns no value. The method 
    * repeatedly (as long as energyLevel is above 0)
    * print out "I'm going for a walk!", increase 
    * happiness by 1, then print out "I'm getting 
    * hungry" and decrement energyLevel by 1.
    */
   public void walkies(){
      while (this.getEnergyLevel()> 0)
      {
           System.out.println("I'm going for a walk!");
           this.incrementHappiness();
           System.out.println("I'm getting hungry");
           this.decrementEnergyLevel();          
      }
   }
   
    /**
    * Public instance method called sleep() which 
    * takes no argument and returns a boolean value. The method 
    * returns true if happiness is above 0 and energyLevel 
    * is above 0. If happiness is 0 the method prints 
    * out "Not happy, can't sleep" and returns false. 
    * If energyLevel is 0 the method prints out 
    * "Hungry, can't sleep" and returns false.
    */

   public boolean sleep(){
      boolean ret = true ;
      if ((this.getHappiness()> 0) && ((this.getEnergyLevel() > 0)))
      {
         ret = true; 
      }

      else if (this.getHappiness()==0)
      {
          System.out.println("Not happy, can't sleep");
          ret = false;
      }
      
      else if (this.getEnergyLevel()==0)
      {
          System.out.println("Hungry, can't sleep");
          ret = false;
      }

      return ret; 
   }
   
   /**
    * Method for noWalkies() takes no argument and return no value. It
    * it prints out “No walkies :-(” and decreases happiness by 1)
    */
   public void noWalkies()
   {
      if(this.getHappiness() > 0){
      System.out.println("No walkies :-(");
      happiness = this.getHappiness() - 1;}
      else {;}
   }
   
   /** 
  * stub for stroke() method, returns no value
  */
public void stroke()
{
}
/** 
  * stub for canStroke() method, returns false
  */
public boolean canStroke()
{
  return false;
}
/** 
  * stub for feed() method, returns no value
  */
public void feed()
{
}
   }

