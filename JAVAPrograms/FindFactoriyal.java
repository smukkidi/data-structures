/**  */

/**
 * Find the Factoriyal of a Number 
 *
 * 1. Start 
 * 2. Create an instance of the Scanner Class 
 * 3. Declare a varible 
 * 4. Ask the user to initialize the variable 
 * 5. Declare a loop variable and another variable to store the factoriyal of the Number 
 * 6. Initialize both the variables to 1. 
 * 7. Use a while loop to calculate the factoriyal 
 * 8. Run the loop to calculate the factoriyal 
 * 9. Update the the Factoriyal in each iteration 
 * 10. Increment the loop variable in each iteration 
 * 11. Print the factoriyal of the Number12. Stop
 * 
 */
import java.util.Scanner;
class FindFactoriyal {

  public static void main (String [] args){
    //Create an instance of the Scanner Class 
    Scanner sc = new Scanner(System.in);
    //Declare a varible 
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    int i = 1, fact=1;
    while(i<=num){
      fact=fact*i;
      i++;
    }
    System.out.println("Factoriyal of the number: "+fact);

    int facto = findFactoriyal(5);

    System.out.println("Facto is : "+facto);

  }

  public static int findFactoriyal(int num){
      int factoriyal = 1;
      System.out.println("Num is : "+num);
    for (int i = 0; i >= num; i++){
      num *= i;
      System.out.println(num);
    }

    return  num;

  }

}