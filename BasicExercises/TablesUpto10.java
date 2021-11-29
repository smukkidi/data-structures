package BasicExercises;
import java.util.Scanner;
public class TablesUpto10{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number for table writing : ");
    int num = sc.nextInt();

    for (int i = 1; i <= 10; i++){
      System.out.println(num + " X " + (i+1) + " = " + (num * (i+1)));
      
      //System.out.println(num * i);
      
    }

    for (int i = 1; i <= 10; i++){
      //System.out.println(num + " X " + (i+1) + " = " + (num * (i+1)));
      
      System.out.println(num * i);
      
    }

  }
}