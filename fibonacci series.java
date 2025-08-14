omport java.util.scanner;

public clas FibonacciNonRecursive {
    public static void main(string[] args) {
        scanner sc = new scanner(system.in);

       system.out.print("Enter the number of terms: ");
       int n = sc.nextInt ();

       int first = 0, second = 1;

       system.out.printIn("Fibonacci  series (non-Recursive): ");

       for (int i = 1; i<= n; i++) {
           system.out.print(first + "");
             int next = first + second ;
             first = second;
            second = next;
    }

       sc.close();
    }
}
