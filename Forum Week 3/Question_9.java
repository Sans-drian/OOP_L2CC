import java.util.Scanner; //importing java.util.Scanner to get user input

public class Question_9 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      double celciusInput; //declaring variables.
      double fahrenCalc;

      System.out.println("What is the temp that you want to convert from Celsius to Farenheight?: "); //ask for input.
      celciusInput = input.nextDouble();
      
      fahrenCalc = ((9 * celciusInput)/5) + 32; //calculate/convert celcius input to fahrenheight.

      System.out.println(celciusInput + "\u00B0C is converted to " + fahrenCalc + "\u00B0F"); //print out result.

      input.close();
    }
}
