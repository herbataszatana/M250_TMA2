import ou.*;
/**
 * Class Rocket allows a representation of a rocket to be created in the Shapes
 * Window, and for it to move up the screen.
 * 
 * This class is incomplete.
 * 
 * @author (M250 Course Team) 
 * @modified (Anna Duncan K8748389)
 * @version (25.01.21)
 */
public class Rocket
{   
   private Triangle nose;      // represents the rocket's nose cone
   private Square body;        // represents the rocket's body
   private Circle jet;         // represents the blast from the rocket's engine

   /**
    * Constructor for objects of class Rocket
    */
   public Rocket(Triangle t, Square s, Circle c)
   {
      //first, we store references to the workspace shape objects
      this.nose = t;
      this.body = s; 
      this.jet = c;    

      //sets the initial positions of the nose.
      //The other parts need to be set relative to these positions.
      this.nose.setXPos(50);
      this.nose.setYPos(300);

      //sets the body relative to the nose, using the helper methods
      this.body.setXPos(getBodyXPos());
      this.body.setYPos(getBodyYPos());      

      //The jet is invisible to begin with, because it uses
      //the background colour of WHITE, but you can use BLACK
      //to help you see it while testing
      this.jet.setColour(OUColour.WHITE); 
      this.jet.setDiameter(10);           

      //sets the jet position relative to the body, using the helper methods
      this.jet.setXPos(getJetXPos()); 
      this.jet.setYPos(getJetYPos()); 
   }

   private int getBodyXPos()
   {
     //to be written in Q1(a)(i)
     		int bodyXPos = this.nose.getXPos();     
     		return bodyXPos;
   }

   private int getBodyYPos()
   {
     //to be written in Q1(a)(ii)
     int bodyYPos = this.nose.getYPos() + this.body.getLength() ;  
     return bodyYPos;
   }
   
   private int getJetXPos()
   {
      //to be written in Q1(a)(iii)
     int jetXPos = this.body.getXPos()+(this.body.getLength()/2)-(this.jet.getDiameter()/2);
     return jetXPos;
   }

   private int getJetYPos()
   {
     int jetYPos = this.body.getYPos() + this.body.getLength(); 
     return jetYPos;
   }

   /**
    * Moves the nose of the receiver 
    * by anInt units.
    * Moves other rocket components relative to the 
    * position of the nose.
    */
   public void moveRocketBy(int anInt)
   {
      //to be written in Q1(b)
      this.nose.setYPos(this.nose.getYPos()- anInt );
      this.body.setYPos(getBodyYPos());
      this.jet.setYPos(getJetYPos() );

   }
  /**
    * Sets the diameter of the receiver's jet to 
    * 6, alters its xPos so its centre aligns with the body centre
    * and sets its colour to red.
    */
   public void pulse1()
   {
      //to be written in Q1(c)(i)
      this.jet.setDiameter(6);
      this.jet.setXPos(this.body.getXPos()+(this.body.getLength()/2)-(this.jet.getDiameter()/2));
     this.jet.setYPos(getJetYPos());
      this.jet.setColour(OUColour.RED); 
   }

   /**
    * Sets the diameter of the receiver's jet to 
    * 12, alters its xPos so its centre aligns with the body centre
    * and sets its colour to orange.
    */     
   public void pulse2()
   {
      //to be written in Q1(c)(ii)
      this.jet.setDiameter(12);
      this.jet.setXPos(this.body.getXPos()+(this.body.getLength()/2)-(this.jet.getDiameter()/2));
      this.jet.setYPos(getJetYPos());
      this.jet.setColour(OUColour.ORANGE); 
   }

   /**
    * Sets the diameter of the receiver's jet to 
    * 24, alters its xPos so its centre aligns with the body centre
    * and sets its colour to red.
    */    
   public void pulse3()
   {
      //to be written in Q1(c)(iii)
      this.jet.setDiameter(24);
      this.jet.setXPos(this.body.getXPos()+(this.body.getLength()/2)-(this.jet.getDiameter()/2));
      this.jet.setYPos(getJetYPos());
      this.jet.setColour(OUColour.RED); 
   }

   /**
    * Simulates the ignition of the rocket's jets
    */
   public void ignition()
   {
      //to be written in Q1(d)
      for (int value = 0; value < 5; value++){
      this.pulse1();
      this.delay(200);
      this.pulse2();
      this.delay(200);
      this.pulse3();
      this.delay(200);
      
   }
      
   }

   /**
    * Moves the entire rocket in a loop repeated 
    * 100 times, animating the jet as it goes, so the rocket
    * moves upwards by speed units every 4th iteration
    */
   public void animateRocket(int speed)
   {
      //to be written in Q1(e)
      for (int i = 0; i <100; i++){
            
            for (int i2= 0; i2 <1; i2++){
               this.pulse1();
               this.delay(200);}
            
            for (int i3= 0; i3 <1; i3++){
               this.pulse2();
               this.delay(200);}
            
            for (int i4= 0; i4 <1; i4++){
               this.pulse3();
               this.delay(200);}   
          
           this.moveRocketBy(speed);   
        }
     
   }

   /**
    * Prompts the user to enter the number of units they want the  
    * rocket to move upwards at a time (speed)
    * 
    * If the number of units provided would eventually cause the tip of the  
    * nose to go past the top of the Graphical Display, the user 
    * is informed via a dialogue box that the rocket will not launch.  
    * 
    * Otherwise the rocket launches as required. 
    */
   public void launch()
   {
      //to be written in Q1(f) 
     String speedStr = OUDialog.request("Please enter speed of the rocket. Remember speed can be only positive integer ");
     int speed = Integer.parseInt(speedStr);
     if (((speed *100)-this.nose.getYPos()) <= 0){
        this.ignition();
        this.animateRocket(speed);
      }   
     else{
     OUDialog.alert("The rocket will not launch as the number entered is too large");
     } 
   }

   /**
    * Causes execution to pause by time number of milliseconds
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }
}   