public class Question_11 {  
    public static void main(String[] args){
        int x,y,z; //initializing x and y
        x = 19;
        y = 87;
        System.out.println("The initial values are x = " + x + " and y = " + y); 

        z = x; //exchanging values
        x = y;
        y = z;
        System.out.println("After the exchange of values, now x is " + x + " and y is " + y);
    }
}
