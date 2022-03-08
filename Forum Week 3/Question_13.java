import java.util.Scanner;

 public class Question_13 {
    public static void main(String[] args){
        Scanner aInput = new Scanner(System.in); //initialize inputs
        Scanner bInput = new Scanner(System.in);
        Scanner cInput = new Scanner(System.in);

        while (true){
            System.out.println("Enter the values a, b and c for ax^2 + bx +c to find the x using the quadratic formula: "); //take input for a, b, c
            double a = aInput.nextDouble();
            double b = bInput.nextDouble();
            double c = cInput.nextDouble();

          if(a == 0){ //if a is 0
              System.out.println("The input value cannot be 0, please try again."); //tell user to re input without a 0
          } else if (a != 0) { //if a is not 0
              double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a); //calculate with quadratic formula
              double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
              System.out.println("The solutions are " + x1 + " and " + x2);
              break;
          } else { 
              System.out.println("Not a number or incorrect input.");
          }          
        }

        aInput.close();
        bInput.close();
        cInput.close();
    }
 }