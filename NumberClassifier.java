import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberClassifier {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a whole number between 1 and 100: ");
    try {
      int userInput = scanner.nextInt();

      if (userInput < 1 || userInput > 100) {
        System.out.println("Invalid input. Please enter a number between 1 and 100.");
      } else {
        String classification = classifyNumber(userInput);
        String parity = getParity(userInput);
        System.out.println("The number " + userInput + " is " + classification + " and " + parity);
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter a whole number.");
    }
  }

  private static String classifyNumber(int number) {
    if (number <= 33) {
      return "LOW";
    } else if (number <= 66) {
      return "SO-SO";
    } else {
      return "HIGH";
    }
  }

  private static String getParity(int number) {
    if (number % 2 == 0) {
      return "even";
    } else {
      return "odd";
    }
  }
}