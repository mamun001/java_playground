
// Test on jdoodle

// Author: Mamun Rashid



import java.util.Scanner;


//CLASS
public class Main {
    
    

    // MAIN METHOD, not class , below) 
    public static void main(String[] args) {
         
        // System.out.println("Enter Your Favorite IntegerNumber: ");
        
        
        
        Dog Mydog1 = new Dog(4,"Red","Dr. Smith");
        
        int XX = Mydog1.getLegs();
        String YY = Mydog1.getColor();
        String ZZ = Mydog1.getVet();
        System.out.println("Mydog1 Legs: " + XX);
        System.out.println("Mydog1 Color: " + YY);
        System.out.println("Mydog1 Vet: " + ZZ);
        
        Mydog1.setLegs(3);
        int XN = Mydog1.getLegs();
        System.out.println("NEW Pet1 Legs: " + XN);
        
        Mydog1.setColor("White");
        String YN = Mydog1.getColor();
        System.out.println("NEW Mydog1 Color: " + YN);
        
        Mydog1.setVet("Dr. Williewonka");
        String ZN = Mydog1.getVet();
        System.out.println("NEW Mydog1 Vet: " + ZN);
        
    } // end of method main
    

} // end of class MAIN

//_________________________________________________________
// START of class Animal = superclass



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
    
    //no-arg constructor forsubclasses
    Animal(){}
}
// END OF ANIMAL CLASS: super class
//________________________________________________________

// START OF CLASS DOG: subclass


class Dog extends Animal {
    public Dog(int legs, String color, String vet) {
        // TODO Auto-generated constructor stub
    }

    public String Vet = "Dr. Nobody";
    
    //Getter: Vet Name
    public String getVet() {
            return this.Vet;
        }
    
 // Setter Vet
    public void setVet(String newVetvalue){
        this.Vet = newVetvalue;
    }
}

// END OF DOG CLASS
