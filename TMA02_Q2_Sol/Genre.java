
/**
 * Write a description of class Genre here.
 * 
 * @author (Anna Duncan) 
 * @version (25.01.21)
 */
public class Genre
{
   // instance variables
   private String genreName;// genre has-a name
   private int originated; // when genre roughly started
   /**
    * Constructor for objects of class Genre
    */
   public Genre(String aGenreName, int aOriginated)
   {
     this.genreName = aGenreName;
     this.originated = aOriginated; 
   }
   public void setGenreName(String aName){
      this.genreName = aName;
   }
   /**
    * Getter method for genre
    */
   public String getGenreName(){
      return this.genreName;
   }
   /**
    * Setter method for date when genre originated
    */
   public void setOriginated(int aOrigin){
      this.originated = aOrigin;  
   }
   /**
    * Getter method for returning date when genre originated
    */
   public int getOriginYear() {
      return this.originated; 
   }
   /**
    * Returns a description of this object as a string.
    */
    public String toString()
    {
       return "Genre " + this.genreName + "has it's beginings in " + this.originated + ".";
    }
}
