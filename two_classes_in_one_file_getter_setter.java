// tested in jdoodle

// author: Mamun Rashid

import java.util.Scanner;


//CLASS
public class Main {
    
    

    // MAIN METHOD, not class , below) 
    public static void main(String[] args) {
         
        // System.out.println("Enter Your Favorite IntegerNumber: ");
        
        Point pointA = new Point(100, 200);
        
        int XX = pointA.getX();
        int YY = pointA.getY();
        System.out.println("X coordinate: " + XX);
        System.out.println("Y coordinate: " + YY);
        
        pointA.setX(400);
        int XN = pointA.getX();
        System.out.println("NEW X coordinate: " + XN);
        
        pointA.setY(800);
        int YN = pointA.getY();
        System.out.println("NEW Y coordinate: " + YN);
        
        
    } // end of method main
    

} // end of class MAIN

// MAIN CLASS END
// ______________________________________________________________________



class Point {
    public int x = 0;
    public int y = 0;
    
    //Getter X
    public int getX() {
            return this.x;
        }
    
    //Getter Y
    public int getY() {
            return this.y;
        }
    
    // Setter X
    public void setX(int newXvalue){
        this.x = newXvalue;
    }
    
    // Setter Y
    public void setY(int newYvalue){
        this.y = newYvalue;
    }
    
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    
    
    }
}
// END POINT CLASS
