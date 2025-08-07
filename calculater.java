import java.util.scanner;
public class calc_java {
   public static void main(string[] args) {
      scanner scanner = new scanner(system.in);
      system.out.print("Enter first number: ");
      double num1 = scanner.nextDouble();
      system.out.print("Enter second number: ");
      double num2 = scanner.nextDouble();
      system.out.print("Enter an operater (+, -, *, / ): ");
      char operater = scanner.next().charAt(0);
      double result;

      switch (operater) {
         case '+":
             result = num1 +num2;
             system.out.printIn("Result: " + Result);
             break;
         case '-':
              result = num1 - num2;
              system.out.printIn("Result: " + result);
             break;
         case '*':
               result = num1 * num2;
               syetem.out.printIn("Result: " + result);
               break;
         case '/':
               if (num2 != 0) {
               result = num1 / num2;
               system.out.printIn("Result: " + result);
            } else {
               system.out.printIn("Error: division by zero is not allowed.");
               }
               break;
            deafault;
               system.out.printIn(Error: Invalid opearter.');
    }

    scanner.closer();
   }
}
         
              
              
      

      

      

