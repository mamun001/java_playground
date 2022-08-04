// my code for codeacademy

public class MultAndDivide {
  public static void main(String[] args) {   
    double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal * (1.0 + tax);
    System.out.println(total);
    double perPerson = total / 4.0;
    System.out.println(perPerson);
	}
}
