/* Create a conditional expression that evaluates to string "negative" if userVal is less than 0, and 
"non-negative" otherwise. Ex: If userVal is -9, output is: -9 is negative.
 
Ex1: 
 
if (x < 0) {
   x = -x;
}
else {
   x = x;
}

Ex2:


public class ConditionalTest {
   public static void main (String [] args) {
      int myNumber;
      int yourNumber;
      
      myNumber = 3;
      yourNumber = (myNumber > 6) ? 8 : 4;

      System.out.println(yourNumber);
   }
}

OUTPUT: if myNumber = 3, then myNumber < 6 so false -> myNumber = 4
 
 */

import java.util.Scanner;

public class UpdateNumberOfUsers {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numUsers;
      int updateDirection;

      numUsers = scnr.nextInt();
      updateDirection = scnr.nextInt();

      /* Your solution goes here  */
      
      if (updateDirection == 1) {
      numUsers++;
      }
      else {
      numUsers--;
      }

      System.out.println("New value is: " + numUsers);
   }
}

