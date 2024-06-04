import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.println("Inset a number");
    int prime = sc.nextInt();

    if (prime < 0) {
      System.out.print( prime + " False, is not prime number!");
    } 
    else {
      int lowestPrimeNumber = 2;

    for (lowestPrimeNumber = 2; lowestPrimeNumber<prime; lowestPrimeNumber+=1 ) {
      if (prime % lowestPrimeNumber == 0) {
        System.out.println(prime + " False, is not a prime number.");
        break;
      }
    }
      if (lowestPrimeNumber == prime) {
        System.out.println(prime + " True, is prime number");
      }
    }
    
  }

}
