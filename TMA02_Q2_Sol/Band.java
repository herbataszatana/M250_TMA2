
/**
 * Band is a composite class
 * 
 * @author (Anna Duncan) 
 * @version (25.01.21)
 */
public class Band 
{
   // instance variables 
   private String name; // name of the band
   private int yearFounded; // year it was founded
   private String location; // place it was founded
   private Genre genre; // genre of music, has=a relationsh

   /**
    * Constructor for objects of class Band
    */
   public Band(String aName, int aYear, String aLocation, Genre theGenre)
   {
      this.name = aName;
      this.yearFounded = aYear;
      this.location = aLocation;
      this.genre = theGenre;
   }
   
   /**
    * Setter method for band's name
    */
   public void setBandName (String aName){
      this.name = aName;
   
   }
   
   /** 
    * Getter method for band's name
    */
   public String getBandName(){
      return this.name; 
   }
   /**
    * Setter method for when band was formed
    */
   public void setAYear(int aYear){
      this.yearFounded = aYear; 
   }
   /**
    * Returns year band was founded
    */
   public int getAYear(){
      return this.yearFounded;
   }
    /**
    * Getter method for genre of band
    */
   public String getBandGenre() {
      return genre.getGenreName();
      
   }
   /**
    * Returns true if bands are playing genre rock and false if not
    */
   public boolean iWantToRock(){
   {  
      if (getBandGenre() == "rock"){
         return true;
      }
      else {return false;}
      
   }
   }
   /**
    * Genre name setter method
    */
   public void setGenreName(String theGenre){
      this.genre.setGenreName(theGenre);
   }
   /**
    * \year of the genre beginning 
    */
   public void setFYear(int theYear){
      this.genre.setOriginated(theYear);
   }
    /**
    * Returns a string describing this object. 
    */
   public String toString()
   {
      return "Name: " + this.name + ", Year founded: " + this.yearFounded + ", Origin: " + this.location + ", Playing genre: " + this.getBandGenre() + ".";                
   }  
   }
