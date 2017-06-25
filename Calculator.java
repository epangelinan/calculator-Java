import java.io.Console;

public class Calculator {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter an integer");
    String stringNumberOne = myConsole.readLine();

    System.out.println("Enter another integer");
    String stringNumberTwo = myConsole.readLine();

    Integer numberOne = Integer.parseInt(stringNumberOne);
    Integer numberTwo = Integer.parseInt(stringNumberTwo);

    Integer numbersAdded = numberOne + numberTwo;
    String stringNumbersAdded = Integer.toString(numbersAdded);

    Integer numbersMultiplied = numberOne * numberTwo;
    String stringNumbersMultiplied = Integer.toString(numbersMultiplied);

    Integer numbersSubtracted = numberOne - numberTwo;
    String stringNumbersSubtracted = Integer.toString(numbersSubtracted);

    Float numbersDivided = (float)numberOne / numberTwo;
    String stringNumbersDivided = Float.toString(numbersDivided);


    System.out.println("Integers added: " + stringNumbersAdded);
    System.out.println("Integers subtracted: " + stringNumbersSubtracted);
    System.out.println("Integers multiplied: " + stringNumbersMultiplied);
    System.out.println("Integers divided: " + stringNumbersDivided);
  }
}
