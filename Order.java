/**
   Class program
*/
public class Order
{
   //private field
   private int quantity;
   private Desk deskType;// aggregation

   // non-arg constructor
   /**
      <discription>
   */
   public Order()
   {
      quantity = 0;
   }
   // arg constructor
   /**
      <discription>
      @param value
   */
   public Order( int amount , Desk info)
   {
      quantity = amount;
      deskType  =new Desk(info);// aggregation deep copy
   }
   // methods
         //Setter
   public void setQuantity(int amount)
   {
      quantity = amount;
   }
   
   //Getter
   public int getQuantity()
   {
      return quantity;
   }
   
   public double getDiscount()
   {
      final double DISCOUT_PERCENT = 12.5;
      final int CHERRY_DISCOUNT_BULK = 10;
      final int OAK_DISCOUNT_BULK = 12;
      final int PINE_DISCOUNT_BULK = 15;
      
      double discount = 0.0;
      double price = deskType.getPrice();
      
      if(deskType.getDeskChoice().equals("Cherry"))
      {
         if (quantity > CHERRY_DISCOUNT_BULK)
         {
            discount = deskType.getPrice() * (100 - DISCOUT_PERCENT)/100;
         }
      }
      if(deskType.getDeskChoice().equals("Oak"))
      {
         if (quantity > OAK_DISCOUNT_BULK)
         {
            discount = deskType.getPrice() * (100 - DISCOUT_PERCENT)/100;
         }
      }
      if(deskType.getDeskChoice().equals("Pine"))
      {
         if (quantity > PINE_DISCOUNT_BULK)
         {
            discount = deskType.getPrice() * (100 - DISCOUT_PERCENT)/100;
         } 
      }
      else 
      {
         discount = price;
      }
      return discount;
   }
   // discount*quantity
   public double getTotal()
   {
      return quantity * getDiscount();
   }
   
   //Others Methods
   public String toString()
   {
      return deskType.toString() + "Quantity: "+ quantity+ "\n"+
              "Discounted Desk Price: $" + getDiscount() + "\n"+
              "Total Order Cost: $ " + getTotal() ;
   }
}