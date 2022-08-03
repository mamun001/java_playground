// tested on jdoodle

// Author Mamun Rashid

import java.util.Scanner;


//CLASS
public class Main {
    
    

    // MAIN METHOD, not class , below) 
    public static void main(String[] args) {
         
        // System.out.println("Enter Your Favorite IntegerNumber: ");
        
        
        
        Animal Pet1 = new Animal(4,"Black");
        
        int XX = Pet1.getLegs();
        String YY = Pet1.getColor();
        System.out.println("Pet1 Legs: " + XX);
        System.out.println("Pet1 Color: " + YY);
        
        Pet1.setLegs(2);
        int XN = Pet1.getLegs();
        System.out.println("NEW Pet1 Legs: " + XN);
        
        Pet1.setColor("White");
        String YN = Pet1.getColor();
        System.out.println("NEW Pet1 Color: " + YN);
        
        
    } // end of method main
    

} // end of class MAIN
//________________________________________________________________________

//Start of class Anirmal



class Animal {
    public int legs = 0;
    public String color = "Undefined";
    
    //Getter: How Many Legs
    public int getLegs() {
            return this.legs;
        }
    
    //Getter: Color
    public String getColor() {
            return this.color;
        }
    
    // Setter: # of Legs
    public void setLegs(int newLegsvalue){
        this.legs = newLegsvalue;
    }
    
    // Setter Color
    public void setColor(String newColorvalue){
        this.color = newColorvalue;
    }
    
    //constructor
    public Animal(int l, String cl ) {
        legs = l;
        color = cl;
    
    
    }
}
