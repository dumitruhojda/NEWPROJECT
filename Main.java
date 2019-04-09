
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //   1. Write a Java program to print 'Hello' on screen and then print your
      //       name on a separate line

      //2. Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the
        //sum of the two numbers
        int adition = 7 + 8;
        System.out.println("The adition is :");
        System.out.println(adition);

//3. Write a Java program to divide two numbers and print on the screen.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int a = input.nextInt();
        System.out.println("Enter The Second Number:");
        int b = input.nextInt();
        int c = (a / b);
        System.out.println("the division is:" + c);
        //4. Write a Java program to print the result of the following operations:

    }

}
