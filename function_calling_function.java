// tested on jdoodle

// CREDIT: Tutorials Point

// CLASS
public class Main {

       public static void main(String[] args) {
           
           int a = 500 ;
           int b = 200 ;
           int c = minFunction(a,b);
           
           System.out.println(a);
           System.out.println(b);
           System.out.println("Minimum of the two numbers above is: " + c);
           
       } // end main method
       
       
       /** the FUNCTION returns the minimum between two numbers */
               // Called in the main class above

       public static int minFunction(int n1, int n2) {
          int min;
          if (n1 > n2)
             min = n2;
          else
             min = n1;

          return min; 
       }
          
    } // end MAIN CLASS

