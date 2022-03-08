import java.util.Scanner; //import scanner to be able to take input

public class Question_10 {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in); //declare scanners
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("Enter 3 values to be used to calculate the Mean, Variance, and Standard Deviation (Press Enter after each Number Input): ");
        int v1 = input1.nextInt(), v2 = input2.nextInt(), v3 = input3.nextInt(); //ask for the 3 values

        double mean = (v1 + v2 + v3) / 3; //calculate mean
        double vari = (Math.pow((v1 - mean),2) + Math.pow((v2 - mean),2) + Math.pow((v3 - mean),2)) / 3; //calculate variance
        double stanDev = Math.sqrt((Math.pow(vari, 2))); //calculate standard deviation

        System.out.println("For the 3 numbers you inputted, the Mean is " + mean + ", the Variance is " + vari + ", and the Standard Deviation is " + stanDev); //display the results

        input1.close();
        input2.close();
        input3.close();

    }
}