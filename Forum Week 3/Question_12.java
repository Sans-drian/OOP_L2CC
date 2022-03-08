public class Question_12 {
    public static void main(String[] args){
        System.out.println("number\tsquare\tcube"); //display column names
        
        for(int i = 0; i < 11; i++){ //use for loop to calculate the numbers 
            System.out.println("\t" + i + "\t" + Math.round(Math.pow(i,2)) + "\t\t" + Math.round(Math.pow(i,3))); //use math.round to round the numbers up and use math.pow for exponential number.
        }
    }
}
