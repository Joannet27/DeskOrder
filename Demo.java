import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
   The main class that display and run the object codes
*/
public class Demo
{
   public static void main(String[]arg)
   {
      Scanner keyboard = new Scanner(System.in);
      //arraylist
      
     // variables
      int deskType;
      int drawerCount;
      
      int deskQuantity;
      double expensive = 0.0;
      
      String input;
      ArrayList<Order> orderList = new ArrayList<Order>(); // array list
     // asking user for input
      do
      {
         System.out.println("Type of Wood:\n1. Cherry\n2. Oak\n3. Pine");
         System.out.print("Select the type of wood: ");
         deskType = keyboard.nextInt();
         while(deskType <= 0 || deskType > 3)
         {
            System.out.print("error Try again: ");
            deskType = keyboard.nextInt();
         }
      
         System.out.print("Enter the number of drawers: ");
         drawerCount = keyboard.nextInt();
         while(drawerCount > 6)
         {
            System.out.print("error high Try again: ");
            drawerCount = keyboard.nextInt();
            while(drawerCount < 0)
            {
               System.out.print("error low Try again: ");
               drawerCount = keyboard.nextInt();
            }
         }
      
         System.out.print("Enter the number of desks you wish to purchase: ");
         deskQuantity = keyboard.nextInt();
         while(deskQuantity <= 0)
         {
            System.out.print("error cant less than 0 Try again: ");
            deskQuantity = keyboard.nextInt();
         }
         keyboard.nextLine();//buffer
         System.out.print("Would you like to enter another order for desks (Y/N)?: ");
         input = keyboard.nextLine();
         System.out.println();
      
         Desk desks = new Desk (deskType, drawerCount);
         Order orders = new Order(deskQuantity, desks);
         orderList.add(orders);
         
      
      }while(input.equalsIgnoreCase("Y"));
      
      System.out.println("Desk Orders Report \n");
      int i;
      for(i = 0; i < orderList.size(); i++)
      {
         System.out.println();
         System.out.println(orderList.get(i));
         // looking for the expensive order
         if(orderList.get(i).getDiscount() > expensive)
         {
            expensive = orderList.get(i).getDiscount();
         }
      
      }//for loop
      System.out.printf("\nOut of the " + i +" orders that were placed, the most expensive desk sold cost $ %.2f", expensive);
    
   }
}