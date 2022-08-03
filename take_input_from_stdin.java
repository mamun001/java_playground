import java.util.Scanner;


// Tested on Jdoodle

//CLASS
public class Main {
    
    static Scanner userInput = new Scanner(System.in);

    // MAIN METHOD, not class , below) 
    public static void main(String[] args) {
         
        System.out.println("Enter Your Favorite IntegerNumber: ");
        
        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();
            System.out.println("Your Favorite IntegerNumber is: " + numberEntered);
            
        }
        
    }
    


}

