/**
   aggeragation class
   Need the copy constructor
*/
public class Desk
{
   // Private Varables 
   private int deskChoice;
   private int drawers;
   /**
      no-arg constructor
   **/
   public Desk()
   {
      deskChoice = 0;
      drawers = 0;
   }
   public Desk(int choice, int num)
   {
      deskChoice = choice;
      drawers = num;
   }
   /**
      copy constructor
   **/
   public Desk(Desk obj)
   {
      deskChoice = obj.deskChoice;
      drawers = obj.drawers;
   }
   // Methods
         // setter methods
   public void setDeskChoice(int choice)
   {
      deskChoice = choice;
   } 
   public void setDrawers(int num)
   {
      drawers = num;
   }
         // getter methods
   public String getDeskChoice()
   {
      String choice;
      switch(deskChoice)
      {
         case 1:
            choice = "Cherry";
            break;
         case 2:
            choice = "Oak";
            break;
         case 3:
            choice = "Pine";
            break;
         default:
            choice = "error";
            break;
      }
      return choice;
   }
   public int getDrawers()
   {
      return drawers;
   }
   
   public double getPrice()
   {
      final double BASE_PRICE_CHERRY = 575.00;
      final double BASE_PRICE_OAK = 425.00;
      final double BASE_PRICE_PINE = 250.00;
      final double CHERRY_LOW_MAX = 65.75;
      final double CHERRY_HIGH_MAX = 61.50;
      final double OAK_LOW_MAX = 55.40;
      final double OAK_HIGH_MAX = 52.85;
      final double PINE_LOW_MAX = 45.15;
      final double PINE_HIGH_MAX = 43.25;
      double price = 0.0;
      double additonal = 0.0;
      
      if (getDeskChoice().equals("Cherry"))
      {
         price = BASE_PRICE_CHERRY;
         if(drawers >= 3 && drawers < 6)
         {
            additonal = drawers * CHERRY_HIGH_MAX;
         }
         else 
         {
            additonal = drawers * CHERRY_LOW_MAX;
         }
      }
      if(getDeskChoice().equals("Oak"))
      {
         price = BASE_PRICE_OAK;
         if(drawers >= 3 && drawers < 6)
         {
            additonal = drawers * OAK_HIGH_MAX;
         }
         else 
         {
            additonal = drawers * OAK_LOW_MAX;
         }
      }
      if(getDeskChoice().equals("Pine"))
      {
         price = BASE_PRICE_PINE;
         if(drawers >= 3 && drawers < 6)
         {
            additonal = drawers * PINE_HIGH_MAX;
         }
         else 
         {
            additonal = drawers * PINE_LOW_MAX;
         }
      }
      return price + additonal;
   }
   
   //Other methods
   public String toString()
   {
      return "Type of Wood: " + getDeskChoice() + "\n" +
             "Number of drawers: " + getDrawers() + "\n" +
             "Regular Price:" + getPrice() + "\n";
   }
}// body bracket