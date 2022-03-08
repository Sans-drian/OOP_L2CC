import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of seconds to change: "); //print to ask user for input on how many seconds they want to convert into hours, minutes, and seconds

        int seconds = input.nextInt(); //take input
        int hour, minute, second = seconds; //initialize hour, minute, and second variables

        if(second < 3600){ //check if the input is less than 3600, if so, the hour will be 0
            hour = 0;
        } else{ //if not, convert the seconds into hours
            hour = second / 3600; 
            second -= hour * 3600;
        }
        if(second < 60){ //check if input is less than 60, if so, the minutes should be 0
            minute = 0;
        } else{ //if not, change the input (seconds) into minutes
            minute = second / 60;
            second -= minute * 60;
        }

        System.out.println( "Converting " + seconds + " second(s) becomes "+ hour +" hour(s), " + minute + " minute(s), and "+ second +" second(s)."); //print results

        input.close();
    }
}

