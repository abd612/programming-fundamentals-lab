public class RollingDice
{
   public static void main (String[] args)
   {
      Die die1 = new Die();
      
      int d1 = 0, d2 = 0, c1 = 0, c2 = 0;

      //Maximum value of i can be changed from 100 to 1000 to roll the die 1000 times.
      //Here 100 is chosen to make the displaying and verification process easy.
      
      for (int i = 1; i <= 100; i++)
      {
    	  d1 = die1.roll();
    	  
    	  System.out.print("  " + d1);
    	  
    	  if (i % 10 == 0)
    	  {
    		  System.out.println();
    	  }
    	  
    	  if (die1.getFaceValue() == 6)
    	  {
    		  c1++;
    		  
    		  if (d2 == 6)
    		  {
    			  c2++;
    		  }
    	  }
    	  
    	  d2 = d1;
      }
      
      System.out.println("Total sixes: " + c1);
      System.out.println("Consecutive sixes: " + c2);
   }
}
